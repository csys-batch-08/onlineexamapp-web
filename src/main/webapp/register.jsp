<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Register page</title>

<style>
h3 {
	float: right;
	margin-top: 10px;
	margin-right: 10px;
	font-weight: bolder;
	font-size: x-large;
	color: black;
}

body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

.registerform {
	background-color: whitesmoke;
	height: 515px;
	width: 400px;
	position: absolute;
	left: 480px;
	top: 50px;
	border-radius: 10px;
	box-shadow: 0 0 10px black;
	margin-top: 25px;
}

.registerform .registerformcontent {
	position: relative;
	padding-left: 110px;
	bottom: 25px;
	left: -40px;
}

.registerform .registerformcontent button {
	position: relative;
	left: 80px;
	bottom: 30px;
	font-weight: bolder;
	color: black;
}

.registerform .registerformcontent input {
	width: 250px;
	height: 30px;
	border-radius: 2px;
}

.registerform .registerformcontent h1 {
	position: relative;
	left: 25px;
	top: 40px;
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
</style>
</head>
<script>
    function match() {
        let ps1 = document.getElementById("password");
        let ps2 = document.getElementById("cpassword");
        if (ps1.value.trim() != ps2.value.trim()) {
           alert("Passwords must be same");
            return false;
        }
        else {
            return true;
        }
    }
</script>

<body>
	<a href="index.jsp"><h3>Back</h3></a>
	<div class="registerform">

		<form action="register" class="was-validated"
			onsubmit="return match()" method="post">
			<div class="registerformcontent">
				<h1>Registration</h1>
				<br>
				<br>
				<br> <input type="text" pattern="[A-Za-z]{3,}" name="firstName"
					id="firstName" placeholder="first name" autofocus required
					title="minimum 3 characters should be there." autofocus
					autocomplete="off" class="form-control"><br> <input
					type="text" pattern="[A-Za-z]+" name="lastName" id="lastName"
					placeholder="last name" required autofocus autocomplete="off"
					class="form-control"><br> <input type="email"
					pattern="[a-z0-9]+[@][a-zA-Z]+[.][a-z]+"
					title="You have to insert @ and . in the username ex.abc@gmail.com"
					name="email" id="email" required placeholder="email" autofocus
					autocomplete="off" class="form-control"><br> <input
					type="password"
					pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$"
					title="Minimum 8 characters should be there.There should be atleast one numeric,special character,capital letter and small letter."
					name="password" id="password" required minlength="8" maxlength="16"
					autofocus autocomplete="off" class="form-control"
					placeholder="password"><br> <input type="password"
					pattern="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&?/*$^]).{8,16}$"
					title="confirm password must be same as password" name="cpassword"
					id="cpassword" required minlength="8" maxlength="16" autofocus
					autocomplete="off" class="form-control"
					placeholder="confirm password"><br> <input type="text"
					pattern="[6-9]{1}[0-9]{9}" name="phone_number" id="phone_number"
					required minlength="10" maxlength="10" autofocus autocomplete="off"
					class="form-control" placeholder="phone number"><br>
				<br>
				<br>

				<button type="submit" style="margin-left: -35px; color: white"
					class="buttons button2">Submit</button>
				&nbsp;&nbsp;
				<button type="reset" style="color: white" class="buttons button2">Reset</button>
				<br>

			</div>
			<p id="pws"
				style="color: black; margin-left: 70px; font-weight: bolder; font-size: x-large;"></p>
		</form>
	</div>

</body>

</html>