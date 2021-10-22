<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 <input type="hidden" name="action" value="create">

Targa:<br>
<input type="text" name=targa><br>
Marca:<br>
<input type="text" name=marca><br>
Modello:<br>
<input type="text" name=modello><br>
Elettrica:<br>
Si:<input type="radio" name=elettrica value="SI" checked>
No:<input type="radio" name=elettrica value="NO" >
<br>

Kw:<br>
<input type="number" name=kw><br>
<input type="submit" value="Submit"/>
</form>


</body>
</html>