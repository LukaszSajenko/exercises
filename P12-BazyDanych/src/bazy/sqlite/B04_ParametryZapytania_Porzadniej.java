package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class B04_ParametryZapytania_Porzadniej {
	private Connection c;

	public static void main(String[] args) {
		B04_ParametryZapytania_Porzadniej program = new B04_ParametryZapytania_Porzadniej();
		try {
			program.dzialaj();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dzialaj() throws SQLException {
		try {
			c = DriverManager.getConnection("jdbc:sqlite:zawodnicy.db");

			while(true) {
				String kraj = JOptionPane.showInputDialog("Podaj kraj");
				if(kraj == null || kraj.isEmpty())
					break;
				kraj = kraj.toUpperCase();
				wypiszZawodnikowZKraju(kraj);
			}
			
		} finally {
			if (c != null) {
				c.close();
			}
		}

	}

	public void wypiszZawodnikowZKraju(String kraj) throws SQLException {
		System.out.println("Czytam zawodników z kraju " + kraj);

		try(PreparedStatement stmt = c.prepareStatement("SELECT * FROM zawodnicy WHERE kraj = ?")) {
			stmt.setString(1, kraj);
			try(ResultSet rs = stmt.executeQuery()) {
				while (rs.next()) {
					String imie = rs.getString(2); // numeracja kolumn od 1
					String nazwisko = rs.getString("nazwisko"); // nazwa albo
																// alias kolumny
					int wzrost = rs.getInt("wzrost");
					System.out.println(imie + " " + nazwisko + " " + wzrost);
				}
			}
		}

		System.out.println();
	}
}
