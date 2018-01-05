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

<p>Expression language (EL):  ${ 2 + 2 } </p>


<p>Teraz jest godzina: <b>${ java.time.LocalTime.now() }</b>   (tak nie działa).</p>

<jsp:useBean id="info" class="beans.InfoBean"/>

<p>Teraz jest godzina: <b>${ info.currentTime }</b>.</p>


</body>
</html>
