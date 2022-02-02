<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
div{
text-align:center;
font-weight:bolder;
font-size:large;
}
body{
  background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
.home{
	float:right;
	margin-top:-50px;
	margin-right:10px;
	font-size:x-large; 
}
.pdf{
	margin-top:120px;
}
.imgalignment{
border-radius:20px;
box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
.imgalignment:hover{
	transition: transform .2s;
	transform: scale(1.1);
	box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
.py{
width:320px;
height:180px;
}
table {
	margin-left:150px;
    border-collapse: separate;
    border-spacing: 35px;
}
caption{
font-weight:bolder;
font-size:x-large;
}
</style>
<title>Study Materials</title>
</head>
<body>
<div>
<a href="UserProfile"><img class="imgalign" src="./images/${sessionScope.profile.getPhoto()}" height="50px" width="55px" style="float:right;border-radius: 50%;margin-right:10px;margin-top:-3px;border:1px groove black;" title="My Profile" alt="My Profile"></a>
    <ul class="nav">
    	<li><a class="a1" href="userMain.jsp">Home</a></li>
        <li><a class="a2" href="index.jsp" onclick="logout()">Logout</a></li>
        <li><a class="a3" href="contactUs.jsp">Contact us</a></li>
        <li><a class="a4" href="aboutUs.jsp" class="a1">About us</a></li>
        <li><a class="a5" href="showfeedback">My Feedbacks</a></li>
        <li><a class="a6" href="StudentScoreDetails">MyExams</a></li>
        
    </ul><br>
	<table>
	<caption><u>Study Materials</u></caption><th></th>
	<tbody><tr>
	<td><a href="studyMaterials/javaMcqQuestions.pdf"><img alt="java image" src="./images/javaPdfImage.jpg" class="imgalignment"></a></td>
	<td><a href="studyMaterials/htmlMcqQuestions.pdf"><img alt="html image" src="./images/htmlPdfImage.jpg" class="imgalignment"></a></td>
	<td><a href="studyMaterials/cssMcqQuestions.pdf"><img alt="css image" src="./images/cssPdfImage.png" class="imgalignment"></a></td></tr>
	<tr><td></td><td><a href="studyMaterials/pythonMcqQuestions.pdf"><img alt="python image" src="./images/pythonPdfImage.png" class="imgalignment py"></a></td>
	</tr></tbody></table>
	
</body>
</html>