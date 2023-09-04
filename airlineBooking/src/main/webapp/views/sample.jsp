<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sample Form data </title>
</head>
<body>

<form action="adminSubmit" method="POST">
	
	<label>airline name</label>
	<input type="text" name="Airline_Name" id="Airline_Name" />
	<label>airline no</label>
	<input type="text" name="Airline_No" id="Airline_No" />
	
	<label>airport from</label>
	<input type="text" name="airport_from" id="airport_from" />
	
	<label>airport to</label>
	<input type="text" name="airport_to" id="airport_to" />
	
	<label>business</label>
	<input type="number" name="business_seats" id="business_seats" />
	<label>Economy</label>
	<input type="number" name="economy_seats" id="economy_seats" />
	<label>First Class</label>
	<input type="number" name="first_class_seats" id="first_class_seats" />
	<label>Departure Time</label>
	<input type="date" name="date_time_departure" id="date_time_departure" />
	<label>Arrival Time</label>
	<input type="date" name="date_time_arrival" id="date_time_arrival" />
	<label>Airport From id</label>
	<input type="text" name="airport_from_id" id="airport_from_id" />
	<label>Airport to id </label>
	<input type="text" name="airport_to_id" id="airport_to_id" />
	
	<button class="btn btn-submit">Submit</button>
	
</form>

</body>
</html>



