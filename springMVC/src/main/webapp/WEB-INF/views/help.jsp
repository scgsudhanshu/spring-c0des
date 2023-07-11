<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This is Hel Page</h1>
<%-- <%

String helpline = (String) request.getAttribute("helpline no");
String email = (String) request.getAttribute("helpline email");
%>
 --%>
<h2>${helplineno}</h2>
<h2>${helplineemail} </h2>

<c:forEach var="friend" items="${friends }">

<h2>${ friend}</h2>
</c:forEach> 
</body>
</html>