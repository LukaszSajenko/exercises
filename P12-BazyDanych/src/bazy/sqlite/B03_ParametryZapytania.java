package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class B03_ParametryZapytania {
	
	public static void wypiszZawodnikowZKraju(String kraj) {
		System.out.println("Czytam zawodników z kraju " + kraj);
		
		try {
			Connection c = DriverManager.getConnection("jdbc:sqlite:zawodnicy.db");
			
			PreparedStatement stmt = c.prepareStatement("SELECT * FROM zawodnicy WHERE kraj = ?");
			stmt.setString(1, kraj);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {								
				String imie = rs.getString(2);  // numeracja kolumn od 1
				String nazwisko = rs.getString("nazwisko"); // nazwa albo alias kolumny
				int wzrost = rs.getInt("wzrost");
				System.out.println(imie + " " + nazwisko + " " + wzrost);
			}
			
			rs.close();
			stmt.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		String kraj = "POL";
		
		wypiszZawodnikowZKraju(kraj);
		
		
	}
}
