<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	</head>
	
<body onload="stopBack()">

	<div class="container">
	<h1 class="mt-5">Welcome</h1>
	
	<div class="card mt-5 " style="width: 18rem;">
  <img src="/resources/images/user_icon.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><a data-toggle="modal" data-target="#UserModal">Add User</a></h5>
    
    	 <!-- Modal for Add User -->

		 <div id="UserModal" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg" role="content">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Add User </h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                    <form action="AddUser" method="post">
                        
                            <div class="form-group col-sm-8">
                                    <label  for="inputUsername">User Name</label>
                                    <input type="text" class="form-control form-control-sm mr-1" id="inputUsername" name = "Username" placeholder="Enter UserName" required>
                            </div>
                            <div class="form-group col-sm-8">
                                <label  for="inputPassword">Password</label>
                                <input type="password" class="form-control form-control-sm mr-1" id="inputPassword"  name =  "Password" placeholder="Password" required>
                            </div>
                            
                            <div class="form-group col-sm-8">
                                    <label  for="inputFname">First Name</label>
                                    <input type="text" class="form-control form-control-sm mr-1" id="inputFname" name="Fname" placeholder="Enter First Name" required>
                            </div>
                            
                           <div class="form-group col-sm-8">
                                    <label  for="inputMname">Middle Name</label>
                                    <input type="text" class="form-control form-control-sm mr-1" id="inputMname" name="Mname" placeholder="Enter Middle Name">
                            </div>
                            
                            <div class="form-group col-sm-8">
                                    <label  for="inputLname">Last Name</label>
                                    <input type="text" class="form-control form-control-sm mr-1" id="inputLname" name="Lname" placeholder="Enter Last Name">
                            </div>
                            
                             <div class="form-group col-sm-8">
                                    <label  for="inputEmail">Email</label>
                                    <input type="email" class="form-control form-control-sm mr-1" id="inputEmail" name="Email" placeholder="Enter Email">
                            </div>
                            
                           
                           
                        
                        <div class="form-row">
                            <button type="button" class="btn btn-secondary btn-sm ml-auto" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-primary btn-sm ml-1">Add User</button>        
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>


		<!-- Modal ends here  -->
		
		
    
    </div>
    
    <div class="card mt-5 " style="width: 18rem;">
  <img src="/resources/images/user_icon.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><a href="/DeleteUser">Delete a User</a></h5>
    </div>
    
    <div class="card mt-5 " style="width: 18rem;">
  <img src="/resources/images/user_icon.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><a href="/ModifyUser">Update a User</a></h5>
    </div>
    
    
     
    
    <div class="card mt-5 " style="width: 18rem;">
  <img src="/resources/images/user_icon.png" class="card-img-top" alt="...">
  <div class="card-body">
    <h5 class="card-title"><a href="/ShowUser">Show Users</a></h5>
    </div>
</div>
	

<script>
      
      function stopBack() {
    	  console.log("stopback")
         window.history.forward();
      }
   </script>
   </div>
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
   
</body>
</html>