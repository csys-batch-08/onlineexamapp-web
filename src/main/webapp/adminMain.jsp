<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Admin Main page</title>
<link rel="stylesheet" href="index.css">
<style>
.a1 {
	background-color: white;
	font-color: black;
}
</style>
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
	<img src="images/onlineExamIcon.png" class="imgIcon"
		alt="online Exam Icon">
	<div class="h1">
		<h1>Explore the Exam</h1>
		<h1 style="margin-left: 70px;margin-top:-30px;">Exclusively</h1>
		<h1 style="margin-left: 40px;margin-top:-30px;">made for you</h1>
		<br>
		<br>
		</div>
		<img src="images/onlineExamReferenceRemovedBackground.png"
		class="image" alt="online Exam Reference Background">
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