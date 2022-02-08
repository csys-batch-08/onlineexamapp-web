<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

h2 {
	text-align: center;
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

.examButton {
	background-color: rgb(171, 255, 36);
	color: black;
	font-weight: bold;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border: 4px solid black;
}

.examButton:hover, .examButton :active {
	background-color: black;
	color: white;
	transition: 2ms;
}
.feedbackarea{
	width:300px;
	height:150px;
}
</style>
<title>Feedback Details</title>
</head>
<body>
	<a href="userMain.jsp"><h4
			style="float: right; margin-right: 10px; margin-top: -0.3px; font-size: x-large; color: black;">
			<u>Home</u>
		</h4></a>

	<form action="feedbacks" method="post"
		style="text-align: center; font-size: large;">
		<h2 style="margin-left: 75px;">
			<u>Feedback Details</u>
		</h2>
		<br>
		<br>
		<br> <input style="visibility: hidden;" type="text" id="examId"
			name="examId" value="${idofexam}"> <input
			style="visibility: hidden;" type="text" id="examName" name="examName"
			value="${Nameofexam}"> <input style="visibility: hidden;"
			type="text" id="studentId" name="uID" value="${idofuser}" />
		<p style="font-size: large; font-weight: bolder;">
			<u>Drop your feedback</u>
		</p>
		<textarea name="feedback" id="feedback" class="feedbackarea" autofocus required></textarea>
		<br>
		<br>
		<button type="submit" class="button examButton">Submit</button>
	</form>
</body>
</html>