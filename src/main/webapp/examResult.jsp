<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<title>Exam Result</title>
<style>
body{
    background: linear-gradient(to right, springgreen, rgb(253, 253, 53));
}
.container{
text-align:center;
font-size:x-large;
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
.homealign{
float:right;
font-weight:bolder;
font-size:x-large;
color:black;
margin-top:-75px;
margin-right:15px;
}
h2{
	text-align:center;
	font-weight:bolder;
}
.feedback{
margin-left:1px;
margin-top: 510px;
}
input[type=radio] {
    width:35px;
    height: 35px;
}
.table-striped{
  width: 50%;
  height: 100px;
  margin-left: 290px;
  border: 1px solid black;
}
.homebutton{
  margin-top:-520px;
  margin-left: 1150px;
}
.printbutton{
  margin-left:0px;
}
</style>
</head>
<body>
<fmt:parseDate value="${examwrittendate}"
								pattern="yyyy-MM-dd'T'HH:mm:ss" var="parsedExamDate" type="both" />
							<fmt:formatDate pattern="dd-MM-yyyy HH:mm:ss"
								value="${parsedExamDate}" var="examdate"/>
<div class="container" id="box">
	<div>
		<h2>Score Details</h2><br>
      <div class="container">
      Your mark is:  ${score}<br><br>
      Your status is:  ${passfail}<br><br>
      Your grade is:  ${grade}<br><br>
      Exam written date: ${examdate}<br><br>
      </div>
      <table class="table table-striped">
      <caption></caption>
            <tr>
            <th>Marks</th>
            <th>10</th>
            <th>9</th>
            <th>8</th>
            <th>7</th>
            <th>6</th>
            <th>5</th>
            <th><5</th>
          </tr>
          <tr>
            <td>Grade</td>
            <td>O</td>
            <td>A</td>
            <td>B</td>
            <td>C</td>
            <td>D</td>
            <td>E</td>
            <td>RA</td>
          </tr>
      </table>
             <div class="printbutton"><button class="btn btn-primary hidden-print" onclick="myFunction()"><span class="glyphicon glyphicon-print" aria-hidden="true"></span> Print</button></div>
             <div class="homebutton"><button class="btn btn-primary hidden-print" onclick="window.location.href='/userMain.jsp'"><span  aria-hidden="true"></span>Home</button></div>
             <div class="feedback"><a href="feedbackDetails?userid=${userid}&examid=${examid}&examname=${examName}"><button type="submit" class="btn btn-primary hidden-print"><span aria-hidden="true"></span>Send Feedback</button></a></div>
	</div>
</div>


</body>
<script>
  function myFunction() {
    window.print();
}
</script>
</html>