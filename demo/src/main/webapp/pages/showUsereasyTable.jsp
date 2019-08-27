<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>


<head>
<meta charset="ISO-8859-1">
<title>Spring MVC List of objects display</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<style>
	.tdls{border: 1px solid black;}
</style>
<script>
function updateThisrow(rowobj)
{
	console.log($(rowobj));
}
function enableEmp()
{
	$("input[id^='users']").each(function (index, objx) {
	
		//console.log(objx);
		$(objx).removeAttr("readonly");
		
		});
	

}
</script>
</head>
<body>
<table>
<tr>
<th>First Name</th>
<th>Last Name</th>
<th>Email</th>
<th>E</th>
</tr>
<c:forEach items="${Users.users}" var="user" varStatus="tagStatus">
    <tr>
        <td>${user.firstName}</td>
        <td>${user.lastName}</td>
        <td>${user.email}</td>
        <td><button onclick="">EDIT</button></td>
    </tr>
</c:forEach>
</table>
</body>
</html>