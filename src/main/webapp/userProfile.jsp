<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
a{
float:right;
margin-right:15px;
margin-top:10px;
color:black;
font-size:large;
font-weight:bolder;
}
body {
   background: linear-gradient(to right, springgreen, rgb(253, 253, 53));

}
.container{
text-align:center;
margin-top:45px;
}
a{
margin-top:-20px;
font-size:x-large;
font-weight:bolder;
}
.choosefile{
margin-left:150px;
}
.emailalign{
margin-left:25px;
}
.phonealign{
margin-left:-30px;
}
img{
margin-left:90px;
border:3px groove black;
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
  border-radius:4px;
}
.button2 {
background-color: #008CBA;
}
.button2:hover {
  box-shadow: 0 12px 16px 0 rgba(0,0,0,0.24),0 17px 50px 0 rgba(0,0,0,0.19);
}
.change{
margin-left:615px;
}
</style>
<title>User Profile</title>
</head>
<body>
	<a href="userMain.jsp">Home</a>
	<div class="container">
		
		<img src="./images/${sessionScope.profile.getPhoto()}" style="border-radius:50%;height:250px;width:260px;border-color:black" alt="profile picture"><br><br>
		
		<button id="photo" onclick="photochange()" style="display: block;" class="buttons button2 change">Change photo</button>
		<div id="photochange" style="display: none;">
		<form action="changeprofile" method="post">
		<input type="file" id="avatar" name="avatar" class="choosefile buttons button2"><br><br>
		<button type="submit" class="buttons button2">Change photo</button>&nbsp;&nbsp;<button type="button" class="buttons button2" onclick="hidechange()">Cancel</button>
		</form></div>
		<br>
		<form action="editprofile" method="post">
		<label for="firstname">Firstname : </label><input type="text" name="firstname" id="firstname" value="${sessionScope.profile.getFirst_name()}"><br><br>
		<label for="lastname">Lastname : </label><input type="text" name="lastname" id="lastname" value="${sessionScope.profile.getLast_name()}"><br><br>
		<label for="email" class="emailalign">Email : </label><input type="email" name="email" id="email" value="${sessionScope.profile.getEmail()}" readonly><br><br>
		<label for="phone" class="phonealign">Phone number : </label><input type="text" name="phone" id="phone" value="${sessionScope.profile.getPhone_number()}"><br><br>
		<button type="submit" class="buttons button2">Edit Profile</button>
		</form></div>
		
		
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
</script>
</html>