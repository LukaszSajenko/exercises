<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Witaj JSP</title>
</head>
<body>

<form method="post">
<input type="text" size="10" name="imie">
<input type="submit" value="Wyślij">
</form>

<p>Witaj ${param.imie}</p>

</body>
</html>