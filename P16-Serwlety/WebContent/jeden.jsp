<%@page import="java.time.LocalTime"%>
<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jakiś tytuł</title>
</head>
<body>

<p>Ala ma kota</p>

<%-- To jest komentarz w JSP --%>

<!-- Bo to jest komentarz w HTML -->

<%-- Fragmenty kodu Javy wewnątrz JSP = "scriptlety" --%>

<%
int x = 2*17;
System.out.println("Halo tu serwer. Przyszło zapytanie od klienta "
	+ request.getRemoteAddr());

out.println("<p style='color: red'>Ala ma kota 2</p>");
%>

<p>Tu już znowu piszę normalnie...</p>

<p>Teraz jest godzina: <%= LocalTime.now()  %></p>


</body>
</html>
