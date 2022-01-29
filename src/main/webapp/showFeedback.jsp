<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
<title>Feedback Details</title>
</head>
<body>
	<h2><u>Feedback Details</u></h2>
	<a href="userMain.jsp"><b>Home</b></a>
               
<table style="width: 80%;margin-left: 100px;font-size:large;">
   <tr>
      <th>User name</th>
            <th>Exam Id</th>
            <th>Feedback</th>
            <th>Feedback Date</th>
            
   </tr>

   <c:forEach items="${feedback}" var="list">
     <tr>
     	 <td>${list.username}</td>
         <td>${list.examid}</td>
         <td>${list.feedback}</td>
         <td>${list.feedbackdate}</td>
        
     </tr>
   </c:forEach>

 </table>
</body>
</html>