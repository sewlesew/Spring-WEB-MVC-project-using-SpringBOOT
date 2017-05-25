
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>

</head>
<body>
<h1>Team List</h1>
<table>
<tr>
<th>Team Name </th> 
<th>Team City </th>
<th>Team Mascot </th>

</tr>
<c:forEach var="team" items="${teams}">
<tr>
<td>${team.name}</td>
<td>${team.city}</td>
<td>${team.mascot}</td>
<td><a href="/teams/${team.teamKey}" style="text-decoration:none">Edit Team &nbsp;&nbsp;</a></td> 
<td> <a href="/clubs/${team.teamKey}" style="text-decoration:none">${team.name} Club's Page</a></td>

</tr> 
 </c:forEach>
</table>

<form action="/add/team" method="post">
<input type="submit" value="Add Team">
</form>


 


</body>
</html>