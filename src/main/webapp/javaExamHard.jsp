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
				1)What do you mean by nameless objects?<br><br>
				<input type="radio" name="answer1" value="An object created by using the new keyword." id="option1"><label for="option1">An object created by using the new keyword.</label><br><br>
				<input type="radio" name="answer1" value="An object of a superclass created in the subclass." id="option2"><label for="option2">An object of a superclass created in the subclass.</label><br><br>
				<input type="radio" name="answer1" value="An object without having any name but having a reference." id="option3"><label for="option3">An object without having any name but having a reference.</label><br><br>
				<input type="radio" name="answer1" value="An object that has no reference." id="option4"><label for="option4">An object that has no reference.</label><br><br>

			</p>
		</div>
		<div class="questions" id="question2">
			<p>
				2)An interface with no fields or methods is known as a ______.<br><br> 
				<input type="radio" name="answer2" value="Runnable Interface" id="2option1"><label for="2option1">Runnable Interface</label><br><br>
				<input type="radio" name="answer2" value="Marker Interface" id="2option2"><label for="2option2">Marker Interface</label><br><br>
				<input type="radio" name="answer2" value="Abstract Interface" id="2option3"><label for="2option3">Abstract Interface</label><br><br>
				<input type="radio" name="answer2" value="None of the above" id="2option4"><label for="2option4">None
				of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question3">
			<p>
				3)Which of the following is an immediate subclass of the Panel
				class?<br><br> <input
					type="radio" name="answer3" value="Applet class" id="3option1"><label for="3option1">Applet class</label><br><br> <input type="radio"
					name="answer3" value="Window class" id="3option2"><label for="3option2">Window class</label><br><br> <input type="radio"
					name="answer3" value="Frame class" id="3option3"><label for="3option3">Frame class</label><br><br> <input type="radio"
					name="answer3" value="Dialog class" id="3option4"><label for="3option4">Dialog class</label><br><br>

			</p>
		</div>
		<div class="questions" id="question4">
			<p>
				4)Which option is false about the final keyword?<br><br> 
				<input type="radio"
					name="answer4" value="A final method cannot be overridden in its subclasses." id="4option1"><label for="4option1">A final method cannot be overridden in its subclasses.</label><br><br> <input type="radio"
					name="answer4" value="A final class cannot be extended." id="4option2"><label for="4option2">A final class cannot be extended.</label><br><br> <input type="radio"
					name="answer4" value="A final class cannot extend other classes." id="4option3"><label for="4option3">A final class cannot extend other classes.</label><br><br> <input type="radio"
					name="answer4" value="A final method can be inherited." id="4option4"><label for="4option4">A final method can be inherited.</label><br><br>

			</p>
		</div>
		<div class="questions" id="question5">
			<p>
				5)Which of these classes are the direct subclasses of the Throwable
				class?<br><br> <input type="radio"
					name="answer5" value="RuntimeException and Error class" id="5option1"><label for="5option1">RuntimeException and Error class</label><br><br> <input
					type="radio" name="answer5" value="Exception and VirtualMachineError class" id="5option2"><label for="5option2">Exception and VirtualMachineError class</label><br><br>
				<input type="radio" name="answer5" value="Error and Exception class" id="5option3"><label for="5option3">Error and Exception class</label><br><br>
				<input type="radio" name="answer5" value="None of the above" id="5option4"><label for="5option4">None of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question6">
			<p>
				6)What do you mean by chained exceptions in Java?<br><br> <input
					type="radio" name="answer6" value="Exceptions occurred by the VirtualMachineError" id="6option1"><label for="6option1">Exceptions occurred by the VirtualMachineError</label><br><br> 
					<input type="radio" name="answer6" value="An exception caused by other exceptions" id="6option2"><label for="6option2">An exception caused by other exceptions</label><br><br> <input
					type="radio" name="answer6" value="Exceptions occur in chains with discarding the debugging information" id="6option3"><label for="6option3">Exceptions occur in chains with discarding the debugging information</label><br><br>
				<input type="radio" name="answer6" value="None of the above" id="6option4"><label for="6option4">None of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question7">
			<p>
				7)In which memory a String is stored, when we create a string using
				new operator?<br><br> <input
					type="radio" name="answer7" value="Stack" id="7option1"><label for="7option1">Stack</label><br><br> <input
					type="radio" name="answer7" value="String memory" id="7option2"><label for="7option2">String memory</label><br><br> <input
					type="radio" name="answer7" value="Heap memory" id="7option3"><label for="7option3">Heap memory</label><br><br>
				<input type="radio" name="answer7" value="Random storage space" id="7option4"><label for="7option4">Random storage space</label><br><br>

			</p>
		</div>
		<div class="questions" id="question8">
			<p>
				8)What is the use of the intern() method?<br><br> <input type="radio" name="answer8"
					value="It returns the existing string from memory" id="8option1"><label for="8option1">It returns the existing string from memory</label><br><br> <input
					type="radio" name="answer8" value="It creates a new string in the database" id="8option2"><label for="8option2">It creates a new string in the database</label><br><br>
				<input type="radio" name="answer8" value="It modifies the existing string in the database" id="8option3"><label for="8option3">It modifies the existing string in the database</label><br><br>
				<input type="radio" name="answer8" value="None of the above" id="8option4"><label for="8option4">None
				of the above</label><br><br>
			</p>
		</div>
		<div class="questions" id="question9">
			<p>
				9)Which of the following is a marker interface?<br><br> 
				<input type="radio" name="answer9" value="Runnable interface" id="9option1"><label for="9option1">Runnable interface</label><br><br>
				<input type="radio" name="answer9" value="Remote interface" id="9option2"><label for="9option2">Remote interface</label><br><br>
				<input type="radio" name="answer9" value="Readable interface" id="9option3"><label for="9option3">Readable interface</label><br><br>
				<input type="radio" name="answer9" value="Result interface" id="9option4"><label for="9option4">Result interface</label><br><br>

			</p>
		</div>
		<div class="questions" id="question10">
			<p>
				10)In java, jar stands for_____.<br><br> 
				<input type="radio" name="answer10"
					value="Java Archive Runner" id="10option1"><label for="10option1">Java Archive Runner</label><br><br> <input
					type="radio" name="answer10" value="Java Application Resource" id="10option2"><label for="10option2">Java Application Resource</label><br><br> <input type="radio" name="answer10"
					value="Java Application Runner" id="10option3"><label for="10option3">Java Application Runner</label><br><br>
				<input type="radio" name="answer10" value="None of the above" id="10option4"><label for="10option4">None of the above</label><br><br>

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
			<input style="visibility: hidden;" type="text"
				id="score" name="score"><label></label> <input style="visibility: hidden;"
				type="text" id="passOrFail" name="passOrFail"><label></label> <input
				style="visibility: hidden;" type="text" id="grade" name="grade"><label></label>
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
				if(rb.value=="An object that has no reference."){
					mark++;
				}
				break;
			}
		}
		
		//answer 2
		const rbs2=document.querySelectorAll('input[name="answer2"]');
		for(const rb2 of rbs2){
			if(rb2.checked){
				if(rb2.value=="Marker Interface"){
					mark++;
				}
				break;
			}
		}
		
		//answer 3
		const rbs3=document.querySelectorAll('input[name="answer3"]');
		for(const rb3 of rbs3){
			if(rb3.checked){
				if(rb3.value=="Applet class"){
					mark++;
				}
				break;
			}
		}
		
		//answer 4
		const rbs4=document.querySelectorAll('input[name="answer4"]');
		for(const rb4 of rbs4){
			if(rb4.checked){
				if(rb4.value=="A final class cannot extend other classes."){
					mark++;
				}
				break;
			}
		}
		
		//answer 5
		const rbs5=document.querySelectorAll('input[name="answer5"]');
		for(const rb5 of rbs5){
			if(rb5.checked){
				if(rb5.value=="Error and Exception class"){
					mark++;
				}
				break;
			}
		}
		
		//answer 6
		const rbs6=document.querySelectorAll('input[name="answer6"]');
		for(const rb6 of rbs6){
			if(rb6.checked){
				if(rb6.value=="An exception caused by other exceptions"){
					mark++;
				}
				break;
			}
		}
		
		//answer 7
		const rbs7=document.querySelectorAll('input[name="answer7"]');
		for(const rb7 of rbs7){
			if(rb7.checked){
				if(rb7.value=="Heap memory"){
					mark++;
				}
				break;
			}
		}
		
		//answer 8
		const rbs8=document.querySelectorAll('input[name="answer8"]');
		for(const rb8 of rbs8){
			if(rb8.checked){
				if(rb8.value=="It returns the existing string from memory"){
					mark++;
				}
				break;
			}
		}
		
		//answer 9
		const rbs9=document.querySelectorAll('input[name="answer9"]');
		for(const rb9 of rbs9){
			if(rb9.checked){
				if(rb9.value=="Remote interface"){
					mark++;
				}
				break;
			}
		}
		
		//answer 10
		const rbs10=document.querySelectorAll('input[name="answer10"]');
		for(const rb10 of rbs10){
			if(rb10.checked){
				if(rb10.value=="None of the above"){
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