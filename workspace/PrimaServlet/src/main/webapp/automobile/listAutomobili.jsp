<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="model.Automobile"%>
<%@ page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	@SuppressWarnings("unchecked")
	//il compilatore non sa se retituisce una lista di automobili e da un warning per cui metto suppress..
	List<Automobile> automobili = (List<Automobile>) request.getAttribute("automobili");
%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Automobili Elenco</title>
<style>
table, th, td {
	border: 1px solid black;
}
>
</style>
</head>
<body>
	<h2>Automobili</h2>

	<!-- <a href="localhost:8080/PrimaServlet?action=create">Crea Automobile</a>
 -->
	<!-- localhost:8080/PrimaServlet?action=create -->
	<a
		href="<c:url value="/">
					<c:param name="action" value="create" />
			</c:url>">Crea
		Automobile</a>

	<table>
		<tr>
			<th>Targa</th>
			<th>Marca</th>
			<th>Modello</th>
			<th>Azione</th>
		</tr>

		<%
			if (automobili != null && automobili.size() != 0) {
				for (Automobile auto : automobili) {
					String idString = Integer.toString(auto.getId());
		%>
		<tr>
			<td><%=auto.getTarga()%></td>
			<td><%=auto.getMarca()%></td>
			<td><%=auto.getModello()%></td>
			<td><a
				href="<c:url value="/">
		    				<c:param name="action" value="view" />
		    				<c:param name="ticketId" value="<%=idString%>" />
		    			 </c:url>">DETTAGLI</a>
			</td>
		</tr>

		<%
			}

			}
		%>


	</table>


</body>
</html>