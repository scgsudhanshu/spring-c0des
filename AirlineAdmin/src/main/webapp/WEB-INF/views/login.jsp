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
	<body>
    <div class="container" >
    
    	<div class="card mx-auto mt-5" style="width:30%; margin:auto;">
    		
    		<div class="card-body py-5">
    		
    			<h3 class="text-center">Login</h3>
    		
    			<form class="mt-3" action="authorize">
    				<div class="form-group">
    				
    					<input 
    					type="text" 
    					id="username" 
    					name="username" 
    					placeholder ="Enter Your Username" 
    					class="form-control" />
    					
    					</div>
    					
    					
    					<div class="form-group">
    				
    					<input 
    					type="password" 
    					id="userpass" 
    					name="userpass" 
    					placeholder ="Enter Your Password" 
    					class="form-control" />
    					
    					</div>
    					
    					<div class="container text-center">
    					<button class="btn  btn-primary">Submit</button>
    					</div>
    				</div>
    			
    			</form>
    			
    			
    			
    			
    				
				    				
    				
    			</div>
    		
    		<%String err_msg = request.getParameter("errmsg"); 
    				System.out.println("Err Msg : "+err_msg); 
    				if(err_msg != null )
    				{ System.out.println("Inside function"); %>
    				<br/><br/> 
    				<div style="background-color:#E17F95; width:30%; margin:auto; " class="text-center">
    				<%=err_msg %> <% } %>
    		</div>
    		
    	
    	</div>
    
    

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>