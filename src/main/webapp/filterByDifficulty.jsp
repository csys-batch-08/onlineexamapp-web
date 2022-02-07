<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
div {
	text-align: center;
	position: absolute;
	top: 200px;
	left: 550px;
}

body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

button {
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
</style>
<title>Exam Difficulty</title>
</head>
<body>
	<a href="UserProfile"><img class="imgalign"
		src="./images/${sessionScope.profile.getPhoto()}" height="50px"
		width="55px"
		style="float: right; border-radius: 50%; margin-right: 10px; margin-top: -3px; border: 1px groove black;"
		title="My Profile" alt="My Profile"></a>
	<ul class="nav">
		<li><a class="a1" href="userMain.jsp">Home</a></li>
		<li><a class="a2" href="index.jsp" onclick="logout()">Logout</a></li>
		<li><a class="a3" href="contactUs.jsp">Contact us</a></li>
		<li><a class="a4" href="aboutUs.jsp" class="a1">About us</a></li>
		<li><a class="a5" href="showfeedback">My Feedbacks</a></li>
		<li><a class="a6" href="StudentScoreDetails">MyExams</a></li>
	</ul>
	<div>
		<h2>
			<u>Choose Difficulty of Exam</u>
		</h2>
		<br> <a href="UserChooseExams"><button type="submit"
				class="examButton">Easy</button></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="UserChooseExams1"><button type="submit"
				class="examButton">Hard</button></a>
	</div>
</body>
<script type="text/javascript">
function logout() {
	var result = confirm("Do you want to logout?");
	if (result == false) {
		event.preventDefault();
	}
}
</script>
</html>