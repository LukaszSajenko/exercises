package skoki;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import skoki.baza.BladBazyDanych;
import skoki.baza.DostepDoBazy;
import skoki.model.Zawodnik;

@WebServlet("/baza.txt")
public class BazaTxt extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();

		try(DostepDoBazy db = new DostepDoBazy()) {
			List<Zawodnik> zawodnicy = db.wszyscyZawodnicy();
			for(Zawodnik zawodnik : zawodnicy) {
				out.println(zawodnik);
			}
			
		} catch (BladBazyDanych e) {
			e.printStackTrace();
		}
	}
}
