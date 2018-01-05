package skoki;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/wszyscy.txt")
public class WszyscyTxt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		try {
			Class.forName("org.sqlite.JDBC");
			
			try(Connection c = DriverManager.getConnection("jdbc:sqlite:C:/Tools/zawodnicy.db")) {
				try(PreparedStatement stmt = c.prepareStatement("SELECT * FROM zawodnicy")) {
					try(ResultSet rs = stmt.executeQuery()) {
						while(rs.next()) {
							out.printf("* %s %s (%s) %d%n",
									rs.getString("imie"),
									rs.getString("nazwisko"),
									rs.getString("kraj"),
									rs.getInt("wzrost"));
						}
					}
				}
			}		
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			
			out.println("Wyj¹tek " + e);
			e.printStackTrace(out);
		}
	}
}
