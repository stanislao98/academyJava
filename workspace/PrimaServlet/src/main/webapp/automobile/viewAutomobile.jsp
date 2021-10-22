<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="model.Automobile"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	Automobile auto = (Automobile) request.getAttribute("auto");
	String elettrica = (auto.getElettrica() == 1 ? "SI" : "NO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DETTAGLI AUTO</title>
</head>
<body>
	<h2>DETTAGLI AUTO</h2>
	
	Targa: <%= auto.getTarga() %><br>
	Marca: <%= auto.getMarca() %><br>
	Modello: <%= auto.getModello() %><br>
	Elettrica: <%= elettrica %><br>
	Potenza: <%= auto.getKw() %><br>
	
			<a href="<c:url value="/">
					<c:param name="action" value="list" />
				 </c:url>">
   			<button>Ritorna all'elenco Auto</button>
		</a>
	
</body>
</html>