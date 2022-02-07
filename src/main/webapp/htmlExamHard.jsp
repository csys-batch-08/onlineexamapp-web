<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="examPages.css">
<title>HTML Exam</title>
</head>
<body>
	<h2 style="margin-left: 50px;" id="css">
		HTML Exam
	</h2>
	<h4 style="color: black;"><a id="home" href="UserChooseExams1">
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
				1)Which of the following HTML attribute is used to define inline
				styles?<br><br> <input type="radio" name="answer1" value="style" id="option1"><label for="option1">style</label><br><br>
				<input type="radio" name="answer1" value="type" id="option2"><label for="option2">type</label><br><br>
				<input type="radio" name="answer1" value="class" id="option3"><label for="option3">class</label><br><br>
				<input type="radio" name="answer1" value="None of the above" id="option4"><label for="option4">None
				of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question2">
			<p>
				2)A program in HTML can be rendered and read by -<br><br> <input
					type="radio" name="answer2" value="Web browser" id="2option1"><label for="2option1">Web browser</label><br><br>
				<input type="radio" name="answer2" value="Server" id="2option2"><label for="2option2">Server</label><br><br>
				<input type="radio" name="answer2" value="Interpreter" id="2option3"><label for="2option3">Interpreter</label><br><br>
				<input type="radio" name="answer2" value="None of the above" id="2option4"><label for="2option4">None
				of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question3">
			<p>
				3)The tags in HTML are -<br><br> <input type="radio" name="answer3"
					value="case-sensitive" id="3option1"><label for="3option1">case-sensitive</label><br><br> <input
					type="radio" name="answer3" value="in upper case" id="3option2"><label for="3option2">in upper
				case</label><br><br> <input type="radio" name="answer3"
					value="not case sensitive" id="3option3"><label for="3option3">not case sensitive</label><br><br> <input
					type="radio" name="answer3" value="in lowercase" id="3option4"><label for="3option4">in
				lowercase</label><br><br>

			</p>
		</div>
		<div class="questions" id="question4">
			<p>
				4)Which of the following are the attributes of the tag?<br><br> <input
					type="radio" name="answer4" value="method" id="4option1"><label for="4option1">method</label><br><br>
				<input type="radio" name="answer4" value="action" id="4option2"><label for="4option2">action</label><br><br>
				<input type="radio" name="answer4" value="Both (a) & (b)" id="4option3"><label for="4option3">Both
				(a) & (b)</label><br><br> <input type="radio" name="answer4"
					value="None of the above" id="4option4"><label for="4option4">None of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question5">
			<p>
				5)HTML is a subset of ______<br><br> <input type="radio"
					name="answer5" value="SGMD" id="5option1"><label for="5option1">SGMD</label><br><br> <input
					type="radio" name="answer5" value="SGML" id="5option2"><label for="5option2">SGML</label><br><br> <input
					type="radio" name="answer5" value="SGMH" id="5option3"><label for="5option3">SGMH</label><br><br> <input
					type="radio" name="answer5" value="None of the above" id="5option4"><label for="5option4">None
				of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question6">
			<p>
				6)To create HTML page, you need _____<br><br> <input type="radio"
					name="answer6" value="Web browser" id="6option1"><label for="6option1">Web browser</label><br><br> <input
					type="radio" name="answer6" value="text editor" id="6option2"><label for="6option2">text editor</label><br><br>
				<input type="radio" name="answer6" value="Both [A] and [B]" id="6option3"><label for="6option3">Both
				[A] and [B]</label><br><br> <input type="radio" name="answer6"
					value="None of the above" id="6option4"><label for="6option4">None of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question7">
			<p>
				7)Adding a border to your image helps the visitor to recognize it as
				what?<br><br> <input type="radio" name="answer7" value="A frame" id="7option1"><label for="7option1">A
				frame</label><br><br> <input type="radio" name="answer7" value="A link" id="7option2"><label for="7option2">A
				link</label><br><br> <input type="radio" name="answer7" value="A picture" id="7option3"><label for="7option3">A
				picture</label><br><br> <input type="radio" name="answer7"
					value="None of the above" id="7option4"><label for="7option4">None of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question8">
			<p>
				8)Which program do you need to write HTML?<br><br> <input
					type="radio" name="answer8" value="A graphics program" id="8option1"><label for="8option1">A
				graphics program</label><br><br> <input type="radio" name="answer8"
					value="Any text editor" id="8option2"><label for="8option2">Any text editor</label><br><br> <input
					type="radio" name="answer8" value="HTML -development suite 4" id="8option3"><label for="8option3">HTML
				-development suite 4</label><br><br> <input type="radio" name="answer8"
					value="All of the above" id="8option4"><label for="8option4">All of the above</label><br><br>
			</p>
		</div>
		<div class="questions" id="question9">
			<p>
				9)In HTML, tags that include both on and off tag are called<br><br>
				<input type="radio" name="answer9" value="comment tag" id="9option1"><label for="9option1">comment
				tag</label><br><br> <input type="radio" name="answer9" value="document tag" id="9option2"><label for="9option2">document
				tag</label><br><br> <input type="radio" name="answer9"
					value="container tag" id="9option3"><label for="9option3">container tag</label><br><br> <input
					type="radio" name="answer9" value="None of the above" id="9option4"><label for="9option4">None
				of the above</label><br><br>

			</p>
		</div>
		<div class="questions" id="question10">
			<p>
				10)When is the content of a table shown?<br><br> <input
					type="radio" name="answer10" value="Before the border loads" id="10option1"><label for="10option1">Before
				the border loads</label><br><br> <input type="radio" name="answer10"
					value="After the table is loaded" id="10option2"><label for="10option2">After the table is loaded</label><br><br>
				<input type="radio" name="answer10" value="In pieces as it loads" id="10option3"><label for="10option3">In
				pieces as it loads</label><br><br> <input type="radio" name="answer10"
					value="None of the above" id="10option4"><label for="10option4">None of the above</label><br><br>

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
				name="examId" value="${exam_Id}"><label></label> <input
				style="visibility: hidden;" type="text" id="examName"
				name="examName" value="${exam_Name}"><label></label> <input
				style="visibility: hidden;" type="text" id="studentId" name="uID"
				value="${user_id}" /><label></label> <input style="visibility: hidden;" type="text"
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
				if(rb.value=="style"){
					mark++;
				}
				break;
			}
		}
		
		//answer 2
		const rbs2=document.querySelectorAll('input[name="answer2"]');
		for(const rb2 of rbs2){
			if(rb2.checked){
				if(rb2.value=="Web browser"){
					mark++;
				}
				break;
			}
		}
		
		//answer 3
		const rbs3=document.querySelectorAll('input[name="answer3"]');
		for(const rb3 of rbs3){
			if(rb3.checked){
				if(rb3.value=="not case sensitive"){
					mark++;
				}
				break;
			}
		}
		
		//answer 4
		const rbs4=document.querySelectorAll('input[name="answer4"]');
		for(const rb4 of rbs4){
			if(rb4.checked){
				if(rb4.value=="Both (a) & (b)"){
					mark++;
				}
				break;
			}
		}
		
		//answer 5
		const rbs5=document.querySelectorAll('input[name="answer5"]');
		for(const rb5 of rbs5){
			if(rb5.checked){
				if(rb5.value=="SGML"){
					mark++;
				}
				break;
			}
		}
		
		//answer 6
		const rbs6=document.querySelectorAll('input[name="answer6"]');
		for(const rb6 of rbs6){
			if(rb6.checked){
				if(rb6.value=="Both [A] and [B]"){
					mark++;
				}
				break;
			}
		}
		
		//answer 7
		const rbs7=document.querySelectorAll('input[name="answer7"]');
		for(const rb7 of rbs7){
			if(rb7.checked){
				if(rb7.value=="A link"){
					mark++;
				}
				break;
			}
		}
		
		//answer 8
		const rbs8=document.querySelectorAll('input[name="answer8"]');
		for(const rb8 of rbs8){
			if(rb8.checked){
				if(rb8.value=="Any text editor"){
					mark++;
				}
				break;
			}
		}
		
		//answer 9
		const rbs9=document.querySelectorAll('input[name="answer9"]');
		for(const rb9 of rbs9){
			if(rb9.checked){
				if(rb9.value=="container tag"){
					mark++;
				}
				break;
			}
		}
		
		//answer 10
		const rbs10=document.querySelectorAll('input[name="answer10"]');
		for(const rb10 of rbs10){
			if(rb10.checked){
				if(rb10.value=="After the table is loaded"){
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
		document.getElementById("css").style.visibility="hidden";
		document.getElementById("score").value=mark;
		document.getElementById("submit").style.visibility="visible";
}

}

</script>
</html>