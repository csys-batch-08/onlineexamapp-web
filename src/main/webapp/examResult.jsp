<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
.container{
text-align:center;
font-size:x-large;
font-weight:bolder;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
}
.examButton{
  background-color: rgb(171, 255, 36);  
  color: black; 
  font-weight: bold;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  border: 4px solid black;
}
.examButton:hover,.examButton :active{
  background-color: black;
  color: white;
  transition: 2ms;
}
.homealign{
float:right;
font-weight:bolder;
font-size:x-large;
color:black;
margin-top:-75px;
margin-right:15px;
}
h2{
	text-align:center;
}
.feedback{
margin-left:573px;
}
</style>
<title>Exam Result</title>
</head>
<body>
	<h2><u>Score Details</u></h2><br><br>
	<a href="userMain.jsp" class="homealign">Home</a>
<div class="container">
Your mark is:  ${score}<br><br>
Your status is:  ${passfail}<br><br>
Your grade is:  ${grade}<br><br><br>
</div>
<a href="feedbackDetails?userid=${userid}&examid=${examid}&examname=${examName}" class="feedback"><button type="submit" class="button examButton">Send Feedback</button></a>
	
</body>
</html>