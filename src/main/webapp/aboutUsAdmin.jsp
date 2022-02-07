<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

.home {
	float: right;
	margin-top: -45px;
	margin-right: 15px;
	font-size: x-large;
	color: black;
	font-weight: bolder;
}

a {
	color: black;
}

img {
	width: 450px;
	height: 300px;
	border: 2px solid black;
}

.a4 {
	background-color: white;
	font-color: black;
}
</style>
<title>About Us</title>
</head>
<body>
	<ul class="nav">
		<li><a class="a1" href="adminMain.jsp">Home</a></li>
		<li><a class="a2" href="index.jsp" onclick="logout()">Logout</a></li>
		<li><a class="a3" href="ShowCommentsAdmin">Contact us</a></li>
		<li><a class="a4" href="aboutUsAdmin.jsp">About us</a></li>
		<li><a class="a5" href="ShowFeedbackAdmin">Feedbacks</a></li>
		<li><a class="a6" href="examDetails.jsp">Admin Actions</a></li>
	</ul>
	<h2>
		<u>About our Website</u>
	</h2>
	<img alt="onlineExamImage" src="images/aboutUs.jpg">
	<p>We are best in conducting exams and grow knowledge of people</p>
	<p>We are conducting exams through our website</p>
	<p>Using our website you can write exam and you can know your
		status</p>
	<p>We are sure that you will learn something new from our website</p>
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