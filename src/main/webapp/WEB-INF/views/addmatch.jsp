<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Add Home Match </title>
 <link href="resources/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

   <h2> Add Home match for team ${team.name} </h2>
	 <form action="/add/match/${team.teamKey}" method="post">	
	 <table>
	 <tr>
	 <td>Date:</td>
	 <td><input  name="date"/> </td>	
	 </tr>	 
	 <tr>
	 <td>StartTime:</td>
	 <td><input  name="startTime"/> </td>
	 
	 </tr>	 
	
	 <tr>
	 <td>Home Score:</td>
	 <td><input name="homeScore"/> </td>	 
	 </tr>	
	 
	 <tr>
	 <td>Visitor Score:</td>
	 <td><input name="visitorScore"/> </td>	 
	 </tr>
	 
	 </table>
	 <input  value="Add Match" type="submit"/>
	 </form>
	 
	 
	 
	
	
</body>
</html>
