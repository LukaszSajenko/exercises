package bazy.postgresql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HR01_Odczyt {

	public static void main(String[] args) {
		try(Connection c = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/hr", "hr", "hr")) {
			
			// W URLu mozna nie podawac portu jesli jest standardowy:
			// "jdbc:postgresql://localhost/hr"
			// mozna odwolywac sie do innych serwerow po adresie IP
			// "jdbc:postgresql://10.0.1.14/hr"
			// albo po znawie domeny
			// "jdbc:postgresql://serwer.mojafirma.pl:5432/hr"
			
			final String sql = "SELECT first_name, last_name, salary, hire_date, department_id FROM employees";
			
			try(PreparedStatement stmt = c.prepareStatement(sql);
				ResultSet rs = stmt.executeQuery()) {
				
				while(rs.next()) {
					System.out.printf("%s %s z działu nr %d, zatrudniony %s zarabia %.2f.%n",
							rs.getString(1), rs.getString(2),
							rs.getInt(5), rs.getDate(4), rs.getBigDecimal(3));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
