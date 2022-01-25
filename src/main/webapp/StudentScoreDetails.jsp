<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
    background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
table,th,td{
    border: 1px solid black;
    border-collapse: collapse;
    padding: 20px;
}
h2{
	text-align:center;
}
a{
	float:right;
	margin-right:15px;
	margin-top:-40px;
	font-weight:bolder;
	font-size:x-large;
	color:black;
}
</style>
<title>Score Details</title>
</head>
<body>
	<h2><u>Score Details</u></h2>
	<a href="UserMain.jsp"><b>Home</b></a>
	<table style="width: 80%;margin-left: 100px;font-size:large;">
        <tr>
            <th>Student name</th>
            <th>Exam Name</th>
            <th>Score</th>
            <th>PassOrFail</th>
            <th>Grade</th>
            <th>Exam Date</th>
        </tr>
        <c:forEach items="${scorelist}" var="scores">
        	<tr>
                <td>${sessionScope.username}</td>
                <td>${scores.examName}</td>
                <td>${scores.score}</td>
                <td>${scores.passOrFail}</td>
                <td>${scores.grade}</td>
                <td>${scores.examdate}</td>
                
               </tr>
               </c:forEach>
               </table> 
               
     
</body>
</html>
