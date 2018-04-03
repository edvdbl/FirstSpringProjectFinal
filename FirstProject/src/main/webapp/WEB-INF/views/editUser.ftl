<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Esamo vartotojo redagavimas</title>
	</head>
	<body>
		<form name="user" action="/FirstProject/updateUser" method="post">
			<input placeholder="ID"     	type="text"   	name="id"  		value="${user.id}"><p>
			<input placeholder="Vardas"     type="text"   	name="name"  	value="${user.name}"><p>
			<input placeholder="El. pastas" type="text"   	name="email" 	value="${user.email}"><p>
			<input placeholder="Metai"      type="text" 	name="age"   	value="${user.age}"><p>
			<input type="submit" value="redaguoti">
		</form>
	</body>
</html>
