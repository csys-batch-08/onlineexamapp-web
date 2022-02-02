<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Main page</title>
    <link rel="stylesheet" href="UserMain.css">
    <style>
    .a1{
	background-color:white;
	font-color:black;
}
    </style>
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
    <img src="images/onlineExamIcon.png" class="imgIcon" alt="onlineexamicon">
    <div class="h1">
      <h1>Explore the Exam</h1>
      <h1 style="margin-left: 70px;">Exclusively</h1>
      <h1 style="margin-left: 40px;">made for you</h1><br><br>
      <h4><a href=""><button style="margin-left: 80px; margin-right: 60px;" class="button examButton">Take Exam</button></a><a href=""><button style="margin-right: 70px;" class="button studyButton">Study</button></a></h4>
    </div>
    <img src="images/onlineExamReferenceRemovedBackground.png" class="image" alt="examimage">
    
</body>
</html>