<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<% if(response.containsHeader("registrazione")) {%>
<h1> Registrazione avvenuta con successo!</h1>
<%} %>
</head>
<body>
<form id="login" method = "POST" action="LoginServlet">
<label>Codice Fiscale</label>
<input type="text" name="codFis"/>

<label>Password</label>
<input type="text" name="password"/>

<input type="submit" value="invia" id="Login"/>
</form>
</body>
</html>