<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 class="text-center"><u>Welcome to Ninja Gold Game!</u></h1>
		<h2 class="m-5">Your Gold: ${player.gold}</h2> 
	<div>
		
	</div>
	<div class="container d-flex justify-content-center mt-5">
		<form action="/farmAction" method="post">
			<div class="card">
				<div class="card-header text-center"> Farm</div>
				<div class="card-body">(earns 10-20 gold)</div>
				<div class="card-footer text-center"><button type="submit">Find Gold!</button></div>
			</div>
		</form>
		<form action="/caveAction" method="post">
			<div class="card ml-5">
				<div class="card-header text-center">Cave</div>
				<div class="card-body">(earns 5-10 gold)</div>
				<div class="card-footer text-center"><button type="submit">Find Gold!</button></div>
			</div>
		</form>
		<form action="/houseAction" method="post">
			<div class="card ml-5">
				<div class="card-header text-center">House</div>
				<div class="card-body">(earns 2-5 gold)</div>
				<div class="card-footer text-center"><button type="submit">Find Gold!</button></div>
			</div>
		</form>
		<form action="/casinoAction" method="post">
			<div class="card ml-5">
				<div class="card-header text-center">Casino</div>
				<div class="card-body">(earns 0-50 gold)</div>
				<div class="card-footer text-center"><button type="submit">Find Gold!</button></div>
			</div>
		</form>
	</div>
	<div class="input-group d-end m-5 text-center">
		<label>Activities: </label>
		<textarea class="group-control" rows="3" cols="180"><c:forEach var = "i" begin = "0" end = "player.msg.size()"><c:out value="${player.msg[i]}"/></c:forEach> </textarea>
	</div>
</body>
</html>