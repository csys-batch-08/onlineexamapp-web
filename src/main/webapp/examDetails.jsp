<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
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

.container {
	text-align: center;
	margin-left: -25%;
	margin-top: 100px;
}

.container2 {
	text-align: center;
	margin-left: 25%;
	margin-top: -305px;
}

.addexamalign {
	text-align: center;
}

.a6 {
	background-color: white;
	font-color: black;
}
</style>
<title>Exam Details Page</title>
<link rel="stylesheet" href="ExamDetails.css">
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
	<div class="container">

		<h2>
			<u>List of Exams</u>
		</h2>
		<a href="ShowExams"><button type="submit"
				class="button examButton">Show Exams</button></a><br>
		<br>
		<br>
		<h2>
			<u>List of Active Users</u>
		</h2>
		<a href="ShowUsers"><button type="submit"
				class="button examButton">Show Active Users</button></a><br>
	</div>
	<div class="container2">
		<h2>
			<u>List of Exams report</u>
		</h2>
		<a href="ShowUsersExams"><button type="submit"
				class="button examButton">Show Exams report</button></a><br>
		<br>
		<br>
		<h2>
			<u>List of Inactive Users</u>
		</h2>
		<a href="ShowInactiveUsers"><button type="submit"
				class="button examButton">Show Inactive users</button></a>
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