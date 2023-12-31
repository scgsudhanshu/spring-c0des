<!doctype html>
<%@page import = "java.util.*" %>
<%@page import = "com.airlineBooking.entities.AvailableAirlines" %>

<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
  
    <title>Search Results</title>
    
	</head>
	
<body>
    <%@include file="navbar.jsp" %>
    
    <%
        List<AvailableAirlines> airlines = (List) request.getAttribute("airlines");
    %>
    <div class="container m-5">
        <table border = "1px" >
            <tr>
                <th><b>Airline No.</b></th>
            
            
                <th><b>Airline Name</b></th>
            
            
                <th><b>Starting Point</b></th>
            
            
                <th><b>Destination</b></th>
            
            
                <th><b>Departure Date and Time</b></th>
            
            
                <th><b>Arrival Time</b></th>

                <th style="width:200px;"></th>
            </tr>
            <% for (AvailableAirlines airline : airlines) { %>
            <tr>
                <td><%=airline.getAirline_No() %></td>
                <td><%=airline.getAirline_Name() %></td>
                <td><%=airline.getAirport_from() %></td>
                <td><%=airline.getAirport_to() %></td>
                <td><%=airline.getDate_time_departure() %></td>
                <td><%=airline.getDate_time_arrival() %></td>
                <td><button class="btn btn-primary" style="width:150px;">Book</button></td>
            </tr>
            <% } %>

        
        </table>
        
    </div>

    <style>
        th,td{
            padding:15px;
            width:200px;
        }
    </style>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
</body>
</html>