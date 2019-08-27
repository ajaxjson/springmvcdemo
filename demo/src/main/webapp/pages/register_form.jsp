<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
  <script src="https://code.jquery.com/jquery-1.9.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script>
$( document ).ready(function() {
    //console.log( "ready!" );
   
});



function json_submit()
{
	
	var studentData = {};
	//studentData["ST_ID"] = $("#ST_ID").val();
	studentData["ST_CODE"] = $("#ST_CODE").val();
	studentData["ST_NAME"] = $("#ST_NAME").val();
	studentData["ST_EMAIL"] = $("#ST_EMAIL").val();
	
	studentData["ST_Scholarship"] = $("#ST_Scholarship").val();
	studentData["ST_REMARK"] = $("#ST_REMARK").val();
	
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/getjson",
		data : JSON.stringify(studentData),
		
		dataType : 'json',				
		success : function(data) {

			alert(JSON.stringify(data));
			//$('#check_result').html(data.txt);
			// Code to display the response.
			/*
			$('#defectCountDiv').show();
			$('#highDefects').text(data.high);
			$('#mediumDefects').text(data.medium);
			$('#lowDefects').text(data.low);
			*/
			$('#processedData').html(JSON.stringify(data));
			//$('#displayDiv').show();
		}
	});
	

}



function form_submit()
{
	
	var studentData = {};
	//studentData["ST_ID"] = $("#ST_ID").val();
	studentData["ST_CODE"] = $("#ST_CODE").val();
	studentData["ST_NAME"] = $("#ST_NAME").val();
	studentData["ST_EMAIL"] = $("#ST_EMAIL").val();
	
	studentData["ST_Scholarship"] = $("#ST_Scholarship").val();
	studentData["ST_REMARK"] = $("#ST_REMARK").val();
	
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "/getjson",
		data : JSON.stringify(studentData),
		
		dataType : 'json',				
		success : function(data) {

			alert(JSON.stringify(data));
			//$('#check_result').html(data.txt);
			// Code to display the response.
			/*
			$('#defectCountDiv').show();
			$('#highDefects').text(data.high);
			$('#mediumDefects').text(data.medium);
			$('#lowDefects').text(data.low);
			*/
			$('#processedData').html(JSON.stringify(data));
			//$('#displayDiv').show();
		}
	});
	

}
</script>



</head>
<body>


<div id ="processedData"></div>


<div class="container" class="text-sm-center" align="center">

<div id ="check_result"></div>
<div class="alert alert-dark"  role="alert" >
  <table border="0">
  	<tr>
  		<td><h2>SPRING MVC JPA H2 DEMO</h2>
  		</td>
  		<td>
  		
			  <button type="button" class="btn btn-primary" data-toggle="collapse" data-target="#multiCollapseExample1" aria-expanded="false" aria-controls="multiCollapseExample1" align="right">
			  
			  Totally <span class="badge badge-light"  data-toggle="tooltip" data-placement="top" title="totally rec no.">4</span>
			</button>
  		</td>
  	</tr>
  </table>
  
</div>



<div class="row">
  <div class="col">
    <div class="collapse multi-collapse" id="multiCollapseExample1">
      <div class="card card-body">
        
        	<table class="table table-striped">
				  <thead>
				    <tr>
				      <th scope="col">#</th>
				      <th scope="col">CODE</th>
				      <th scope="col">NAME</th>
				      <th scope="col">EMAIL</th>
				      <th scope="col">SCHOLAR</th>
				    </tr>
				  </thead>
				  <tbody>
				    <tr>
				      <th scope="row">1</th>
				      <td>ST1</td>
				      <td>TEST1</td>
				      <td>test1@aycap.com</td>
				      <td>100</td>
				    </tr>
				    <tr>
				      <th scope="row">2</th>
				      <td>ST2</td>
				      <td>TEST2</td>
				      <td>test2@aycap.com</td>
				      <td>200</td>
				    </tr>
				    <tr>
				      <th scope="row">3</th>
				      <td>ST3</td>
				      <td>TEST3</td>
				      <td>test3@aycap.com</td>
				      <td>300</td>
				    </tr>
				  </tbody>
				</table>
        
      </div>
    </div>
  </div>
  
</div>

<div class="card" style="width:40rem;">
  <img src="../source/java-spring-logo.png" style="width: 35rem;" class="card-img-top" alt="...">
  <div class="card-body">
    
    <!-- action="addstudent"  --> 
    <form name="stdform" id="stdform" method="post">
		<div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">@</span>
		  </div>
		  <input type="text" class="form-control" id="ST_CODE"  name="ST_CODE" placeholder="STUDENT CODE" aria-label="STUDENT CODE" aria-describedby="basic-addon1" style="width: 15rem;">
		</div>
		
		
		
		<div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">Name</span>
		  </div>
		  <input type="text" id="ST_NAME" name="ST_NAME" class="form-control"  placeholder="STUDENT NAME" aria-label="STUDENT "STUDENT NAME"" aria-describedby="basic-addon1" style="width: 15rem;">
		</div>
		
		<div class="input-group mb-3">
		<div class="input-group-prepend">
		    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">Email</span>
		  </div>
		  <input type="text" id="ST_EMAIL"  name="ST_EMAIL" class="form-control" placeholder="EMAIL" aria-label="EMAIL" aria-describedby="basic-addon2" style="width: 10rem;">
		  <div class="input-group-append">
		    <span class="input-group-text" id="basic-addon2" style="width: 10rem;">@aycap.com</span>
		  </div>
		</div>
		
		<div class="input-group mb-3">
		  <div class="input-group-prepend">
		    <span class="input-group-text" style="width: 8rem;">$</span>
		  </div>
		  <input type="text" id="ST_Scholarship" name="ST_Scholarship" class="form-control" aria-label="Amount (to the nearest dollar)">
		  <div class="input-group-append">
		    <span class="input-group-text">.00</span>
		  </div>
		</div>
		
		<div class="input-group">
		  <div class="input-group-prepend">
		    <span class="input-group-text" style="width: 8rem;">With textarea</span>
		  </div>
		  <textarea id="ST_REMARK" name="ST_REMARK" class="form-control" aria-label="With textarea" style="width: 10rem;"></textarea>
		</div>
		<button type="button" class="btn btn-secondary" onclick="json_submit();">JSON SUBMIT</button>
		<button type="button" class="btn btn-secondary" onclick="form_submit();">FORM SERELIZE</button>
		</form>
		
    
    
  </div>
</div>
</div>

</body>
</html>