<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Add Team </title>
 <link href="resources/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

   <h2> Add Team </h2>
	 <form action="/team" method="post">	
	 <table>
	 <tr>
	 <td>name:</td>
	 <td><input name="name"/> </td>	 
	 </tr>	 
	 <tr>
	 <td>city:</td>
	 <td><input name="city"/> </td>
	 	 </tr>	 
	
	 <tr>
	 <td>mascot:</td>
	 <td><input name="mascot"/> </td>
	
	 </tr>	
	 </table>
	 
	 <input  value="Add Team" type="submit"/>
	 </form>
	 
	 
	 
	
	
</body>
</html>
