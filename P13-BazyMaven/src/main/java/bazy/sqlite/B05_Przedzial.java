package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class B05_Przedzial {
	private Connection c;

	public static void main(String[] args) {
		B05_Przedzial program = new B05_Przedzial();
		try {
			program.dzialaj();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void dzialaj() throws SQLException {
		try {
			c = DriverManager.getConnection("jdbc:sqlite:C:/Tools/zawodnicy.db");

			wypiszZawodnikowOWzroscie(170, 175);
			wypiszZawodnikowOWzroscie(180, 190);
		} finally {
			if (c != null) {
				c.close();
			}
		}

	}

	public void wypiszZawodnikowOWzroscie(int min, int max) throws SQLException {
		System.out.println("Czytam zawodników o wzroście od " + min + " do " + max);

		final String sql = "SELECT * FROM zawodnicy WHERE wzrost BETWEEN ? AND ?";
		
		try(PreparedStatement stmt = c.prepareStatement(sql)) {
			stmt.setInt(1, min);
			stmt.setInt(2, max);
			
			try(ResultSet rs = stmt.executeQuery()) {
				while(rs.next()) {
					String imie = rs.getString("imie");
					String nazwisko = rs.getString("nazwisko");
					String kraj = rs.getString("kraj");
					int wzrost = rs.getInt("wzrost");
					System.out.println(imie + " " + nazwisko + " (" + kraj + ") : " + wzrost);
				}
			}
		}

		System.out.println();
	}
}
