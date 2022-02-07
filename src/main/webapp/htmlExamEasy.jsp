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
	<h4 style="color: black;"><a id="home" href="UserChooseExams">
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
				1)HTML stands for -<br><br> <input type="radio" name="answer1"
					value="HighText Machine Language" id="answer1">HighText Machine Language<br><br>
				<input type="radio" name="answer1"
					value="HyperText and links Markup Language" id="answer1">HyperText and
				links Markup Language<br><br> <input type="radio" name="answer1"
					value="HyperText Markup Language" id="answer1">HyperText Markup Language<br><br>
				<input type="radio" name="answer1" value="None of these" id="answer1">None
				of these<br><br>

			</p>
		</div>
		<div class="questions" id="question2">
			<p>
				2)The correct sequence of HTML tags for starting a webpage is -<br><br>
				<input type="radio" name="answer2" value="Head, Title, HTML, body" id="answer2">Head,
				Title, HTML, body<br><br> <input type="radio" name="answer2"
					value="HTML, Body, Title, Head" id="answer2">HTML, Body, Title, Head<br><br>
				<input type="radio" name="answer2" value="HTML, Head, Title, Body" id="answer2">HTML,
				Head, Title, Body<br><br> <input type="radio" name="answer2"
					value="Title, Head, Body, HTML" id="answer2">Title, Head, Body, HTML<br><br>

			</p>
		</div>
		<div class="questions" id="question3">
			<p>
				3)Which of the following element is responsible for making the text
				bold in HTML?<br><br> <input type="radio" name="answer3"
					value="pre tag" id="answer3">pre tag<br><br> <input type="radio"
					name="answer3" value="a tag" id="answer3">a tag<br><br> <input
					type="radio" name="answer3" value="b tag" id="answer3">b tag<br><br> <input
					type="radio" name="answer3" value="br tag" id="answer3">br tag<br><br>

			</p>
		</div>
		<div class="questions" id="question4">
			<p>
				4)Which of the following tag is used for inserting the largest
				heading in HTML?<br><br> <input type="radio" name="answer4"
					value="h3 tag" id="answer4">h3 tag<br><br> <input type="radio"
					name="answer4" value="h1 tag" id="answer4">h1 tag<br><br> <input
					type="radio" name="answer4" value="h5 tag" id="answer4">h5 tag<br><br>
				<input type="radio" name="answer4" value="h6 tag" id="answer4">h6 tag<br><br>

			</p>
		</div>
		<div class="questions" id="question5">
			<p>
				5)Which of the following tag is used to insert a line-break in HTML?<br><br>
				<input type="radio" name="answer5" value="br tag" id="answer5">br tag<br><br>
				<input type="radio" name="answer5" value="a tag" id="answer5">a tag<br><br>
				<input type="radio" name="answer5" value="pre tag" id="answer5">pre tag<br><br>
				<input type="radio" name="answer5" value="b tag" id="answer5">b tag<br><br>

			</p>
		</div>
		<div class="questions" id="question6">
			<p>
				6)Which character is used to represent the closing of a tag in HTML?<br><br>
				<input type="radio" name="answer6" value="\" id="answer6">\<br><br> <input
					type="radio" name="answer6" value="!" id="answer6">!<br><br> <input
					type="radio" name="answer6" value="/" id="answer6">/<br><br> <input
					type="radio" name="answer6" value="." id="answer6">.<br><br>

			</p>
		</div>
		<div class="questions" id="question7">
			<p>
				7) input tag is -<br><br> <input type="radio" name="answer7"
					value="a format tag." id="answer7">a format tag.<br><br> <input
					type="radio" name="answer7" value="an empty tag." id="answer7">an empty
				tag.<br><br> <input type="radio" name="answer7"
					value="All of the above" id="answer7">All of the above<br><br> <input
					type="radio" name="answer7" value="None of the above" id="answer7">None
				of the above<br><br>

			</p>
		</div>
		<div class="questions" id="question8">
			<p>
				8)The hr tag in HTML is used for -<br><br> <input type="radio"
					name="answer8" value="new line" id="answer8">new line<br><br> <input
					type="radio" name="answer8" value="vertical ruler" id="answer8">vertical
				ruler<br><br> <input type="radio" name="answer8"
					value="new paragraph" id="answer8">new paragraph<br><br> <input
					type="radio" name="answer8" value="horizontal ruler" id="answer8">horizontal
				ruler<br><br>
			</p>
		</div>
		<div class="questions" id="question9">
			<p>
				9)Which of the following attribute is used to provide a unique name
				to an element?<br><br> <input type="radio" name="answer9"
					value="class" id="answer9">class<br><br> <input type="radio"
					name="answer9" value="id" id="answer9">id<br><br> <input type="radio"
					name="answer9" value="type" id="answer9">type<br><br> <input
					type="radio" name="answer9" value="None of the above" id="answer9">None
				of the above<br><br>

			</p>
		</div>
		<div class="questions" id="question10">
			<p>
				10)What are the types of unordered or bulleted list in HTML?<br><br>
				<input type="radio" name="answer10" value="disc, square, triangle" id="answer10">disc,
				square, triangle<br><br> <input type="radio" name="answer10"
					value="polygon, triangle, circle" id="answer10">polygon, triangle, circle<br><br>
				<input type="radio" name="answer10" value="disc, circle, square" id="answer10">disc,
				circle, square<br><br> <input type="radio" name="answer10"
					value="All of the above" id="answer10">All of the above<br><br>

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
				if(rb.value=="HyperText Markup Language"){
					mark++;
				}
				break;
			}
		}
		
		//answer 2
		const rbs2=document.querySelectorAll('input[name="answer2"]');
		for(const rb2 of rbs2){
			if(rb2.checked){
				if(rb2.value=="HTML, Head, Title, Body"){
					mark++;
				}
				break;
			}
		}
		
		//answer 3
		const rbs3=document.querySelectorAll('input[name="answer3"]');
		for(const rb3 of rbs3){
			if(rb3.checked){
				if(rb3.value=="b tag"){
					mark++;
				}
				break;
			}
		}
		
		//answer 4
		const rbs4=document.querySelectorAll('input[name="answer4"]');
		for(const rb4 of rbs4){
			if(rb4.checked){
				if(rb4.value=="h1 tag"){
					mark++;
				}
				break;
			}
		}
		
		//answer 5
		const rbs5=document.querySelectorAll('input[name="answer5"]');
		for(const rb5 of rbs5){
			if(rb5.checked){
				if(rb5.value=="br tag"){
					mark++;
				}
				break;
			}
		}
		
		//answer 6
		const rbs6=document.querySelectorAll('input[name="answer6"]');
		for(const rb6 of rbs6){
			if(rb6.checked){
				if(rb6.value=="/"){
					mark++;
				}
				break;
			}
		}
		
		//answer 7
		const rbs7=document.querySelectorAll('input[name="answer7"]');
		for(const rb7 of rbs7){
			if(rb7.checked){
				if(rb7.value=="an empty tag."){
					mark++;
				}
				break;
			}
		}
		
		//answer 8
		const rbs8=document.querySelectorAll('input[name="answer8"]');
		for(const rb8 of rbs8){
			if(rb8.checked){
				if(rb8.value=="horizontal ruler"){
					mark++;
				}
				break;
			}
		}
		
		//answer 9
		const rbs9=document.querySelectorAll('input[name="answer9"]');
		for(const rb9 of rbs9){
			if(rb9.checked){
				if(rb9.value=="id"){
					mark++;
				}
				break;
			}
		}
		
		//answer 10
		const rbs10=document.querySelectorAll('input[name="answer10"]');
		for(const rb10 of rbs10){
			if(rb10.checked){
				if(rb10.value=="disc, circle, square"){
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