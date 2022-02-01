<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
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
.java{
	margin-left:-740px;
	margin-top:18px;
	font-weight:bold;
	font-size:x-large;
	text-shadow: 1px 1px 2px #000000;
}
.css{
	margin-left:710px;
	margin-top:-30px;
	font-weight:bold;
	font-size:x-large;
	text-shadow: 1px 1px 2px #000000;
}
.html{
	margin-top:-25px;
	margin-left:-8px;
	font-weight:bold;
	font-size:x-large;
	text-shadow: 1px 1px 2px #000000;
}
img{
border-radius:20px;
box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
img:hover{
	transition: transform .2s;
	transform: scale(1.1);
	box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
.py{
width:320px;
height:180px;
}
table {
    border-collapse: separate;
    border-spacing: 35px;
}

</style>
<title>Study Materials</title>
</head>
<body>
<div>
	<h3><u>Here you can learn more</u></h3>
	<p class="home"><a href="userMain.jsp" style="color:black;">Home</a></p><br><br>
	<table>
	<caption><u>Study Materials</u></caption><th></th>
	<tbody><tr>
	<td><a href="studyMaterials/javaMcqQuestions.pdf"><img alt="java image" src="./images/javaPdfImage.jpg"></a></td>
	<td><a href="studyMaterials/htmlMcqQuestions.pdf"><img alt="html image" src="./images/htmlPdfImage.jpg"></a></td>
	<td><a href="studyMaterials/cssMcqQuestions.pdf"><img alt="css image" src="./images/cssPdfImage.png"></a></td></tr>
	<tr><td><a href="studyMaterials/pythonMcqQuestions.pdf"><img alt="python image" src="./images/pythonPdfImage.png" class="py"></a></td>
	</tr></tbody></table>
	
</body>
</html>