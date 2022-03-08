<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create a new catalog</title>
</head>
<body>
<form action= "createNewCatalogServlet" method= "post">
Catalog Name: <input type= "text" name= "dealershipCatalogName"><br />
Dealership Name: <input type= "text" name= "dealership"><br />

Available Vehicles: <br />
<select name= "allVehiclesToAdd" multiple size= "6">
<c:forEach items= "${requestScope.allVehicles}" var= "currentitem">
	<option value= "${currentitem.id}">${currentitem.model} | ${currentitem.make} | ${currentitem.driveTrain} | ${currentitem.price} | {currentitem.addToLot}</option>
</c:forEach>
</select>
<br />
<input type= "submit" value= "Create Catalog and add vehicle">
</form>
<a href = "modelIndex.jsp">Add new vehicles instead.</a>
</body>
</html>