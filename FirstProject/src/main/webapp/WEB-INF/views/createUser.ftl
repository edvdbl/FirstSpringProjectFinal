<#import "templates/spring.ftl" as spring />
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Naujo vartotojo sukurimas</title>
	</head>
	<body>
		<@spring.bind "user"/>
        <#if noErrors??>
            Ivesti duomenys<br>
            Vardas: 	${user.name}<br>
            El. pastas: ${user.email}<br>
            Metai: 		${user.age}<p>
            <a href="/FirstProject/users">Rodyti vartotojus</a>
        <#else>		
			<form name="user" action="/FirstProject/addUser" 	method="post">
				Vardas:<br>
				<@spring.formInput "user.name"/>
                <@spring.showErrors "<br>"/><p>
				El. pastas:<br>
			    <@spring.formInput "user.email"/>
            	<@spring.showErrors "<br>"/><p>
				Metai:<br>
				<@spring.formInput "user.age"/>
            	<@spring.showErrors "<br>"/><p>
				<input type="submit" value="prideti">
			</form>
		</#if>
	</body>
</html>
