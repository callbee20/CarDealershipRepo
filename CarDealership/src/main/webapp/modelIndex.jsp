<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action= "addVehicleServlet" method= "post">
Model(Fusion): <input type= "text" name= "model"><br/>
Make(Ford): <input type= "text" name= "makel"><br/>
Drive Train(4wd, fwd, rwd): <input type= "text" name= "driveTrain"><br/>
Price: <input type= "text" name= "price"><br/>
Date Added (mm/dd/yyyy): <input type= "text" name= "dateAdded"><br/>
<input type= "submit" value= "Add Vehicle">
</form><br />
<a href= "viewAllVehiclesServlet">View the complete list</a>
<a href= "index.html">Return to home page</a>
</body>
</html>