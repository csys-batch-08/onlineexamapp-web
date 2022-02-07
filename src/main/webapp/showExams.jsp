<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
table, th, td {
	border: 1px solid black;
	border-collapse: collapse;
	padding: 20px;
}
body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

button {
	text-align: center;
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
}

.elementToFadeInAndOut {
	-webkit-animation: fadeinout 0.5s linear forwards;
	animation: fadeinout 2s linear forwards;
}

@
-webkit-keyframes fadeinout { 30%,100% {
	opacity: 0;
}

50
%
{
opacity
:
1;
}
}
@
keyframes fadeinout { 70%,100% {
	opacity: 0;
}

50
%
{
opacity
:
1;
}
}
.update {
	margin-left: 65px;
}
.useralign{
margin-left:623px;
}
.back{
color:black;
}
</style>
<title>List of Exams</title>
</head>
<body>
	<h4 style="float: right; margin-top: -0.3px; margin-right: 10px; font-size: x-large; color: black">
	<a id="ExamDetails" href="examDetails.jsp" class="back">
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
						<label for="examName" style="margin-left: 74px;">Exam Name</label>
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
		</div>
	</div>

	</form>
	<c:set var="count" value="1" />
	<table style="width: 90%; margin-left: 75px; font-size: large;">
		<caption></caption>
		<tr>
			<th>S.no.</th>
			<th>Exam Id</th>
			<th>Exam Name</th>
			<th>Exam Type</th>
			<th>Difficulty Level</th>
			<th>Duration Minutes</th>
			<th>Update</th>
			<th>Delete</th>
		</tr>
		<c:forEach items="${exams}" var="exam">

			<tr>
				<td>${count}</td>
				<td>${exam.examId}</td>
				<td>${exam.examName}</td>
				<td>${exam.examType}</td>
				<td>${exam.difficultyLevel}</td>
				<td>${exam.durationMinutes}</td>

				<td>
					<form action="updateExamDetails?examid=${exam.examId}"
						method="post">

						<h2>
							<u>Update Exam</u>
						</h2>

						<ul class="text">
							<li><label for="difficultyLevel">Difficulty Level</label> <input
								type="text" name="difficultyLevel" id="difficultyLevel" required></li>
							<br>
							<li><label for="durationMinutes">Duration Minutes</label> <input
								type="number" name="durationMinutes" id="durationMinutes"
								min="1" required></li>
						</ul>

						<button type="submit" style="text-align: center;"
							class="button examButton update">Update Exam</button>
					</form>
				</td>
				<td>
					<form action="deleteExamServlet?examid=${exam.examId}"
						method="post">

						<button type="submit" class="button examButton"
							onclick="deleteexam()">Delete Exam</button>

					</form>
				</td>
			</tr>
			<c:set var="count" value="${count+1}" />
		</c:forEach>

	</table>
</body>
<script>
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
function deleteexam() {
	var result = confirm("Are you sure want to delete?");
	if (result == false) {
		event.preventDefault();
	}
}
</script>

</html>