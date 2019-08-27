<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Insert employee here</title>

<style type="text/css">
  span.error{
    color: red;
    margin-left: 5px;
  }
</style>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script type="text/javascript">
$(function() {
	/*  Submit form using Ajax */
	$('button[type=submit]').click(function(e) {
		
		//Prevent default submission of form
		e.preventDefault();
		
		//Remove all errors
		$('input').next().remove();
		
		$.post({
			url : '/saveEmployee',
			data : $('form[name=employeeForm]').serialize(),
			success : function(res) {
				
				if(res.validated){
					//Set response
					$('#resultContainer pre code').text(JSON.stringify(res.employee));
					$('#resultContainer').show();
					
				}else{
					//Set error messages
					$.each(res.errorMessages,function(key,value){
						$('input[name='+key+']').after('<span class="error">'+value+'</span>');
					});
				}
			}
		})
	});
});
</script>
</head>
<body>
<div class="container" class="text-sm-center" align="center">
	
	<div class="card" style="width:40rem;">
	  <img src="../source/java-spring-logo.png" style="width: 20rem;" class="card-img-top" alt="...">
	  <div class="card-body">
	    
	    <!-- action="addstudent"  --> 
	    <form action="saveEmployee" method="post" name="employeeForm">
			<div class="input-group mb-3">
			  <div class="input-group-prepend">
			    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">NAME</span>
			  </div>
			  <input type="text" class="form-control" id="firstName"  name="firstName" placeholder="firstName" aria-label="firstName" aria-describedby="basic-addon1" style="width: 15rem;">
			</div>
			
			
			
			
			<div class="input-group mb-3">
			  <div class="input-group-prepend">
			    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">LAST NAME</span>
			  </div>
			  <input type="text" id="lastName" name="lastName" class="form-control"  placeholder="lastName" aria-label="lastName" aria-describedby="basic-addon1" style="width: 15rem;">
			</div>
			
			<div class="input-group mb-3">
			<div class="input-group-prepend">
			    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">EMAIL</span>
			  </div>
			  <input type="text" id="email"  name="email" class="form-control" placeholder="email" aria-label="email" aria-describedby="basic-addon2" style="width: 10rem;">
			  <div class="input-group-append">
			    <span class="input-group-text" id="basic-addon2" style="width: 10rem;">@aycap.com</span>
			  </div>
			</div>
			
			<div class="input-group mb-3">
			  <div class="input-group-prepend">
			    <span class="input-group-text" style="width: 8rem;">SALARY $</span>
			  </div>
			  <input type="text" id="salary" name="salary" class="form-control" aria-label="Amount (to the nearest dollar)">
			  <div class="input-group-append">
			    <span class="input-group-text">.00</span>
			  </div>
			</div>
			
			<div class="input-group">
			  <div class="input-group-prepend">
			    <span class="input-group-text" style="width: 8rem;">REMARK</span>
			  </div>
			  <textarea id="designation" name="designation" class="form-control" aria-label="With textarea" style="width: 10rem;"></textarea>
			</div>
			<button type="submit"  class="btn btn-secondary" >FORM SERELIZE SUBMIT</button>
			
			</form>
			
	    
	    
	  </div>
	</div>
	
	
  

  
    
	  
	
	<!-- Result Container  -->
	<div id="resultContainer" style="display: none;">
	 <hr/>
	 <h4 style="color: green;">JSON Response From Server</h4>
	  <pre style="color: green;">
	    <code></code>
	   </pre>
	</div>
</div>	
</body>
</html>