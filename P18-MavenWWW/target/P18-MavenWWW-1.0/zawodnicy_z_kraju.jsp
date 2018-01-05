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
<h1>Wybrani zawodnicy</h1>

<jsp:useBean id="baza" class="skoki.baza.BazaBean"/>
<jsp:setProperty name="baza" property="kraj" param="kraj"/>


<form method="post">
<select name="kraj" style="width:10em">
<option value="">-- wybierz --</option>
<option value="AUT">Austria</option>
<option value="FIN">Finlandia</option>
<option value="GER">Niemcy</option>
<option value="NOR">Norwegia</option>
<option value="POL">Polska</option>
<option value="USA">U.S.A.</option>
</select>

<button>Wybierz</button>
</form>

<p>Zawodnicy z kraju: <b>${param.kraj}</b></p>

<table>
<tr><th>ID</th><th>Imię</th><th>Nazwisko</th><th>Kraj</th><th>Wzrost</th><th>Waga</th></tr>
<c:forEach var="z" items="${baza.zawodnicyZKraju}">
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