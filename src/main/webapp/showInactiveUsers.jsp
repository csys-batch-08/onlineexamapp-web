<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
body {
	background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}

.button {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 13px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 14px;
	margin: 2px;
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

.notyet {
	font-weight: bolder;
	font-size: xx-large;
}

.otherwise {
	text-align: center;
	margin-top: 200px;
}
.useralign{
margin-left:610px;
}
.back{
color:black;
}
.activebutton{
margin-left:590px;
}
</style>
<title>Inactive Users</title>
</head>
<body>
	<h4 style="float: right; margin-top: -0.3px; margin-right: 10px; font-size: x-large; color: black">
	<a id="ExamDetails" href="examDetails.jsp" class="back">
			Back
		</a></h4>
	<h2 class="useralign">
		Inactive Users
	</h2>
	<c:set var="count" value="1" />
	<c:choose>
		<c:when test="${fn:length(inusers) > 0 }">
			<table style="width: 90%; margin-left: 75px; font-size: large;">
				<caption>List of Inactive users</caption>
				<tr>
					<th>S.no.</th>
					<th>User Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Phone Number</th>
					<th>Request</th>
					<th>Status</th>
				</tr>
				<c:forEach items="${inusers}" var="in">
					<tr>
						<td>${count}</td>
						<td>${in.userid}</td>
						<td>${in.firstName}</td>
						<td>${in.lastName}</td>
						<td>${in.email}</td>
						<td>${in.phoneNumber}</td>
						<td>${in.reason}</td>
							<td>
							<form action="active?userid=${in.userid}" method="post">
									<button type="submit" class="button examButton"
										onclick="makeactive()">Make Active</button>
										</form>
								</td>
					</tr>
					<c:set var="count" value="${count+1}" />
				</c:forEach>
			</table>
		</c:when>
		<c:otherwise>
			<div class="otherwise">
			<h2 class="notyet">
				No one exist in this mode!..
			</h2>
			</div>
			<br>
			<br>
			<br>
			<a href="ShowUsers">
					<button class="button examButton activebutton">Show Active Users</button>
				</a>
		</c:otherwise>
	</c:choose>
</body>
<script type="text/javascript">
function makeactive() {
	var result = confirm("Are you sure want to make active?");
	if (result == false) {
		event.preventDefault();
	}
}
</script>
</html>