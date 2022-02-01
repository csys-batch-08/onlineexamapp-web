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
<title>Feedback Details</title>
</head>
<body>
	<h2><u>Feedback Details</u></h2>
	<a href="adminMain.jsp"><strong>Home</strong></a>

<table style="width: 80%;margin-left: 100px;font-size:large;">
<caption>Feedbacks of users</caption>
        <tr>
            <th>Feedback Id</th>
            <th>User Id</th>
            <th>Exam Id</th>
            <th>Feedback</th>
            <th>Feedback Date</th>
        </tr>
        <c:forEach items="${showfeedback}" var="feedback">
        <fmt:parseDate pattern="yyyy-MM-dd" value="${feedback.feedbackdate}"
				var="parsedFeedbackDate" />
        	<tr>
                <td>${feedback.feedbackid}</td>
                <td>${feedback.userid}</td>
                <td>${feedback.examid}</td>
                <td>${feedback.feedback}</td>
                <td><fmt:formatDate pattern="dd-MM-yyyy" value="${parsedFeedbackDate}" /></td>
                
               </tr>
               </c:forEach>
               
               </table> 
</body>
</html>