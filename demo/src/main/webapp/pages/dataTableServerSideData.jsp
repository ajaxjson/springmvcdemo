<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Data Table</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.19/css/dataTables.bootstrap4.min.css">

 <script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
<script src="https://cdn.datatables.net/1.10.19/js/dataTables.bootstrap4.min.js"></script>




<script>
$(document).ready(function() {
	 $('#example').DataTable( {
	        "processing": true,
	        "serverSide": true,
	        "ajax": {
	            "url": "/showDatafromServerSide",
	            "type": "GET",
	            "dataType": "json"
	        },
	        "columns": [
	            { "data": "firstName" },
	            { "data": "lastName" },
	            { "data": "email" }
	          
	        ]
	    } );
	    
} );
</script>
</head>
<body>
<table id="example" class="table table-striped table-bordered" style="width:100%">
        <thead>
            <tr>
         
                <th>firstName</th>
                <th>lastName</th>
                <th>email</th>
               
            </tr>
        </thead>
        <tfoot>
            <tr>
                 <th>firstName</th>
                <th>lastName</th>
                <th>email</th>
            </tr>
        </tfoot>
    </table>
</body>
</html>