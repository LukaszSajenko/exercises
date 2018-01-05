package bazy.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class B08_MasoweDodawanieRekordow {

	public static void main(String[] args) {
		try(Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Tools/zawodnicy.db")) {
			final String sql = "INSERT INTO trenerzy(kraj, imie_t, nazwisko_t)"
				+ " VALUES (?,?,?)";
			
			try(PreparedStatement stmt = c.prepareStatement(sql)) {
				
				System.out.println("Podaj dane trenera: kraj imie nazwisko  , aby zakonczyc wpisz x");
				try(Scanner sc = new Scanner(System.in)) {
					while(true) {
						String kraj = sc.next();
						if("x".equalsIgnoreCase(kraj))
							break;
						
						String imie = sc.next();
						String nazwisko = sc.next();
						
						stmt.setString(1, kraj);
						stmt.setString(2, imie);
						stmt.setString(3, nazwisko);
	
						stmt.addBatch(); // dodaj INSERT-a z bieżącymi parametrami do "skryptu"
					}
					
					stmt.executeBatch(); // wszystkie polecenia ze "skryptu"
					System.out.println("Rekordy zapisane");
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
