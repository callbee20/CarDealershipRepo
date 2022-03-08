<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method= "post" action = "navigationServlet">
<table>
<c:forEach items= "${requestScope.allCatalogs}" var= "currentlist">
<tr>
	<td><input type= "radio" name= "id" value= "${currentlist.id}"></td>
	<td><h2>${currentlist.dealershipCatalogName}</h2></td></tr>
	<tr><td colspan= "3">Dealership: ${currentlist.cardealership.dealershipName}</td></tr>
	<c:forEach var= "listVal" items= "${currentlist.listOfModels}">
		<tr><td></td><td colspan= "3">
		${listVal.make}, ${listVal.model}, ${listVal.driveTrain}, ${listVal.price}, ${listVal.addToLot}
		</td>
	</tr>
	</c:forEach>
</c:forEach>
</table>
<input type= "submit" value= "edit" name= "doThisToList">
<input type= "submit" value= "delete" name= "doThisToList">
<input type= "submit" value= "add" name= "doThisToList">
</form>
<a href= "addVehiclesForCatalogServlet"></a>
<a href = "modelIndex.jsp">Insert a new vehicle</a>
</body>
</html>