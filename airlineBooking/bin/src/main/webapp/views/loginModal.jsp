 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 
 
 <!-- Modal for Login User -->

		 <div id="SignInModal" class="modal fade" role="dialog">
        <div class="modal-dialog modal-lg" role="content">
            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title">Sign In</h4>
                    <button type="button" class="close" data-dismiss="modal">&times;</button>
                </div>
                <div class="modal-body">
                    <form action="SignInUser" method="post">
                        
                            <div class="form-group col-sm-8">
                                    <label  for="inputUsername">User Name</label>
                                    <input type="text" class="form-control form-control-sm mr-1" id="inputUsername" name = "Username" placeholder="Enter UserName" required>
                            </div>
                            <div class="form-group col-sm-8">
                                <label  for="inputPassword">Password</label>
                                <input type="password" class="form-control form-control-sm mr-1" id="inputPassword"  name =  "Password" placeholder="Password" required>
                            </div>
                            
                           
                           
                           
                        
                        <div class="form-row">
                            <button type="button" class="btn btn-secondary btn-sm ml-auto" data-dismiss="modal">Cancel</button>
                            <button type="submit" class="btn btn-primary btn-sm ml-1">Sign In</button>        
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
    
</body>
</html>