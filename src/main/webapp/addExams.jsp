<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add exams</title>
<style type="text/css">
.useralign{
margin-left:623px;
}
.back{
color:black;
}
body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 15px;
	margin: 4px 2px;
	transition-duration: 0.4s;
	cursor: pointer;
}

.examButton {
	background-color: rgb(171, 255, 36);
	color: black;
	font-weight: bold;
	font-family: Verdana, Geneva, Tahoma, sans-serif;
	border: 4px solid black;
}

.examButton:hover, .examButton :active {
	background-color: black;
	color: white;
	transition: 2ms;
}

.addexamalign {
	text-align: center;
	margin-top:210px;
}
</style>
</head>
<body>
	<h4 style="float: right; margin-top: -0.3px; margin-right: 10px; font-size: x-large; color: black">
	<a id="ExamDetails" href="ShowExams" class="back">
			Back
		</a></h4>
	<h2 class="useralign">
		Exams
	</h2>
	<div class="addexamalign">
		<button onclick="addexam()" id="addexam"
			style="display: block; margin-left: 595px;" class="button examButton">Add
			Exam</button>
		<div id="add" style="display: none;">
			<form action="addExamDetails" method="post">

				<div class="input">
					<div class="examdetails">
						<label for="examName" style="margin-left: 14px;">Exam Name</label>
						<input type="text" name="examName" id="examName" required><br>
						<br>
					</div>
					<div class="examdetails">
						<label for="examType" style="margin-left: 23px;">Exam type</label>
						<input type="text" name="examType" id="examType" required><br>
						<br>
					</div>
					<div class="examdetails">
						<label for="difficultyLevel" style="margin-left: -9px;">Difficulty
							Level</label> <input type="text" name="difficultyLevel"
							id="difficultyLevel" required><br> <br>
					</div>
					<div class="examdetails">
						<label for="durationHours" style="margin-left: -20px;">Duration
							Minutes</label> <input type="number" name="durationMinutes"
							id="durationMinutes" min="1" required><br> <br>
					</div>

				</div>
				<button type="submit" class="button examButton">Add Exam</button>
				&nbsp;&nbsp;
				<button type="button" class="button examButton" onclick="hideadd()">Cancel</button>
				<br> <br>
				</form>
		</div>
	</div>
</body>
<script type="text/javascript">
function addexam(){
	var add=document.getElementById("addexam");
	add.style.display="none";
	var addexam=document.getElementById("add");
	addexam.style.display="block";
}
function hideadd(){
	var add=document.getElementById("addexam");
	add.style.display="block";
	var addexam=document.getElementById("add");
	addexam.style.display="none";
}
</script>
</html>