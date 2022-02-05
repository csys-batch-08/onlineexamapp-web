<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
body{
  background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
.home{
	float:right;
	margin-top:-50px;
	margin-right:15px;
	font-size:x-large;
	color:black;
	font-weight:bolder;
}
.imgalignment {
  width:450px;
  height:300px;
  border: 2px solid black;
}
.a4{
	background-color:white;
	font-color:black;
}
</style>
<title>About Us</title>
</head>
<body>
<a href="UserProfile"><img class="imgalign" src="./images/${sessionScope.profile.getPhoto()}" height="50px" width="55px" style="float:right;border-radius: 50%;margin-right:10px;margin-top:-3px;border:1px groove black;" title="My Profile" alt="My Profile"></a>
    <ul class="nav">
    	<li><a class="a1" href="userMain.jsp">Home</a></li>
        <li><a class="a2" href="index.jsp" onclick="logout()">Logout</a></li>
        <li><a class="a3" href="contactUs.jsp">Contact us</a></li>
        <li><a class="a4" href="aboutUs.jsp">About us</a></li>
        <li><a class="a5" href="showfeedback">My Feedbacks</a></li>
        <li><a class="a6" href="StudentScoreDetails">MyExams</a></li>
        
    </ul>
	<h2><u>About our Website</u></h2>
	<img alt="onlineExamImage" src="images/aboutUs.jpg" class="imgalignment">
	<p>We are best in conducting exams and grow knowledge of people</p>
	<p>We are conducting exams through our website</p>
	<p>Using our website you can write exam and you can know your status</p>
	<p>We are sure that you will learn something new from our website</p>
	<p>If you have any queries--->  <a href="contactUs.jsp" style="font-weight:bolder;font-size:large;">ContactUs</a></p>
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