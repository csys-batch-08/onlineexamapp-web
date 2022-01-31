<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
div{
	text-align:center;
	position:absolute;
	top:200px;
	left:550px;
}
body{
    background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
button{
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
</style>
<title>Exam Difficulty</title>
</head>
<body>
	<a href="userMain.jsp" style="float:right;font-weight:bolder;margin-top:10px;margin-right:15px;font-size: x-large;color:black;"><u>Home</u></a>
<div>
	<h2><u>Choose Difficulty of Exam</u></h2><br>
	<a href="UserChooseExams"><button type="submit" class="examButton">Easy</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<a href="UserChooseExams1"><button type="submit" class="examButton">Hard</button></a>
	</div>
</body>
</html>