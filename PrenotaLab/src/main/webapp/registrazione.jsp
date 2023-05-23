<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrazione</title>
</head>
<%if(response.containsHeader("registrazione")){ %>
<%= response.getHeader("registrazione") %>
<%} %>

<body>
<form id="registrazione" action ="RegistrazioneServlet">

<label>Nome</label>
<input type="text" name="nome"/>

<label>Cognome</label>
<input type="text" name="cognome"/>

<label>Codice Fiscale</label>
<input type="text" name="codFis"/>

<label>Password</label>
<input type="text" name="password"/>

<input type="submit" value="Registrati" id="invia"/>


</form>
 </body>
</html>