<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style>
</style>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Main page</title>
    <link rel="stylesheet" href="UserMain.css">
</head>
<body>
    <a href="UserProfile"><img class="imgalign" src="./images/${sessionScope.profile.getPhoto()}" height="50px" width="55px" style="float:right;border-radius: 50%;margin-right:10px;margin-top:-3px;border:1px groove black;" title="My Profile" alt="My Profile"></a>
    <ul class="nav">
        <li><a class="a1" href="index.jsp" onclick="logout()">Logout</a></li>
        <li><a class="a1" href="contactUs.jsp">Contact us</a></li>
        <li><a class="a1" href="aboutUs.jsp" class="a1">About us</a></li>
        <li><a class="a1" href="showfeedback">My Feedbacks</a></li>
        <li><a class="a1" href="StudentScoreDetails">MyExams</a></li>
        
    </ul>
    <img src="images/onlineExamIcon.png" class="imgIcon" alt="online Exam Icon">
    <div class="h1">
      <h1>Explore the Exam</h1>
      <h1 style="margin-left: 70px;">Exclusively</h1>
      <h1 style="margin-left: 40px;">made for you</h1><br><br>
      
      	<h4><a href="filterByDifficulty.jsp"><button style="margin-left: 80px; margin-right: 60px;" class="button examButton">Take Exam</button></a><a href="studyMaterials.jsp"><button style="margin-right: 70px;" class="button studyButton">Study</button></a></h4>
    </div>
    <img src="images/onlineExamReferenceRemovedBackground.png" class="image" alt="online Exam Reference Background">
    
</body>
<script type="text/javascript">
	function logout(){
		alert("logged out successfully");
	}
</script>
</html>