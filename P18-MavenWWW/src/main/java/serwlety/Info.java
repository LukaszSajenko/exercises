package serwlety;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Info")
public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");		
		try(PrintWriter out = response.getWriter()) {
			out.println("Dane z zapytania:");
			out.println("RequestURI: " + request.getRequestURI());
			out.println("LocalName: " + request.getLocalName());
			out.println("LocalAddr (adres serwera): " + request.getLocalAddr());
			out.println("RemoteAddr (adres klienta): " + request.getRemoteAddr());
			out.println("metoda: " + request.getMethod());
			out.println("protokó³: " + request.getScheme());
			
			out.println("Wszystkie parametry:");
			for(Map.Entry e : request.getParameterMap().entrySet()) {
				String[] v = (String[]) e.getValue();
				out.println(" * " + e.getKey() + " : " + Arrays.toString(v));
			}
		}
	}
}
