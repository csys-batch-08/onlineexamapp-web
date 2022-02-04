<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
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
.a3{
	background-color:white;
	font-color:black;
}
</style>
<title>Users Comments</title>
</head>
<body>
<ul class="nav">
    	<li><a class="a1" href="adminMain.jsp">Home</a></li>
        <li><a class="a2" href="index.jsp">Logout</a></li>
        <li><a class="a3" href="ShowCommentsAdmin">Contact us</a></li>
        <li><a class="a4" href="aboutUsAdmin.jsp">About us</a></li>
        <li><a class="a5" href="ShowFeedbackAdmin">Feedbacks</a></li>
        <li><a class="a6" href="examDetails.jsp">Admin Actions</a></li>
    </ul>
	<h2><u>Users Comments Details</u></h2>
<div >
<c:set var="count" value="1" />
<table style="width: 90%;margin-left: 70px;font-size:large;">
<caption>Users comments</caption>
        <tr>
        	<th>S.no.</th>
            <th>User Id</th>
            <th>Email</th>
            <th>Comments</th>
            <th>Comment Date</th>
        </tr>
        <c:forEach items="${contactlist}" var="contact">
        	<tr>
            	<td>${count}</td>
                <td>${contact.userid}</td>
                <td>${contact.email}</td>
                <td>${contact.comments}</td>
                <td><fmt:parseDate value="${contact.commentdate}"
							pattern="yyyy-MM-dd'T'HH:mm" var="parsedExamDate" type="both" /> <fmt:formatDate
							pattern="dd-MM-yyyy HH:mm" value="${parsedExamDate}" /></td>
               </tr>
            <c:set var="count" value="${count+1}" />
               </c:forEach>
               </table> 
               </div>
</body>
</html>