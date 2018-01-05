<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="styl.css">

<title>Wszyscy zawodnicy</title>
</head>
<body>
<h1>Wszyscy zawodnicy</h1>

<jsp:useBean id="baza" class="skoki.baza.BazaBean"/>

<table>
<tr><th>ID</th><th>Imię</th><th>Nazwisko</th><th>Kraj</th><th>Wzrost</th><th>Waga</th></tr>
<c:forEach var="z" items="${baza.wszyscyZawodnicy}">
	<tr>
		<td>${z.idSkoczka}</td>
		<td>${z.imie}</td>
		<td>${z.nazwisko}</td>
		<td>${z.kraj}</td>
		<td>${z.wzrost}</td>
		<td>${z.waga}</td>
	</tr>
</c:forEach>
</table>

</body>
</html>