<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark" style="background-color: blueviolet; text-decoration: white;">
        <a class="navbar-brand" href="#">Navbar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
      
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item active">
              <a class="nav-link" href="/home">Home <span class="sr-only">(current)</span></a>
            </li>
            
            <li class="nav-item">
                <a class="nav-link" href="/contact">Contact Us</a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Services
              </a>
              <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="/history">View History</a>
                <a class="dropdown-item" href="/bookstatus">Booking Status</a>
                
                <a class="dropdown-item" href="/book">Book Your Flight</a>
              </div>
            </li>
            
          </ul>
          <%@include file="signupModal.jsp" %>
          <button class="btn btn-danger  sm-0 mr-1" data-toggle = "modal" data-target = "#SignUpModal">Sign Up</button>
          <%@include file="loginModal.jsp" %>
          <button class="btn btn-success sm-0 mr-1" data-toggle = "modal" data-target = "#SignInModal">Sign In</button>
          
         </div>
      </nav>
      
</body>
</html>