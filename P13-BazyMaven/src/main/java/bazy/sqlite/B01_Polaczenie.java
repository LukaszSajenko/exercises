package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class B01_Polaczenie {

	public static void main(String[] args) {
		try {
			Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Tools/zawodnicy.db");
			
			System.out.println("Połączenie otwarte. c = " + c);
			System.out.println(c.getMetaData().getDatabaseProductName());
			System.out.println(c.getMetaData().getDatabaseProductVersion());
			
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
