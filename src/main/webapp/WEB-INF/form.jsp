<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Omikuji</title>
</head>
<body>
	<div>
		<h1>Send an Omikuji!</h1>
		<form action="/formSubmit" method="post">
			<div>
				<label>Pick any number from 5 - 25</label>
				<input type="number" name="number">
			</div>
			<div>
				<label>Enter the name of any city.</label>
				<input type="text" name="person">
			</div>
			<div>
				<label>Enter the name of any real person</label>
				<input type="text" name="person">
			</div>
			<div>
				<label>Enter professional endeavor or hobby: </label>
				<input type="text" name="prof">
			</div>
			<div>
				<label>Enter any type of living thing.</label>
				<input type="text" name="livingThing">
			</div>
			<div>
				<label>Say something nice to someone:</label>
				<textarea type="text" name="nice"></textarea>
			</div>
			<p>Send an show a friend</p>
			<input type="submit">
		</form>
	</div>
	
	
</body>
</html>