<%@ page language="java" contentType="text/html;
	charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit a vehicle</title>
</head>
<body>
<form action= "editVehicleServlet" method= "post">
Model(Fusion): <input type= "text" name= "model"><br/>
Make(Ford): <input type= "text" name= "makel"><br/>
Drive Train(4wd, fwd, rwd): <input type= "text" name= "driveTrain"><br/>
Price: <input type= "text" name= "price"><br/>
Date Added (mm/dd/yyyy): <input type= "text" name= "dateAdded"><br/>
<input type= "submit" value= "Add Vehicle">
</form><br />
<a href= "viewAllVehiclesServlet">View the complete list</a>
</body>
</html>