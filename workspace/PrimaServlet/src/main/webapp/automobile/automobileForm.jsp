<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Automobile"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Automobile auto = (Automobile) request.getAttribute("auto");
	String action = (auto != null) ? "update" : "create"; 
	String targa = (auto != null) ? auto.getTarga() : "";
	String marca = (auto != null) ? auto.getMarca() : "";

	String modello = (auto != null) ? auto.getModello() : "";
	int elettrica = (auto != null) ? auto.getElettrica() : 0;
	int potenza = (auto != null) ? auto.getKw() : 0;


	

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Crea automobile</h2>
<form method="POST" action="">
<!-- arriva il parametro create con questo trucchetto-->
 <input type="hidden" name="action" value="<%= (auto != null) ? "update" : "create" %>">

Targa:<br>
<input type="text" name=targa <%if (auto != null) {%>value="<%= targa%>" <%}%>><br>
Marca:<br>
<input type="text" name=marca <%if (auto != null) {%>value="<%= marca%>" <%}%>><br>
Modello:<br>
<input type="text" name=modello <%if (auto != null) {%>value="<%= modello%>" <%}%>><br>

<% if(auto!= null && auto.getElettrica() != 0) {%>
Elettrica:<br>
Si:<input type="radio" name=elettrica value="Si" checked>
No:<input type="radio" name=elettrica value="No" >
<%}else{ %>
Elettrica:<br>
Si:<input type="radio" name=elettrica value="Si">
No:<input type="radio" name=elettrica value="No" checked >
<%} %>
<br>



Kw:<br>
<input type="number" name=kw <%if (auto != null) {%>value="<%= potenza%>" <%}%>><br>
<input type="submit" value="Submit"/>
</form>


</body>
</html>