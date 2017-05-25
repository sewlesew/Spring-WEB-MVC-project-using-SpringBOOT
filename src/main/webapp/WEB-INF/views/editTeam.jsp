<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Edit Team </title>
 <link href="resources/style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	 <form:form modelAttribute="team" action="/teams/${team.teamKey}" method="post">
	 <form:errors path="*" cssClass="errorblock" element="div" />
	 <table>
	 <tr>
	 <td>name:</td>
	 <td><form:input path="name" name="name"/> </td>
	 <td><form:errors path="name" cssClass="error" /> </td>
	 </tr>	 
	 <tr>
	 <td>city:</td>
	 <td><form:input path="city" name="city"/> </td>
	 <td><form:errors path="city" cssClass="error" /> </td>
	 </tr>	 
	
	 <tr>
	 <td>mascot:</td>
	 <td><form:input path="mascot" name="mascot"/> </td>
	 <td><form:errors path="mascot" cssClass="error" /> </td>
	 </tr>	
	 </table>
	 <input  value="update" type="submit"/>
	 </form:form>
	 
	 <form:form action="/teams/delete?teamId=${team.teamKey}" method="post">
	  <input type="submit" value="Delete"> 
	 </form:form>
	
</body>
</html>
