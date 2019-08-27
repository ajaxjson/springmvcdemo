<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Insert title here</title>
	<!-- 
	<script src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<link href="webjars/bootstrap/4.3.1/css/bootstrap.min.css"  rel="stylesheet">
	
	
	<script src="webjars/jquery/3.0.0/jquery.min.js"></script>
	
	
	<script src="webjars/bootstrap-datepicker/1.9.0/js/bootstrap-datepicker.js"></script>
	<link href="webjars/bootstrap-datepicker/1.9.0/css/bootstrap-datepicker.css" rel="stylesheet">
	
	
	
	<script src="webjars/bootstrap-dialog/1.34.6/dist/js/bootstrap-dialog.js"></script>
	<link href="webjars/bootstrap-dialog/1.34.6/dist/css/bootstrap-dialog.css" rel="stylesheet"> 
	
	 -->
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

	<title>Welcome</title>
	<script>
	function showdialog()
	{

		 $('#exampleModal').modal('show');
		/*
		 $(".btn").click(function(){
				$("#myModal").modal('show');
			});
		*/
	}

	$(document).ready(function() {
	    //$('#example').DataTable();
	    alert('I m ready');
	    
	    $(".btn").click(function(){
			$("#myModal").modal('show');
		});
        
	    $('[data-toggle="tooltip"]').tooltip(); 
	} );
	</script>
<style>
table#table1 {
    width:70%; 
    margin-left:15%; 
    margin-right:15%;
  }
  
  table#table2 {
    width:100%; 
   
    margin-right:15%;
   
  }
</style>	
</head>

<body>


 <div class="container">
 <div class="alert alert-dark" role="alert">
  SPRINGBOOT MVC JPA H2 DEMO
</div>
 <table id="table2">
 <tr>
 <td align="right">
<p>
  <a class="btn btn-light" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
     <button type="button" class="btn btn-secondary" data-toggle="tooltip" title="This is totally record, click to show record">
	  Totally <span class="badge badge-light">3</span>
	  
	</button>
	
  </a>
 
</p>
</td>
</tr>
</table>

<div class="collapse" id="collapseExample">
  <div class="card card-body">
   <table class="table table-striped">

            <caption>Your todos are</caption>

            <thead>

                <tr>

                    <th>Description</th>

                    <th>Target Date</th>

                    <th>Is it Done?</th>

                    <th>Edit</th>

                    <th>Delete</th>

                </tr>

            </thead>

            <tbody>

                    <tr>

                        <td>Todo 2</td>

                        <td>10/12/2017</td>

                        <td>No</td>

                        <td><a class="btn btn-light"  onclick="showdialog();">EDIT</a></td>

                        <td><a class="btn btn-light" onclick="showdialog();">DELETE</a></td>
                        <!-- href="/delete-todo" -->

                    </tr>
                    
                     <tr>

                        <td>Todo 3</td>

                        <td>10/12/2017</td>

                        <td>No</td>

                        <td><a class="btn btn-light" onclick="showdialog();">EDIT</a></td>

                        <td><a class="btn btn-light" onclick="showdialog();">DELETE</a></td>

                    </tr>
                    
                    
                     <tr>

                        <td>Todo 1</td>

                        <td>10/12/2017</td>

                        <td>No</td>

                        <td><a class="btn btn-light" onclick="showdialog();">EDIT</a></td>

                        <td><a class="btn btn-light" onclick="showdialog();">DELETE</a></td>

                    </tr>

            </tbody>

        </table>
  </div>
</div>


 <table id="table1">
 <tr valign="top">
 <td>
		 <div class="card" style="width: 28rem;height:20rem">
		 <div class="alert alert-dark" role="alert">
			  PERONAL
			</div>
		  <!-- img class="card-img-top" src="..." alt="PERONAL"-->
		  <div class="card-body">
		    
		    <table>
		     <tr>
		 		<td>
		 		<div class="input-group mb-3">
		 			   <div class="input-group-prepend">
					    <span class="input-group-text" id="basic-addon1"  style="width: 8rem;">ID</span>
					  </div>
					  <input type="text" class="form-control" placeholder="Student ID" aria-label="Student ID" aria-describedby="basic-addon1" style="width: 15rem;">
					</div>
					
					<div class="input-group mb-3">
					  <div class="input-group-prepend">
					    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">@</span>
					  </div>
					  <input type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1" style="width: 15rem;">
					</div>
					
					<div class="input-group mb-3">
					  <div class="input-group-prepend">
					    <span class="input-group-text" id="basic-addon1" style="width: 8rem;">Name</span>
					  </div>
					  <input type="text" class="form-control" placeholder="Your name" aria-label="Your name" aria-describedby="basic-addon1" style="width: 15rem;">
						</div>
						
						
		
					<div class="input-group mb-3">
					  <input type="text" class="form-control" placeholder="email" aria-label="email" aria-describedby="basic-addon2" style="width: 15rem;">
					  <div class="input-group-append">
					    <span class="input-group-text" id="basic-addon2" style="width: 8rem;">@aycap.com</span>
					  </div>
					</div>
		
					
					
					
					
		 		</td>
			 </tr>
		    </table>
		   
		  
		  </div>
		</div>
</td>
<td>



	<div class="card" style="width: 28rem;height:20rem">
	 <div class="alert alert-dark" role="alert">
			  COURSE
			</div>
	  <!-- img class="card-img-top" src="..." alt="COURSE"  -->
	  <div class="card-body">
	    
	    <table>
	     <tr valign="top">
	 		<td>
	 		<div class="input-group mb-3">
	 			   <div class="input-group-prepend">
				    <span class="input-group-text" id="basic-addon1"  style="width: 8rem;">LANGUAGE</span>
				  </div>
				  <div class="dropdown">
					  <select class="btn btn-secondary dropdown-toggle"  id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" style="width: 15rem;">
					    
					<option class="dropdown-item">English</option>
					    <option class="dropdown-item">German</option>
					    <option class="dropdown-item">Turkey</option>
					    
					  </select>
				</div>
	
				
				</div>
				
				
					<div class="input-group mb-3">
					  <div class="input-group-prepend">
					    <span class="input-group-text" style="width: 2rem;">$</span>
					  </div>
					  <input type="text" class="form-control" aria-label="Amount (to the nearest dollar)" style="width: 16rem;">
					  <div class="input-group-append">
					    <span class="input-group-text" style="width: 5rem;">.00</span>
					  </div>
					</div>
				
				
				
				<div class="input-group mb-3">
				
				  <div class="input-group-prepend">
				    <span class="input-group-text" style="width: 8rem;">Remark</span>
				  </div>
				 
				  <textarea class="form-control" aria-label="With textarea" style="width: 15rem;"></textarea>
				</div>
				
	 		</td>
	 	</tr>
	    </table>
	   
	   
	  </div>
	</div>
</td>
</tr>
<tr>
<td colspan="2" style="text-align:center">
  <a href="#" class="btn btn-secondary">SAVE</a>
  </td>
</tr>
</table>

 
 			
		
		




        
       
		
<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
        ...
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
        <button type="button" class="btn btn-primary">Save changes</button>
      </div>
    </div>
  </div>
</div>
    
	
	</div>
</body>

</html>