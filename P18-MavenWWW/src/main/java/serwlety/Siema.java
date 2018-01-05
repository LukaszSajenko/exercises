package serwlety;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/Siema", "/witaj.html", "/siema.html"})
public class Siema extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		String imie = request.getParameter("imie");
		
		try(PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html><head><title>Przyk�ad formularza</title>");
			out.println("</head><body>");
			out.println("<h1>Przykład formularza</h1>");
			out.println("<form method='get'>");
			out.println("<label for='imie'>Podaj swoje imi�:</label>");
			out.println("<input type='text' size='10' name='imie'>");
			out.println("<input type='submit' value='Wy�lij'></form>");
			
			if(imie != null) {
				out.printf("<p>Witaj <strong>%s</strong>!</p>%n", imie);
			}
			
			out.println("</body></html>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
