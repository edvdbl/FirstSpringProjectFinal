<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Vartotojo info</title>
	</head>
	<body class="container">
		<#include "templates/header.ftl">
		<div class="table-responsive">
			<caption>Vartotojo informacija</caption>
			<table class="table table-striped">
				<tr>
					<td><b>Id:</b></td>
					<td>${user.id}</td>
				</tr>
				<tr>
					<td><b>Vardas:</b></td>
					<td>${user.name}</td>
				</tr>
				<tr>
					<td><b>El. pastas:</b></td>
					<td>${user.email}</td>
				</tr>
				<tr>
					<td><b>Metai:<b></td>
					<td>${user.age}</td>
				</tr>
			</table>
		</div>
		<br>
		<a type="button" href="/FirstProject/users" class="button">Atgal</a>
	</body>
</html>
