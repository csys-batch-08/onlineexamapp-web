<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
</style>
<title>Feedback Details</title>
</head>
<body>
	<h2><u>Feedback Details</u></h2>
	<a href="userMain.jsp"><strong>Home</strong></a>
    <c:choose>
	<c:when test="${fn:length(feedback) > 0 }">
	<table style="width: 80%;margin-left: 100px;font-size:large;">
	<caption>Feedbacks</caption>
   	<tr>
      <th>User name</th>
            <th>Exam Id</th>
            <th>Feedback</th>
            <th>Feedback Date</th>
            
   </tr>

   <c:forEach items="${feedback}" var="list">
   <fmt:parseDate pattern="yyyy-MM-dd" value="${list.feedbackdate}"
				var="parsedFeedbackDate" />
     <tr>
     	 <td>${list.username}</td>
         <td>${list.examid}</td>
         <td>${list.feedback}</td>
         <td><fmt:formatDate pattern="dd-MM-yyyy" value="${parsedFeedbackDate}" /></td>
        
     </tr>
     </c:forEach>
     </table>
   
   </c:when>
   <c:otherwise><h2 class="notyet"><div class="otherwise">You haven't send any feedbacks yet!..</h2><br><br><br>
   <a href="filterByDifficulty.jsp"><button class="button examButton exam">Take Exam</button></a>
   </div></c:otherwise>
   </c:choose>

 
</body>
</html>