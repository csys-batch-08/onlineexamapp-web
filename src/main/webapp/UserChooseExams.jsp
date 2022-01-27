<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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
	<a href="FilterByDifficulty.html"><h4 style="float: right;margin-right:10px;margin-top:-7px;font-size:x-large;color:black;"><u><b>Back</b></u></h4></a>
	<h2><u>Exams</u></h2>
	
	<table style="width: 80%;margin-left: 100px;font-size:large;">
        <tr>
            <th>Exam Id</th>
            <th>Exam Name</th>
            <th>Exam Type</th>
            <th>Difficulty Level</th>
            <th>Duration Minutes</th>
            <th>Exam</th>
        </tr>
        <c:forEach items="${easyexams}" var="easy">
            <tr>
            <c:set var="duration" value="${easy.durationMinutes}" scope="session" />
                <td>${easy.examId}</td>
                <td>${easy.examName}</td>
                <td>${easy.examType}</td>
                <td>${easy.difficultyLevel}</td>
                <td>${easy.durationMinutes}</td>
                <c:if test="${easy.examName=='JAVA'}">
                <td><a href="JavaExamEasy?examid=${easy.examId}&examName=${easy.examName}"><center><button type="submit" class="button examButton">Take Exam</button></center></a></td>
                </c:if>
                <c:if test="${easy.examName=='HTML'}">
                <td><a href="HtmlExamEasy?examid=${easy.examId}&examName=${easy.examName}"><center><button type="submit" class="button examButton">Take Exam</button></center></a></td>
                </c:if>
                <c:if test="${easy.examName=='CSS'}">
                <td><a href="CssExamEasy?examid=${easy.examId}&examName=${easy.examName}"><center><button type="submit" class="button examButton">Take Exam</button></center></a></td>
                </c:if>
               
                 </c:forEach>
                
                
            </tr>
        
    </table>
</body>
</html>