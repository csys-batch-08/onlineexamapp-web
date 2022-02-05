<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
    <title>Login Page</title>
    <style>
      @import url('https://fonts.googleapis.com/css2?family=Arvo&display=swap');
* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Arvo';
}
body {
           background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
.elementToFadeInAndOut {
    -webkit-animation: fadeinout 0.5s linear forwards;
    animation: fadeinout 2s linear forwards;
}
@-webkit-keyframes fadeinout {
  30%,100% { opacity: 0; }
  50% { opacity: 1; }
}
@keyframes fadeinout {
  70%,100% { opacity: 0; }
  50% { opacity: 1; }
}
.wrapper {
    max-width: 350px;
    min-height: 300px;
    margin-top: 120px;
    margin-left: 520px;
    padding: 10px 40px 10px 40px;
    background-color: #ecf0f3;
    border-radius: 15px;
    box-shadow: 0 0 15px black;
}
.wrapper .name {
    font-weight: 600;
    font-size: 1.4rem;
    letter-spacing: 1.3px;
    padding-left: 10px;
    color: #555
    
}
.wrapper .form-field input {
    width: 100%;
    display: block;
    border: none;
    outline: none;
    background: none;
    font-size: 1.2rem;
    color: #666;
    padding: 10px 30px 10px 10px
}
.wrapper .form-field {
    padding-left: 5px;
    margin-bottom: 20px;
    border-radius: 4px;
    box-shadow: inset 8px 8px 8px #cbced1, inset -8px -8px 8px #fff;
}
.wrapper .form-field .fas {
    color: #555
}
.wrapper .btn {
    box-shadow: none;
    width: 100%;
    height: 40px;
    background-color: #03A9F4;
    color: #fff;
    border-radius: 25px;
    /* box-shadow: 1px 1px 1px #b1b1b1, 1px 1px 1px #fff; */
    letter-spacing: 1.3px
}
.wrapper .btn:hover {
    background-color: #039BE5
}
.wrapper a {
    text-decoration: none;
    font-size: 0.8rem;
    color: #03A9F4
}
.wrapper a:hover {
    color: #039BE5
}
@media(max-width: 380px) {
    .wrapper {
        margin: 30px 20px;
        padding: 40px 15px 15px 15px
    }
}
.text-center fs-6{
    font-size: large;
}
.pagination  a {
    font-size: 105%;
    text-align:center;
}
.input box  input focus{
    border-color: darkgoldenrod;
} 
.login{
text-align:center;
}
.wrapper{
margin-top:70px;
}
.passwordandsignup{
margin-top:20px;
margin-left:105px;
}
.passwordandpassword{
margin-left:70px;
}
.back{
float:right;
margin-right:20px;
margin-top:25px;
color:black;
font-weight:bolder;
font-size:x-large;
}
</style>
    
</head>
<body>
	<a href="index.jsp" class="back">Back</a>
    <span class="border border-dark">
    <div class="wrapper">
        <div class="text-center mt-4 name login"> Login </div>
        <br>
        <form action="loginservlet" method="post" class="was-validated" class="p-3 mt-3">
            <div class="input box">
                <div class="form-field d-flex align-items-center"> <span class="far fa-user"></span> <input type="email" name="email" id="email" placeholder="email" pattern="[a-z0-9]+[@][a-zA-Z]+[.][a-z]+"
                  title="You have to insert @ and . in the username ex.abc@gmail.com" required autofocus autocomplete="off" class="form-control"> </div>
                <br>
            </div>
               <div class="form-field d-flex align-items-center"> <span class="fas fa-key"></span> <input type="password" name="password" id="password" placeholder="Password" pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$"
                    title="Minimum 8 characters should be there.There should be atleast one numeric,special character,capital letter and small letter." required autocomplete="off" class="form-control"> </div>
               
            
            <input type="checkbox" onclick="myFunction()">Show Password<br>
            
            <button type="submit" class="btn mt-3" style="cursor: pointer;">Login</button>
            <br><br>
            <div class="pagination passwordandpassword">
            <a href="userPasswordUpdate.jsp">Forgot password?</a>        
              </div> 
            <div class="pagination passwordandsignup"> 
             <a href="register.jsp">Sign up</a> 
            </div>
            
        </form>
        <br>	
</span>

</body>
<script>
function myFunction() {
  var x = document.getElementById("password");
  if (x.type === "password") {
    x.type = "text";
  } else {
    x.type = "password";
  }
}
</script>
</html>