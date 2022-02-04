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
.a5{
	background-color:white;
	font-color:black;
}
</style>
<title>Feedback Details</title>
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
	<h2><u>Feedback Details</u></h2>
<c:set var="count" value="1" />
<table style="width: 90%;margin-left: 70px;font-size:large;">
<caption>Feedbacks of users</caption>
        <tr>
        	<th>S.no.</th>
            <th>Feedback Id</th>
            <th>User Id</th>
            <th>Exam Id</th>
            <th>Feedback</th>
            <th>Feedback Date</th>
        </tr>
        <c:forEach items="${showfeedback}" var="feedback">
        	<tr>
            	<td>${count}</td>
                <td>${feedback.feedbackid}</td>
                <td>${feedback.userid}</td>
                <td>${feedback.examid}</td>
                <td>${feedback.feedback}</td>
         <td><fmt:parseDate value="${feedback.feedbackdate}"
							pattern="yyyy-MM-dd'T'HH:mm" var="parsedExamDate" type="both" /> <fmt:formatDate
							pattern="dd-MM-yyyy HH:mm" value="${parsedExamDate}" /></td>
               </tr>
            <c:set var="count" value="${count+1}" />
               </c:forEach>
               </table> 
</body>
</html>