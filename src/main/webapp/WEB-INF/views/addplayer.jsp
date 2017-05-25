<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Add Player </title>
 <link href="resources/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

   <h2> Add Player for team ${team.name} </h2>
	 <form action="/add/player/${team.teamKey}" method="post">	
	 <table>
	 <tr>
	 <td>First Name:</td>
	 <td><input  name="fname"/> </td>	
	 </tr>	 
	 <tr>
	 <td>Last Name:</td>
	 <td><input  name="lname"/> </td>
	 
	 </tr>	
	 
	 <tr>
	 <td>Age:</td>
	 <td><input  name="age"/> </td>
	 
	 </tr> 
	
	 <tr>
	 <td>Height:</td>
	 <td><input name="height"/> </td>	 
	 </tr>	
	 
	 <tr>
	 <td>Weight:</td>
	 <td><input name="weight"/> </td>	 
	 </tr>
	 
	 <tr>
	 <td>Position:</td>
	 <td><input name="position"/> </td>	 
	 </tr>
	 <tr>
	 <td>Nationality:</td>
	 <td><input name="nationality"/> </td>	 
	 </tr>
	 </table>
	 <input  value="Add Player" type="submit"/>
	 </form>
	 
	 
	 
	
	
</body>
</html>
