<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Dodawanie JSP</title>
</head>
<body>

<form method="post">
<input type="text" size="10" name="x" value="${param.x}">
+
<input type="text" size="10" name="y" value="${param.y}">
<input type="submit" value="Oblicz">
</form>

<c:catch var="exn">
<p>Suma = ${ param.x + param.y } </p>
</c:catch>

<p>Wyjątek? : ${exn}</p>

</body>
</html>
