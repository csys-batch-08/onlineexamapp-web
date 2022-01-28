
--register table
create table registerPage(
id number generated always as identity start with 1,
first_name varchar2(30) not null,
last_name varchar2(20) not null,
email varchar2(50) unique not null,
password varchar2(20) not null,
confirm_password varchar2(20) not null,
phone_number number(10) unique not null,
role varchar2(10) default 'student',
constraint pk_id primary key(id)
);
alter table registerPage add profilepicture varchar2(500) default 'iconforuser.png';
alter table registerPage add reason varchar2(50);
alter table registerPage add lastactivedate date default sysdate;
update registerPage set profilepicture='onlineExamReferenceCropped.jpg' where id=22;
update registerPage set lastactivedate='10-01-22';
update registerPage set reason='no requests';
update registerPage set reason='could you please make me active mode' where id=21;
update registerPage set reason='please make me active mode' where id=101;
select * from registerPage;
commit;

--exam details table

create table examDetails(
examId number generated always as identity start with 101 increment by 1 primary key,
examName varchar2(20),
examType varchar2(20),
difficultyLevel varchar2(10),
durationMinutes number 
);

select * from examDetails;
commit;


--student details table

create table scoreDetails(
studentId number,
examId number,
examName varchar2(80),
score number,
passOrFail varchar2(80),
grade varchar2(80),
examdate date,
constraint fk_id foreign key(studentId) references registerPage(id),
constraint fk_id1 foreign key(examId) references examDetails(examId)
);
insert into scoreDetails values(4,106,'CSS',7,'pass','C','10-01-22');
delete from scoreDetails where score=18;
commit;
rollback;
delete from scoreDetails where studentId=41;
--feedbackDetails table

create table feedbackDetails(
feedbackId number generated always as identity start with 2022,
userId number,
examId number,
feedback varchar2(300),
primary key(feedbackId),
FeedbackDate date,
foreign key(userId) references registerPage(id),
foreign key(examId) references examDetails(examId)
);

select * from feedbackDetails;
commit;


--contactUs table

create table contactUs(
userid number,
email varchar2(40),
comments varchar2(300),
commentDate date,
primary key(userid),
foreign key(userid) references registerPage(id),
foreign key(email) references registerPage(email)
);

select * from contactUs;
commit;


--<>--Select Queries--<>--

select * from registerPage;
select * from examDetails;
select * from scoreDetails;
select * from feedbackDetails;
select * from contactUs;