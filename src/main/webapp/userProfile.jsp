<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
a {
	float: right;
	margin-right: 15px;
	margin-top: 10px;
	color: black;
	font-size: large;
	font-weight: bolder;
}

body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

.container {
	text-align: center;
	margin-top: -15px;
}

a {
	margin-top: 20px;
	font-size: x-large;
	font-weight: bolder;
}

.choosefile {
	margin-left: 150px;
}

.emailalign {
	margin-left: 25px;
}

.phonealign {
	margin-left: -30px;
}

img {
	margin-left: 80px;
	border: 3px groove black;
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

.change {
	margin-left: 615px;
}

h2 {
	margin-left: 80px;
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
<title>User Profile</title>
</head>
<body>
	<a href="userMain.jsp">Home</a>
	<div class="container">
		<h2>
			<u>My profile</u>
		</h2>
		<img src="./images/${sessionScope.profile.getPhoto()}"
			style="border-radius: 50%; height: 250px; width: 260px; border-color: black"
			alt="profile picture"><br>
		<br>

		<button id="photo" onclick="photochange()" style="display: block;"
			class="buttons button2 change">Change photo</button>
		<div id="photochange" style="display: none;">
			<form action="changeprofile" method="post">
				<input type="file" id="avatar" name="avatar"
					class="choosefile buttons button2"><br>
				<br>
				<button type="submit" class="buttons button2">Change photo</button>
				&nbsp;&nbsp;
				<button type="button" class="buttons button2" onclick="hidechange()">Cancel</button>
			</form>
		</div>
		<br> <label for="firstname">Firstname : </label><input
			type="text" name="firstname" id="firstname"
			value="${sessionScope.profile.getFirstName()}"><br>
		<br> <label for="lastname">Lastname : </label><input type="text"
			name="lastname" id="lastname"
			value="${sessionScope.profile.getLastName()}"><br>
		<br> <label for="email" class="emailalign">Email : </label><input
			type="email" name="email" id="email"
			value="${sessionScope.profile.getEmail()}"><br>
		<br> <label for="phone" class="phonealign">Phone number :
		</label><input type="text" name="phone" id="phone"
			value="${sessionScope.profile.getPhoneNumber()}"><br>
		<br>
		<button type="submit" class="buttons button2"
			onclick="profileupdated()">Edit Profile</button>
	</div>
	<div id="snackbar">Profile updated successfully!</div>

</body>
<script>
function photochange(){
	let photo=document.getElementById("photo");
	photo.style.display="none";
	let photochange=document.getElementById("photochange");
	photochange.style.display="block";
}
function hidechange(){
	var add=document.getElementById("photo");
	add.style.display="block";
	var addexam=document.getElementById("photochange");
	addexam.style.display="none";
}
function profileupdated(){
	let firstName=document.getElementById("firstname").value;
	let lastName=document.getElementById("lastname").value;
	let Email=document.getElementById("email").value;
	let phoneNumber=document.getElementById("phone").value;
	var url="editprofile?firstname="+firstName+
			"&lastname="+lastName+
			"&email="+Email+
			"&phone="+phoneNumber;
	if(window.XMLHttpRequest){  
		request=new XMLHttpRequest();  
		}  
		else if(window.ActiveXObject){  
		request=new ActiveXObject("Microsoft.XMLHTTP");  
		}  
	try  
	{  
	request.onreadystatechange=getInfo;  
	request.open("GET",url,true);  
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
</script>
</html>