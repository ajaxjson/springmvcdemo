<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script>
$("#submit").click(function(){
	var developerData = {};
	developerData["id"] = $("#id").val();
	developerData["firstName"] = $("#firstName").val();
	developerData["lastName"] = $("#lastName").val();
	
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "getDefectCount",
		data : JSON.stringify(developerData),
		dataType : 'json',				
		success : function(data) {
			// Code to display the response.
			$('#defectCountDiv').show();
			$('#highDefects').text(data.high);
			$('#mediumDefects').text(data.medium);
			$('#lowDefects').text(data.low);
		}
	});
});
</script>
</head>
<body>
<h2>Enter Developer Details</h2>
	<table>
		<tr>
			<td>Id</td>
			<td><input type="text" id="id"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" id="firstName"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" id="lastName"></td>
		</tr>
		
		<tr>
			<td colspan="2"><input type="button" id="submit" value="Submit" /></td>
		</tr>
	</table>
	
	<div id="defectCountDiv" style="display:none">
	<h3>Defects assigned to you:</h3>
	High    - <b><span id="highDefects"></span></b><br/>
	Medium  - <b><span id="mediumDefects"></span></b><br/>
	Low     - <b><span id="lowDefects"></span></b><br/>
</div>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
</body>
</html>