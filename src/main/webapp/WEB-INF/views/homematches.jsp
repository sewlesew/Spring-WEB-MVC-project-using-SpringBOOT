
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.1 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml11.dtd">
<html>
<head>
<title>Matches</title>
</head>
<body>
<h1>Matches</h1>
<table>
<tr>
<th>Date </th> 
<th>Start Time</th>
<th>Home Score</th>
<th>Visitor Score</th>
</tr>
<c:forEach var="match" items="${matches}">
<tr>
<td>${match.date}</td>
<td>${match.startTime}</td>
<td>${match.homeScore}</td>
<td>${match.visitorScore}</td>



</tr> 
 </c:forEach>
</table>
<form action="/clubs/${team.teamKey}" method="post">
<input type="submit" value="Back">
</form>


 


</body>
</html>