<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
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

h2 {
	text-align: center;
}

body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

h1 {
	text-align: center;
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

.notyet {
	font-weight: bolder;
	font-size: xx-large;
}

.otherwise {
	text-align: center;
	margin-top: 80px;
}

.view {
	margin-left: 630px;
}
</style>
<title>List of exams</title>
</head>
<body>
	<h1>
		<u>All Exams</u>
	</h1>
	<a id="ExamDetails" href="examDetails.jsp"><h4
			style="float: right; margin-right: 10px; margin-top: -50px; font-size: x-large; color: black;">
			<u>Back</u>
		</h4></a>
	<div style="margin-left: 100px;">
		<form action="FilterExamsByDate" method="post">
			<h3>
				Filter by date <input type="date" name="date" id="search">
			</h3>
			<button type="submit" style="margin-left: 75px;"
				class="buttons button2">Filter</button>
		</form>

		<div style="margin-left: 330px; margin-top: -100px;">
			<form action="FilterExamsByPOF" method="post">
				<h3>
					Filter by pass or fail <input list="passfail" name="pof" id="pof">
					<datalist id="passfail">
						<option value="pass">
						<option value="fail">
					</datalist>
				</h3>
				<button type="submit" style="margin-left: 140px;"
					class="buttons button2">Filter</button>
			</form>
		</div>

		<div style="margin-left: 750px; margin-top: -100px;">
			<form action="FilterExamsByGrade" method="post">
				<h3>
					Filter by Grade <input list="grades" name="grade" id="grade">
					<datalist id="grades">
						<option value="O">
						<option value="A">
						<option value="B">
						<option value="C">
						<option value="D">
						<option value="E">
						<option value="RA">
					</datalist>
				</h3>
				<button type="submit" style="margin-left: 120px;"
					class="buttons button2">Filter</button>
			</form>
		</div>
	</div>
	<br>
	<br>

	<a href="ShowUsersExams"><button class="buttons button2 view">View
			all</button></a>
	<br>
	<br>
	<c:set var="count" value="1" />
	<c:choose>
		<c:when test="${fn:length(grades) > 0 }">
			<table style="width: 90%; margin-left: 75px; font-size: large;">
				<caption>Scores depends on Grade</caption>
				<tr>
					<th>S.no.</th>
					<th>Student Id</th>
					<th>Exam Id</th>
					<th>Exam Name</th>
					<th>Score</th>
					<th>Pass or Fail</th>
					<th>Grade</th>
					<th>Exam Date</th>
				</tr>
				<c:forEach items="${grades}" var="grade">
					<tr>
						<td>${count}</td>
						<td>${grade.studentId}</td>
						<td>${grade.examId}</td>
						<td>${grade.examName}</td>
						<td>${grade.score}</td>
						<td>${grade.passOrFail}</td>
						<td>${grade.grade}</td>
						<td><fmt:parseDate value="${grade.examdate}"
								pattern="yyyy-MM-dd'T'HH:mm:ss" var="parsedExamDate" type="both" />
							<fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss"
								value="${parsedExamDate}" /></td>
					</tr>
					<c:set var="count" value="${count+1}" />
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<h2 class="notyet">
				<div class="otherwise">No one got this Grade!..</div>
			</h2>
		</c:otherwise>
	</c:choose>
</body>
<script type="text/javascript">
		let today = new Date().toISOString().slice(0, 10);
		document.getElementById("search").max =today;
	</script>
</html>