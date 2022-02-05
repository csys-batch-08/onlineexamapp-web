<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<link rel="stylesheet" href="index.css">
<style type="text/css">
.websitetext{
	margin-top:-10px;
	font-weight:bolder;
	font-size:x-large;
}
</style>
</head>
<body>
	
	<ul class="nav">
		<li><a href="login.jsp">Login</a></li>
		<li><a href="register.jsp">Register</a></li>
	</ul>
	<img src="images/onlineExamIcon.png" class="imgIcon"
		alt="online Exam Icon">
		<marquee class="websitetext">Here you can improve your knowledge by writing exams and by using materials...</marquee>
	<div class="h1">
		<h1>Explore the Exam</h1>
		<h1 style="margin-left: 70px;margin-top:-30px;">Exclusively</h1>
		<h1 style="margin-left: 40px;margin-top:-30px;">made for you</h1>
		<br>
		<br>
		<h4 class="buttonsalignment">
			<button style="margin-left: 80px; margin-right: 60px;" class="button examButton" onclick="loginfirst()">Take Exam</button>
			<button style="margin-right: 70px;" class="button studyButton" onclick="login()">Study</button>
		</h4>
		</div>
		<img src="images/onlineExamReferenceRemovedBackground.png"
		class="image" alt="online Exam Reference Background">
</body>
<script>
function loginfirst(){
	alert("You have to Register if new user!\nOtherwise login and take exam.");
}
function login(){
	alert("You have to Register if new user!\nOtherwise login and take materials.");
}
</script>
</html>