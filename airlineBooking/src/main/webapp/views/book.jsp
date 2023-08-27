<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    
  
    <title>Booking Flight</title>
    <style>
      label{margin-left: 20px;}
      #datepicker{width:180px;}
      #datepicker > span:hover{cursor: pointer;}
    </style>
	</head>
	
<body>
    <%@include file="navbar.jsp" %>
    
    <div class="container m-5">
    	
    	<form action="/searchflight">
    		<div class="row">
    			<div class="col-sm-2">
    				<label>Starting Position</label>
    			</div>
    			<div class="col-sm-10">
    				<select id="starting" name="starting" onclick="onclickstarting()" required>
    					<option value="">-- Select the starting point --</option>
    				</select>
    			</div>
    			
    		</div>
    		
    		<br />
    		<div class="row">
    			<div class="col-sm-2">
    				<label>Destination</label>
    			</div>
    			<div class="col-sm-10">
    				<select id="destination" name="destination" onclick="onclickdestination()" required>
              <option value="">-- Select the destination point --</option>
            </select>
    			</div>
    			
    		</div>
        <br />
        <div class="row">
          <div class="col-sm-2">
    				<label>Select Date</label>
    			</div>
          <div class="col-sm-10">
            <input id="date" name="date" type="date">
          </div>
        </div>
    		<br>
    		<button class="btn btn-primary" id="search_f">Search Flights</button>
    	</form>
    	
    </div>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    
      <script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.7.0.min.js" integrity="sha256-2Pmvv0kuTBOenSvLm6bvfBSSHrUJ+3A7x6P5Ebd07/g=" crossorigin="anonymous"></script>
    
    <script>

      function onclickstarting()
      {
        console.log("Staring point onclick")
        console.log("using ajax for the dropdown population")
        $.ajax({
    				
    				url : "startingpoint",
    				data:"cool",
    				type:"GET",
    				
    				success : function(data,textStatus,jqXHR)
    				{
    					for(i=0;i<data.length;i++)
              {
                console.log(data[i]);
                $('#starting').append('<option value="' + data[i] + '">' + data[i]  + '</option>');
              }
              
         
              
    					console.log("success............");
    				},
    			
    			error : function(jqXHR,textStatus,errorThrown)
				{
					console.log(data);
					console.log("error............");
				}
    			})
      }

      function onclickdestination()
      {
        console.log("Destination point onclick")
        console.log("using ajax for the dropdown population")
        $.ajax({
    				
    				url : "destinationpoint",
    				data:"cool",
    				type:"GET",
    				
    				success : function(data,textStatus,jqXHR)
    				{
    					for(i=0;i<data.length;i++)
              {
                console.log(data[i]);
                $('#destination').append('<option value="' + data[i] + '">' + data[i]  + '</option>');
              }
              
         
              
    					console.log("success............");
    				},
    			
    			error : function(jqXHR,textStatus,errorThrown)
				{
					console.log(data);
					console.log("error............");
				}
    			})
      }

      

    </script>
    
	
  </body>
  </html>