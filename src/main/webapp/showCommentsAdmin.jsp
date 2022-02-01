<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
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
<title>Users Comments</title>
</head>
<body>
	<h2><u>Users Comments Details</u></h2>
	<a href="adminMain.jsp"><strong>Home</strong></a>
<div >
<table style="width: 80%;margin-left: 100px;font-size:large;">
<caption>Users comments</caption>
        <tr>
            <th>User Id</th>
            <th>Email</th>
            <th>Comments</th>
            <th>Comment Date</th>
        </tr>
        <c:forEach items="${contactlist}" var="contact">
        <fmt:parseDate pattern="yyyy-MM-dd" value="${contact.commentdate}"
				var="parsedCommentDate" />
        	<tr>
                <td>${contact.userid}</td>
                <td>${contact.email}</td>
                <td>${contact.comments}</td>
                <td><fmt:formatDate pattern="dd-MM-yyyy" value="${parsedCommentDate}" /></td>
                
               </tr>
               </c:forEach>
               </table> 
               </div>
</body>
</html>