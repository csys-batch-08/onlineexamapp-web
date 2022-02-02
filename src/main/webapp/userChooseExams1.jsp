<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
<style>
table,th,td{
    border: 1px solid black;
    border-collapse: collapse;
    padding: 20px;
}
h2{
    text-align: center;
}
body{
    background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
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
</style>
<title>List of Exams</title>
</head>
<body>
<a href="UserProfile"><img class="imgalign" src="./images/${sessionScope.profile.getPhoto()}" height="50px" width="55px" style="float:right;border-radius: 50%;margin-right:10px;margin-top:-3px;border:1px groove black;" title="My Profile" alt="My Profile"></a>
    <ul class="nav">
    	<li><a class="a1" href="userMain.jsp">Home</a></li>
        <li><a class="a2" href="index.jsp" onclick="logout()">Logout</a></li>
        <li><a class="a3" href="contactUs.jsp">Contact us</a></li>
        <li><a class="a4" href="aboutUs.jsp" class="a1">About us</a></li>
        <li><a class="a5" href="showfeedback">My Feedbacks</a></li>
        <li><a class="a6" href="StudentScoreDetails">MyExams</a></li>
    </ul>
	<a href="filterByDifficulty.jsp"><h4 style="float: right;margin-top:25px;margin-right:15px;font-size:x-large;color:black;"><u><strong>Back</strong></u></h4></a>
	<h2><u>Exams</u></h2>
	<c:set var="count" value="1" />
	<table style="width: 90%;margin-left: 60px;font-size:large;">
	<caption></caption>
        <tr>
        	<th>S.no.</th>
            <th>Exam Id</th>
            <th>Exam Name</th>
            <th>Exam Type</th>
            <th>Difficulty Level</th>
            <th>Duration Minutes</th>
            <th>Exam</th>
        </tr>
        <c:forEach items="${hardexams}" var="hard">
            <tr>
            <c:set var="duration" value="${hard.durationMinutes}" scope="session" />
            	<td>${count}</td>
                <td>${hard.examId}</td>
                <td>${hard.examName}</td>
                <td>${hard.examType}</td>
                <td>${hard.difficultyLevel}</td>
                <td>${hard.durationMinutes}</td>
                <c:if test="${hard.examName=='JAVA'}">
                <td><a href="JavaExamHard?examid=${hard.examId}&examName=${hard.examName}"><button type="submit" class="button examButton">Take Exam</button></a></td>
                </c:if>
                <c:if test="${hard.examName=='HTML'}">
                <td><a href="HtmlExamHard?examid=${hard.examId}&examName=${hard.examName}"><button type="submit" class="button examButton">Take Exam</button></a></td>
                </c:if>
                <c:if test="${hard.examName=='CSS'}">
                <td><a href="CssExamHard?examid=${hard.examId}&examName=${hard.examName}"><button type="submit" class="button examButton">Take Exam</button></a></td>
                </c:if>
                <c:if test="${hard.examName=='PYTHON'}">
                <td><a href="PythonExamHard?examid=${hard.examId}&examName=${hard.examName}"><button type="submit" class="button examButton">Take Exam</button></a></td>
                </c:if>
            </tr>
            <c:set var="count" value="${count+1}" />
        </c:forEach>
    </table>
</body>
</html>