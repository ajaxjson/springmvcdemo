<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC List of objects display</title>
</head>
<body>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
</tr>
<c:forEach items="${Employs.employ}" var="employ" varStatus="tagStatus">
    <tr>
        <td>${employ.firstName}</td>
        <td>${employ.lastName}</td>
        <td>${employ.email}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>