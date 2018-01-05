package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B02_Odczyt {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:sqlite:zawodnicy.db");
			
			Statement stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM zawodnicy");
			
			System.out.println(rs);
			while(rs.next()) {
				String imie = rs.getString(2);  // numeracja kolumn od 1
				String nazwisko = rs.getString("nazwisko"); // nazwa albo alias kolumny
				int wzrost = rs.getInt("wzrost");
				double waga = rs.getDouble("waga");
				System.out.println(imie + " " + nazwisko + " " + wzrost + " " + waga);
			}
			
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
