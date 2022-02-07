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
	margin-top: 10px;
	margin-right: 15px;
	font-size: x-large;
	font-weight: bolder;
}

.login {
	margin-left: 100px;
	margin-top: 190px;
}

.container {
	text-align: center;
	position: absolute;
	top: 150px;
	left: 520px;
	padding: 35px;
	width: 20%;
	height: 45%;
	background-color: whitesmoke;
	/* border: 5px solid rgb(144, 138, 138); */
	border-radius: 30px;
	box-shadow: 0 0 15px black;
}

.container input {
	outline: none;
	height: 20px;
}

.buttons {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 7px 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 4px 2px;
	cursor: pointer;
	border-radius: 4px;
}

.button2 {
	background-color: #008CBA;
}

.button2:hover {
	box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0
		rgba(0, 0, 0, 0.19);
}

.a3 {
	background-color: white;
	font-color: black;
}

textarea {
	width: 270px;
	height: 150px;
}

#snackbar {
	visibility: hidden;
	min-width: 250px;
	margin-left: -125px;
	background-color: green;
	color: white;
	text-align: center;
	border-radius: 2px;
	padding: 16px;
	position: fixed;
	z-index: 1;
	left: 50%;
	top: 30px;
	font-size: 17px;
}

#snackbar.show {
	visibility: visible;
	-webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
	animation: fadein 0.5s, fadeout 0.5s 2.5s;
}

@
-webkit-keyframes fadein {
	from {top: 0;
	opacity: 0;
}

to {
	top: 30px;
	opacity: 1;
}

}
@
keyframes fadein {
	from {top: 0;
	opacity: 0;
}

to {
	top: 30px;
	opacity: 1;
}

}
@
-webkit-keyframes fadeout {
	from {top: 30px;
	opacity: 1;
}

to {
	top: 0;
	opacity: 0;
}

}
@
keyframes fadeout {
	from {top: 30px;
	opacity: 1;
}

to {
	top: 0;
	opacity: 0;
}
}
</style>
<title>Contact Us</title>
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
	<div class="container">
		<h2 class="h1move" class="login">
			Contact Admin
		</h2>
		<label for="comments">Drop your Comments:</label><br>
		<textarea name="comments" id="comments" required autofocus></textarea>
		<br>
		<br>
		<button type="submit" class="buttons button2" onclick="contact()">Submit</button>
		</div>
		<div id="snackbar">Profile updated successfully!</div>
</body>
<script type="text/javascript">
function contact(){
	let comment=document.getElementById("comments").value;
	var url="contact?comments="+comment;
	if(window.XMLHttpRequest){  
		request=new XMLHttpRequest();  
		}  
		else if(window.ActiveXObject){  
		request=new ActiveXObject("Microsoft.XMLHTTP");  
		}  
	try  
	{  
	request.onreadystatechange=getInfo;  
	request.open("POST",url,true);  
	request.send();  
	}  
	catch(e)  
	{  
	alert("Unable to connect to server");  
	}
} 
function getInfo(){  
	if(request.readyState==4){  
	var val=request.responseText;
	document.getElementById("snackbar").innerHTML=val;
	var x =document.getElementById("snackbar");
	x.className = "show";
	setTimeout(function(){ x.className = x.className.replace("show", ""); }, 3000);
	}   
} 

function logout() {
	var result = confirm("Do you want to logout?");
	if (result == false) {
		event.preventDefault();
	}
}
</script>
</html>