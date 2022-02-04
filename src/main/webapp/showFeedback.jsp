<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="navigationBar.css">
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
.otherwise{
text-align:center;
margin-top:200px;
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
.notyet{
font-weight:bolder;
font-size:xx-large;
}
.exam{
margin-left:-740px;
}
.a5{
	background-color:white;
	font-color:black;
}
</style>
<title>Feedback Details</title>
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
	<h2><u>Feedback Details</u></h2>
	<c:set var="count" value="1" />
    <c:choose>
	<c:when test="${fn:length(feedback) > 0 }">
	<table style="width: 80%;margin-left: 120px;font-size:large;">
	<caption>Feedbacks</caption>
   	<tr>
        	<th>S.no.</th>
      		<th>User name</th>
            <th>Exam Id</th>
            <th>Feedback</th>
            <th>Feedback Date</th>
            
   </tr>

   <c:forEach items="${feedback}" var="list">
     <tr>
         <td>${count}</td>
     	 <td>${list.username}</td>
         <td>${list.examid}</td>
         <td>${list.feedback}</td>
         <td><fmt:parseDate value="${list.feedbackdate}"
							pattern="yyyy-MM-dd'T'HH:mm" var="parsedExamDate" type="both" /> <fmt:formatDate
							pattern="dd-MM-yyyy HH:mm" value="${parsedExamDate}" /></td>
     </tr>
            <c:set var="count" value="${count+1}" />
     </c:forEach>
     </table>
   
   </c:when>
   <c:otherwise><h2 class="notyet"><div class="otherwise">You haven't send any feedbacks yet!..</h2><br><br><br>
   <a href="filterByDifficulty.jsp"><button class="button examButton exam">Take Exam</button></a>
   </div></c:otherwise>
   </c:choose>

 
</body>
</html>