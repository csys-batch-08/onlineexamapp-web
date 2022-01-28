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
  padding: 13px ;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 14px;
  margin:  2px;
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
<title>List of Users</title>
</head>
<body>
	<a id="ExamDetails" href="examDetails.jsp"><h4 style="float: right;margin-right:10px;font-size:x-large;color:black"><u>Back</u></h4></a>
	<h2><u>Users</u></h2>
	
	<table style="width: 80%;margin-left: 100px;font-size:large;">
        <tr>
            <th>User Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Phone Number</th>
            <th>Last active date</th>
            <th>Status</th>
        </tr>
        <c:forEach items="${users}" var="active">
            <tr>
                <td>${active.userid}</td>
                <td>${active.first_name}</td>
                <td>${active.last_name}</td>
                <td>${active.email}</td>
                <td>${active.phone_number}</td>
                <td>${active.reason}</td>
                <form action="userstatus?userid=${active.userid}" method="post">
                <td><center><button type="submit" class="button examButton">Make Inactive</button></center></td></form>
            </tr>
        </c:forEach>
    </table>
</body>
</html>