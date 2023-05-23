<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
<h1> BENVENUTO
<% for(int i = 0; i < request.getCookies().length; i++){
	if(request.getCookies()[i].getName().equals("nome")){%>
		<%= request.getCookies()[i].getValue() %>
	<%}
	if(request.getCookies()[i].getName().equals("cognome")){%>
		<%= request.getCookies()[i].getValue() %>
	<%}
}%> 
</h1>

</head>
<body>

</body>
</html>