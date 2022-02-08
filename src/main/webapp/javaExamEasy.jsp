<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="examPages.css">
<title>JAVA Exam</title>
</head>
<body>
	<h2 style="margin-left: 50px;" id="css">
		JAVA Exam
	</h2>
	<h4 style="color:black;"><a id="home" href="UserChooseExams">
			Back
		</a></h4>
	<div id="clock" class="clockalign">
		<strong id="hour"></strong><label> &nbsp;<span id="colon">:</span>&nbsp;
		</label><strong id="min"></strong>
	</div>
	<br>
	<button id="startButton" onclick="clcok()"
		class="button examButton start">Start</button>

	<div style="margin-top: -390px;margin-left:-40px;">
		<div class="questions" id="question1">
			<p>
				1)Which of the following option leads to the portability and
				security of Java?<br><br>
				<input type="radio" name="answer1" value="Bytecode is executed by JVM" id="option1"><label for="option1">Bytecode is executed by JVM</label><br><br>
				<input type="radio" name="answer1" value="The applet makes the Java code secure and portable" id="option2"><label for="option2">The applet makes the Java code secure and portable</label><br><br>
				<input type="radio" name="answer1" value="Use of exception handling" id="option3"><label for="option3">Use of exception handling</label><br><br>
				<input type="radio" name="answer1" value="Dynamic binding between objects" id="option4"><label for="option4">Dynamic binding between objects</label><br><br>

			</p>
		</div>
		<div class="questions" id="question2">
			<p>
				2)Which of the following is not a Java features?<br><br> <input type="radio" name="answer2"
					value="Dynamic" id="2option1"><label for="2option1">Dynamic</label><br><br>
				<input type="radio" name="answer2" value="Architecture Neutral" id="2option2"><label for="2option2">Architecture Neutral</label><br><br>
				<input type="radio" name="answer2" value="Use of pointers" id="2option3"><label for="2option3">Use of pointers</label><br><br>
				<input type="radio" name="answer2" value="Object-oriented" id="2option4"><label for="2option4">Object-oriented</label><br><br>

			</p>
		</div>
		<div class="questions" id="question3">
			<p>
				3)_____ is used to find and fix bugs in the Java programs.<br><br> <input
					type="radio" name="answer3" value="JVM" id="3option1"><label for="3option1">JVM</label><br><br> <input type="radio"
					name="answer3" value="JRE" id="3option2"><label for="3option2">JRE</label><br><br> <input type="radio"
					name="answer3" value="JDK" id="3option3"><label for="3option3">JDK</label><br><br> <input type="radio"
					name="answer3" value="JDB" id="3option4"><label for="3option4">JDB</label><br><br>

			</p>
		</div>
		<div class="questions" id="question4">
			<p>
				4)In which process, a local variable has the same name as one of the
				instance variables?<br><br> <input type="radio"
					name="answer4" value="Serialization" id="4option1"><label for="4option1">Serialization</label><br><br> <input type="radio"
					name="answer4" value="Variable Shadowing" id="4option2"><label for="4option2">Variable Shadowing</label><br><br> <input type="radio"
					name="answer4" value="Abstraction" id="4option3"><label for="4option3">Abstraction</label><br><br> <input type="radio"
					name="answer4" value="Multi-threading" id="4option4"><label for="4option4">Multi-threading</label><br><br>

			</p>
		</div>
		<div class="questions" id="question5">
			<p>
				5)What is the return type of the hashCode() method in the Object
				class?<br><br> <input type="radio"
					name="answer5" value="Object" id="5option1"><label for="5option1">Object</label><br><br> <input
					type="radio" name="answer5" value="int" id="5option2"><label for="5option2">int</label><br><br>
				<input type="radio" name="answer5" value="long" id="5option3"><label for="5option3">long</label><br><br>
				<input type="radio" name="answer5" value="void" id="5option4"><label for="5option4">void</label><br><br>

			</p>
		</div>
		<div class="questions" id="question6">
			<p>
				6)What does the expression float a = 35 / 0 return?<br><br> <input
					type="radio" name="answer6" value="0" id="6option1"><label for="6option1">0</label><br><br> <input type="radio" name="answer6"
					value="Not a Number" id="6option2"><label for="6option2">Not a Number</label><br><br> <input
					type="radio" name="answer6" value="Infinity" id="6option3"><label for="6option3">Infinity</label><br><br>
				<input type="radio" name="answer6" value="Run time exception" id="6option4"><label for="6option4">Run time exception</label><br><br>

			</p>
		</div>
		<div class="questions" id="question7">
			<p>
				7)Evaluate the following Java expression, if x=3, y=5, and z=10: ++z
				+ y - y + z + x++<br><br> <input
					type="radio" name="answer7" value="20" id="7option1"><label for="7option1">20</label><br><br> <input
					type="radio" name="answer7" value="23" id="7option2"><label for="7option2">23</label><br><br> <input
					type="radio" name="answer7" value="24" id="7option3"><label for="7option3">24</label><br><br>
				<input type="radio" name="answer7" value="25" id="7option4"><label for="7option4">25</label><br><br>

			</p>
		</div>
		<div class="questions" id="question8">
			<p>
				8)Which method of the Class.class is used to determine the name of
				a class represented by the class object as a String?<br><br> <input type="radio" name="answer8"
					value="getClass()" id="8option1"><label for="8option1">getClass()</label><br><br> <input
					type="radio" name="answer8" value="intern()" id="8option2"><label for="8option2">intern()</label><br><br>
				<input type="radio" name="answer8" value="getName()" id="8option3"><label for="8option3">getName()</label><br><br>
				<input type="radio" name="answer8" value="toString()" id="8option4"><label for="8option4">toString()</label><br><br>
			</p>
		</div>
		<div class="questions" id="question9">
			<p>
				9)Which package contains the Random class?<br><br> 
				<input type="radio" name="answer9" value="java.util package" id="9option1"><label for="9option1">java.util package</label><br><br>
				<input type="radio" name="answer9" value="java.lang package" id="9option2"><label for="9option2">java.lang package</label><br><br>
				<input type="radio" name="answer9" value="java.awt package" id="9option3"><label for="9option3">java.awt package</label><br><br>
				<input type="radio" name="answer9" value="java.io package" id="9option4"><label for="9option4">java.io package</label><br><br>

			</p>
		</div>
		<div class="questions" id="question10">
			<p>
				10)Which of the following for loop declaration is not valid?<br><br> 
				<input type="radio" name="answer10"
					value="for ( int i = 99; i >= 0; i / 9 )" id="10option1"><label for="10option1">for ( int i = 99; i >= 0; i / 9 )</label><br><br> <input
					type="radio" name="answer10" value="for ( int i = 7; i <= 77; i += 7 )" id="10option2"><label for="10option2">for ( int i = 7; i <= 77; i += 7 )</label><br><br> <input type="radio" name="answer10"
					value="for ( int i = 20; i >= 2; - -i )" id="10option3"><label for="10option3">for ( int i = 20; i >= 2; - -i )</label><br><br>
				<input type="radio" name="answer10" value="for ( int i = 2; i <= 20; i = 2* i )" id="10option4"><label for="10option4">for ( int i = 2; i <= 20; i = 2* i )</label><br><br>

			</p>

		</div>

	</div>

	<p id="result"></p>
	<p id="passFail"></p>
	<p id="studentGrade"></p>
	<div id="timeup" class="timeupalign">
		<p>Your time is up!....</p>
		<p>You have to submit exam</p>
	</div>
	<div id="feed">
		<a href="feedbackDetails?examid=${exam_Id}&userid=${user_id}"><button
				id="sendfeedback" class="button examButton"
				style="margin-top: 100px;">Send feedback</button>&nbsp;&nbsp;</a>
	</div>
	<div id="buttons" class="form">
		<form action="scoreDetails">
			<input style="visibility: hidden;" type="text" id="examId"
				name="examId" value="${exam_Id}"><label for="examId"></label> <input
				style="visibility: hidden;" type="text" id="examName"
				name="examName" value="${exam_Name}"><label for="examName"></label> <input
				style="visibility: hidden;" type="text" id="studentId" name="uID"
				value="${user_id}" /><label for="studentId"></label> <input style="visibility: hidden;" type="text"
				id="score" name="score"><label for="score"></label> <input style="visibility: hidden;"
				type="text" id="passOrFail" name="passOrFail"><label for="passOrFail"></label> <input
				style="visibility: hidden;" type="text" id="grade" name="grade"><label for="grade"></label>
			<button id="submit" onclick="ans()"
				style="text-align: center; margin-top: 430px;"
				class="button examButton">Submit</button>
		</form>
	</div>
	<div>
		<button id="next" onclick="qu()"
			style="text-align: center; margin-top: -50px;"
			class="button examButton">Next</button>

	</div>

</body>
<script>
var num=1;
var mark=0;
function ans(){
	var ans1=document.getElementsByName("answer1");
	var ans2=document.getElementsByName("answer2");
	var ans3=document.getElementsByName("answer3");
	var ans4=document.getElementsByName("answer4");
	var ans5=document.getElementsByName("answer5");
	var ans6=document.getElementsByName("answer6");
	var ans7=document.getElementsByName("answer7");
	var ans8=document.getElementsByName("answer8");
	var ans9=document.getElementsByName("answer9");
	var ans10=document.getElementsByName("answer10");
	
	document.getElementById("submit").style.visibility="hidden";
	 document.getElementById("question1").style.visibility="hidden";
     document.getElementById("question2").style.visibility="hidden";
     document.getElementById("question3").style.visibility="hidden";
     document.getElementById("question4").style.visibility="hidden";
     document.getElementById("question5").style.visibility="hidden";
     document.getElementById("question6").style.visibility="hidden";
     document.getElementById("question7").style.visibility="hidden";
     document.getElementById("question8").style.visibility="hidden";
     document.getElementById("question9").style.visibility="hidden";
     document.getElementById("question10").style.visibility="hidden";
     

		//answer 1
		const rbs=document.querySelectorAll('input[name="answer1"]');
		for(const rb of rbs){
			if(rb.checked){
				//selectedvalue=rb.value;
				if(rb.value=="Bytecode is executed by JVM"){
					mark++;
				}
				break;
			}
		}
		
		//answer 2
		const rbs2=document.querySelectorAll('input[name="answer2"]');
		for(const rb2 of rbs2){
			if(rb2.checked){
				if(rb2.value=="Use of pointers"){
					mark++;
				}
				break;
			}
		}
		
		//answer 3
		const rbs3=document.querySelectorAll('input[name="answer3"]');
		for(const rb3 of rbs3){
			if(rb3.checked){
				if(rb3.value=="JDB"){
					mark++;
				}
				break;
			}
		}
		
		//answer 4
		const rbs4=document.querySelectorAll('input[name="answer4"]');
		for(const rb4 of rbs4){
			if(rb4.checked){
				if(rb4.value=="Variable Shadowing"){
					mark++;
				}
				break;
			}
		}
		
		//answer 5
		const rbs5=document.querySelectorAll('input[name="answer5"]');
		for(const rb5 of rbs5){
			if(rb5.checked){
				if(rb5.value=="int"){
					mark++;
				}
				break;
			}
		}
		
		//answer 6
		const rbs6=document.querySelectorAll('input[name="answer6"]');
		for(const rb6 of rbs6){
			if(rb6.checked){
				if(rb6.value=="Infinity"){
					mark++;
				}
				break;
			}
		}
		
		//answer 7
		const rbs7=document.querySelectorAll('input[name="answer7"]');
		for(const rb7 of rbs7){
			if(rb7.checked){
				if(rb7.value=="25"){
					mark++;
				}
				break;
			}
		}
		
		//answer 8
		const rbs8=document.querySelectorAll('input[name="answer8"]');
		for(const rb8 of rbs8){
			if(rb8.checked){
				if(rb8.value=="getName()"){
					mark++;
				}
				break;
			}
		}
		
		//answer 9
		const rbs9=document.querySelectorAll('input[name="answer9"]');
		for(const rb9 of rbs9){
			if(rb9.checked){
				if(rb9.value=="java.util package"){
					mark++;
				}
				break;
			}
		}
		
		//answer 10
		const rbs10=document.querySelectorAll('input[name="answer10"]');
		for(const rb10 of rbs10){
			if(rb10.checked){
				if(rb10.value=="for ( int i = 99; i >= 0; i / 9 )"){
					mark++;
				}
				break;
			}
		}
		

		   clearInterval(inter);
		
		document.getElementById("buttons").style.visibility="hidden";
		document.getElementById("css").style.visibility="hidden";
		document.getElementById("hour").style.visibility="hidden";
		document.getElementById("min").style.visibility="hidden";
		document.getElementById("colon").style.visibility="hidden";
		document.getElementById("score").value=mark;
		if(mark>=5){
			
			document.getElementById("passOrFail").value="pass";
			if(mark==5){
				document.getElementById("grade").value="E";
			}
			else if(mark==6){
				document.getElementById("grade").value="D";
			}
			else if(mark==7){
				document.getElementById("grade").value="C";
			}
			else if(mark==8){
				document.getElementById("grade").value="B";
			}
			else if(mark==9){
				document.getElementById("grade").value="A";
			}
			else if(mark==10){
				document.getElementById("grade").value="O";
			}
		}
		else{
			document.getElementById("passOrFail").value="fail";
			document.getElementById("grade").value="RA";
		}

}

		document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
      
function qu(){
	
  
    if(num==0){
    	
        document.getElementById("question1").style.visibility="visible";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
	num++;  
}
else if(num==1){
    document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="visible";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++; 
}

else if(num==2){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="visible";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==3){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="visible";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==4){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="visible";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==5){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="visible";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==6){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="visible";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==7){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="visible";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==8){
   	 	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="visible";
        document.getElementById("question10").style.visibility="hidden";
        document.getElementById("submit").style.visibility="hidden";
        num++;
}
else if(num==9){
    	document.getElementById("question1").style.visibility="hidden";
        document.getElementById("question2").style.visibility="hidden";
        document.getElementById("question3").style.visibility="hidden";
        document.getElementById("question4").style.visibility="hidden";
        document.getElementById("question5").style.visibility="hidden";
        document.getElementById("question6").style.visibility="hidden";
        document.getElementById("question7").style.visibility="hidden";
        document.getElementById("question8").style.visibility="hidden";
        document.getElementById("question9").style.visibility="hidden";
        document.getElementById("question10").style.visibility="visible";
        document.getElementById("next").style.visibility="hidden";
        document.getElementById("submit").style.visibility="visible";
        num++;
}
else if(num==10){
	document.getElementById("question1").style.visibility="hidden";
    document.getElementById("question2").style.visibility="hidden";
    document.getElementById("question3").style.visibility="hidden";
    document.getElementById("question4").style.visibility="hidden";
    document.getElementById("question5").style.visibility="hidden";
    document.getElementById("question6").style.visibility="hidden";
    document.getElementById("question7").style.visibility="hidden";
    document.getElementById("question8").style.visibility="hidden";
    document.getElementById("question9").style.visibility="hidden";
    document.getElementById("question10").style.visibility="hidden";
    document.getElementById("next").style.visibility="hidden";
    document.getElementById("submit").style.visibility="hidden";

}
}
document.getElementById("hour").style.color="green";
document.getElementById("min").style.color="green";    

var min=0;
var hour=${durationtime};
var inter=0;
function clcok(){
	document.getElementById("buttons").style.visibility="visible";
	document.getElementById("home").style.visibility="hidden";
	document.getElementById("hour").style.visibility="visible";
	document.getElementById("min").style.visibility="visible";
	document.getElementById("colon").style.visibility="visible";
	document.getElementById("next").style.visibility="visible";
	document.getElementById("startButton").style.visibility="hidden";
	document.getElementById("question1").style.visibility="visible";
    document.getElementById("question2").style.visibility="hidden";
    document.getElementById("question3").style.visibility="hidden";
    document.getElementById("question4").style.visibility="hidden";
    document.getElementById("question5").style.visibility="hidden";
    document.getElementById("question6").style.visibility="hidden";
    document.getElementById("question7").style.visibility="hidden";
    document.getElementById("question8").style.visibility="hidden";
    document.getElementById("question9").style.visibility="hidden";
    document.getElementById("question10").style.visibility="hidden";
inter=setInterval(clock,1000);

}

function clock(){

if(hour==0 && min==1)  {
   clearInterval(inter);
}

   console.log(min);

if(min==0){
hour--;
console.log(hour);
 min=60;
}
if(hour==3 && min==1){
document.getElementById("hour").style.color="red";
document.getElementById("min").style.color="red";
}
min--;
document.getElementById("hour").innerHTML=hour;
document.getElementById("min").innerHTML=min;
if(hour==0 && min==0)  {
	document.getElementById("next").style.visibility="hidden";
	 document.getElementById("question1").style.visibility="hidden";
     document.getElementById("question2").style.visibility="hidden";
     document.getElementById("question3").style.visibility="hidden";
     document.getElementById("question4").style.visibility="hidden";
     document.getElementById("question5").style.visibility="hidden";
     document.getElementById("question6").style.visibility="hidden";
     document.getElementById("question7").style.visibility="hidden";
     document.getElementById("question8").style.visibility="hidden";
     document.getElementById("question9").style.visibility="hidden";
     document.getElementById("question10").style.visibility="hidden";

     document.getElementById("buttons").style.visibility="hidden";
     mark=0;
     
     document.getElementById("timeup").style.visibility="visible";
		   clearInterval(inter);
		
		document.getElementById("buttons").style.visibility="hidden";
		document.getElementById("css").style.visibility="visible";
		document.getElementById("score").value=mark;
		document.getElementById("submit").style.visibility="visible";
		  
}

}

</script>
</html>