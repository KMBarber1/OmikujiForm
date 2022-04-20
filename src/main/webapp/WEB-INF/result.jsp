<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
       
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
<link rel="stylesheet" href="/css/style.css"/>


</head>
<body>

	<h1>Here's Your Omikuji!!!</h1>
	
	<div id="container">
		<h3 id="message">In <c:out value="${number}"/> years, you will live in ${city} with <c:out value="${name}"/> 
		as your roommate, <c:out value="${hobby}"/> for a living. The next time you see a <c:out value="${livingThing}"/>, 
		you will have good luck. Also, <c:out value="${somethingNice}"/>.</h3>
	</div>
	
	<div>
		<a href="/omikuji">Go Back</a>
	</div>

</body>
</html>