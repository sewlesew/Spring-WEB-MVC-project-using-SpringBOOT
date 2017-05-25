
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
<h1>${team.name} official club's page</h1>	
	<a href="/players/${team.teamKey}">Players</a><br>
	<a href="/homematches/${team.teamKey}">Home Matches</a><br>
	 <a href="/awaymatches/${team.teamKey}">Away matches</a><br>
	<a href="/add/match/${team.teamKey}">Add Home Match</a><br>
	<a href="/add/away/match/${team.teamKey}">Add Away Match</a><br>
	<a href="/add/player/${team.teamKey}">Add Player</a><br>
	<form action="/" method="post">
	<input type="submit" value="Back"><br>
   </form>

</body>
</html>