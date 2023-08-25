<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@page import ="com.airlineBooking.entities.*" %>
<%@page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
    <title>User Info</title>
</head>
<body>

    
    <%
        User user = (User) request.getAttribute("user");
        byte[] img = user.getUser_img();
        System.out.println("img >>> "+img);
        String baseimg = Base64.getEncoder().encodeToString(img);
    %>
    <%@include file="navbar.jsp" %>
    <div class="container m-5 ">
    <img src="data:image/jpg;base64,${baseimg}" width="240" height="300"/>
    </div>
            <div class="container m-5">
            <div class="row row-content">
                <div class="col-md-2">Name</div>
                <div class="col-md-2"><%= user.getName()%></div>
            </div>
            <div class="row row-content">
                <div class="col-md-2">Mobiles</div>
                <div class="col-md-2"><%= user.getMobiles()%></div>
            </div>
            <div class="row row-content">
                <div class="col-md-2">Email Id</div>
                <div class="col-md-2"><%= user.getEmail()%></div>
            </div>
            <div class="row row-content">
                <div class="col-md-2">Residential Address</div>
                <div class="col-md-2"><%= user.getrAddress()%></div>
            </div>
            <div class="row row-content">
                <div class="col-md-2">Aadhar</div>
                <div class="col-md-2"><%= user.getAadharNo()%></div>
            </div>
        </div>
    
    
    
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  
</body>
</html>