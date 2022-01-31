<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<style>
body{
    background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
table,th,td{
    border: 1px solid black;
    border-collapse: collapse;
    padding: 20px;
}
h2{
	text-align:center;
}
a{
	float:right;
	margin-right:15px;
	margin-top:-40px;
	font-weight:bolder;
	font-size:x-large;
	color:black;
}
.notyet{
font-weight:bolder;
font-size:xx-large;
}
.button {
  background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 16px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  transition-duration: 0.4s;
  cursor: pointer;
  margin-left:-1325px;
}
.examButton{
  background-color: rgb(171, 255, 36);  
  color: black; 
  font-weight: bold;
  font-family: Verdana, Geneva, Tahoma, sans-serif;
  border: 4px solid black;
}
.examButton:hover,.examButton :active{
  background-color: black;
  color: white;
  transition: 2ms;
}
.otherwise{
text-align:center;
margin-top:200px;
}
.moreexam{
text-align:center;
}
.exam{
margin-left:-738px;
}
</style>
<title>Score Details</title>
</head>
<body>
	<h2><u>Score Details</u></h2>
	<a href="userMain.jsp"><strong>Home</strong></a>
	<c:choose>
	<c:when test="${fn:length(scorelist) > 0 }">
	<table style="width: 80%;margin-left: 100px;font-size:large;">
	<caption>Score details</caption>
        <tr>
            <th>Student name</th>
            <th>Exam Name</th>
            <th>Score</th>
            <th>PassOrFail</th>
            <th>Grade</th>
            <th>Exam Date</th>
        </tr>
        <c:forEach items="${scorelist}" var="scores">
        	<tr>
                <td>${sessionScope.username}</td>
                <td>${scores.examName}</td>
                <td>${scores.score}</td>
                <td>${scores.passOrFail}</td>
                <td>${scores.grade}</td>
                <td>${scores.examdate}</td>
                </tr>
                </c:forEach>
               </table><br><br><br><br><br>
                <div class="moreexam">
                <a href="filterByDifficulty.jsp"><button class="button examButton" style="margin-top:-65px;">Write More Exams</button></a>
                </div>
               </c:when>
               <c:otherwise><h2 class="notyet"><div class="otherwise">You haven't write any exams yet!..</h2><br><br><br>
               <a href="filterByDifficulty.jsp"><button class="button examButton exam">Take Exam</button></a></div></c:otherwise>
               </c:choose>
     
</body>
</html>
