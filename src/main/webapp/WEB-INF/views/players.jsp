<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>players </title>
 <link href="resources/style.css" rel="stylesheet" type="text/css" />
</head>
<body>
 
    <h2>${team.name} players List</h2>
	 <table>
			<tr>
			<th>First Name </th> 
			<th>Last Name</th>
			<th>Age</th>
			<th>Height</th>
			<th>Weight</th>			
			<th>Nationality</th>
			<th>Position</th>
			</tr>
			<c:forEach var="player" items="${players}">
			
			<tr>
			<td>${player.fname}</td>		
			<td>${player.lname}</td>			
			<td>${player.age}</td>			
			<td>${player.height}</td>		
			<td>${player.weight}</td>		
			<td>${player.nationality}</td>				
			<td>${player.position}</td>		
			</tr> 
			 </c:forEach>
			</table>
			<form action="/clubs/${team.teamKey}" method="post">
			<input type="submit" value="Back">
			</form>
				
</body>
</html>
