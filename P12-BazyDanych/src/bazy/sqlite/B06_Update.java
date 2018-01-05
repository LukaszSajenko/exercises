package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B06_Update {

	public static void main(String[] args) {
		String kraj = "POL";
		int jedzenie = 2;
		
		try(Connection c = DriverManager.getConnection("jdbc:sqlite:zawodnicy.db")) {
			final String sql = "UPDATE zawodnicy SET waga = waga + ? WHERE kraj = ?";
			
			try(PreparedStatement stmt = c.prepareStatement(sql)) {
				stmt.setInt(1, jedzenie);
				stmt.setString(2, kraj);
				
				int ile = stmt.executeUpdate();
				
				System.out.println("Zaktualizowano " + ile +  " rekordów.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
