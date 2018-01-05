package skoki.baza;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import skoki.model.Zawodnik;

/* Bardzo uprosczona implementacjia wzroca DAO - data access objects.
 * Byłoby to bardziej sensowne, gdybyśmy czytali różne tabele za pomocą różnych klas.
 */

public class DostepDoBazy implements Closeable {
	private Connection c;
	
	public DostepDoBazy() throws BladBazyDanych {
		// otwieramy połączenie
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:C:/Tools/zawodnicy.db");
		} catch (ClassNotFoundException | SQLException e) {
			throw new BladBazyDanych("Problem podczas łączenia z bazą. " + e.getMessage(), e);
		}
	}
	
	public void close() {
		if(c != null) {
			try {
				c.close();
			} catch (SQLException e) {
				// moze tu zignorujmy...
			}
		}
	}
	
	public List<Zawodnik> wszyscyZawodnicy() throws BladBazyDanych  {
		try(PreparedStatement stmt = c.prepareStatement("SELECT * FROM zawodnicy")) {
			try(ResultSet rs = stmt.executeQuery()) {
				return zawodnicyZResultSet(rs);
			}
		} catch (SQLException e) {
			throw new BladBazyDanych("Problem z zapytaniem", e);
		}
	}

	public List<Zawodnik> zawodnicyZKraju(String kraj) throws BladBazyDanych  {
		try(PreparedStatement stmt = c.prepareStatement("SELECT * FROM zawodnicy WHERE kraj = ?")) {
			stmt.setString(1, kraj);
			try(ResultSet rs = stmt.executeQuery()) {
				return zawodnicyZResultSet(rs);
			}
		} catch (SQLException e) {
			throw new BladBazyDanych("Problem z zapytaniem", e);
		}
	}

	private List<Zawodnik> zawodnicyZResultSet(ResultSet rs) throws SQLException {
		List<Zawodnik> lista = new ArrayList<>();
		while(rs.next()) {
			Zawodnik z = new Zawodnik(rs.getInt("id_skoczka"),
					rs.getString("imie"),
					rs.getString("nazwisko"),
					rs.getString("kraj"),
					rs.getInt("wzrost"),
					rs.getInt("waga"));
			lista.add(z);
		}
		return lista;
	}
}
