use ustDB;
drop table  Worker;
create table Worker (WORKER_ID int not null primary key,
					FIRST_NAME varchar(50) not null,
                    LAST_NAME varchar(50),
                    SALARY double not null,
                    JOINING_DATE datetime not null,
                    DEPARTMENT varchar(50) not null);
               
              

desc Worker;
drop table Bonus;
create table Bonus (WORKER_REF_ID int not null,
					BONUS_DATE datetime not null,
                    BONUS_AMOUNT int);
                    
                    
desc Bonus;

create table Title (WORKER_REF_ID int not null primary key,
					WORKER_TITLE varchar(50),
                    AFFECTED_FROM datetime);
                    
desc Title;

insert into Worker values (001,"Monika", "Arora", 100000, "2014-02-20 09:00:00", "HR"),
						  (002, "Niharika", "Verma", 80000, "2014-06-11 09:00:00", "Admin"),
                          (003, "Vishal", "Singhal", 300000, "2014-02-20 09:00:00" ,"HR"),
                          (004, "Amitabh", "Singh", 500000, "2014-02-20 09:00:00", "Admin"),
                          (005, "Vivek", "Bhati" , 500000, "2014-06-11 09:00:00", "Admin"),
                          (006, "Vipul", "Diwan", 200000, "2014-06-11 09:00:00", "Account"),
                          (007, "Satish", "Kumar", 75000, "2014-01-20 09:00:00",  "Account"),
                          (008, "Geetika", "Chauhan", 90000, "2014-04-11 09:00:00", "Admin");
                          
select * from Worker;

insert into Bonus values (1, "2016-02-20 00:00:00", 5000),
						 (2, "2016-06-11 00:00:00", 3000),
                         (3, "2016-02-20 00:00:00", 4000),
                         (1, "2016-02-20 00:00:00", 4500),
                         (2, "2016-06-11 00:00:00", 3500);
                         
 select * from Bonus;


insert into Title values (1, "Manager", "2016-02-20 00:00:00"),
						 (2, "Executive", "2016-06-11 00:00:00"),
                         (8, "Executive", "2016-06-11 00:00:00"),
                         (5, "Manager", "2016-06-11 00:00:00"),
                         (4, "Asst. Manager", "2016-06-11 00:00:00"),
                         (7, "Executive", "2016-06-11 00:00:00"),
                         (6, "Lead", "2016-06-11 00:00:00"),
                         (3, "Lead", "2016-06-11 00:00:00");
 
 select * from Title;
 
 
#Q6
select FIRST_NAME as WORKER_NAME from Worker ;

#Q7
select upper( FIRST_NAME) as WORKER_NAME from worker;

#Q8
select distinct DEPARTMENT, length(DEPARTMENT) as Length from Worker;

#Q9
select replace(FIRST_NAME,'a','A') from Worker;

#Q10
select concat(FIRST_NAME,' ', LAST_NAME) as Complete_name from Worker;

#Q11
select * from Worker order by FIRST_NAME asc;

#Q12
select * from Worker order by FIRST_NAME asc, DEPARTMENT desc;

#Q13
select * from Worker where FIRST_NAME = "Vipul" or FIRST_NAME = "Satish";

#Q14
select * from Worker where FIRST_NAME != "Vipul" and FIRST_NAME != "Satish";

#Q15
select * from Worker where DEPARTMENT = "Admin";

#Q16
select * from Worker where FIRST_NAME like '%a%';

#Q17
select * from Worker where FIRST_NAME like '%a';

#Q18
select * from Worker where FIRST_NAME like '%h' and length(FIRST_NAME)=6;

#Q19
select * from Worker where SALARY between 100000 and 300000;

#Q20
select * from Worker where JOINING_DATE between "2014-02-01 00:00:00" and "2014-02-28 23:59:59";
select * from Worker where  month(JOINING_DATE) = 02 and year(JOINING_DATE) = 2014;

#Q21
select count(*) from Worker where DEPARTMENT = "Admin";

#Q22
select concat(FIRST_NAME, ' ' , LAST_NAME) as NAME, SALARY from Worker where SALARY between 50000 and 100000;

#Q23
select DEPARTMENT, count(DEPARTMENT) as Count from Worker group by DEPARTMENT order by count( DEPARTMENT )desc;

#24
select * from Worker inner join Title on Worker.WORKER_ID = Title.WORKER_REF_ID where WORKER_TITLE = "Manager";
select * from Worker where trim(leading '0' from WORKER_ID)  in  (select WORKER_REF_ID from Title where WORKER_TITLE = "Manager");

#25
select * from Worker group by WORKER_ID,FIRST_NAME,LAST_NAME having count(WORKER_ID)>1 or count(FIRST_NAME)>1 or count(LAST_NAME)>1 or count(SALARY)<1 or count(JOINING_DATE)>1 or count(DEPARTMENT)>1;

#26
select * from Worker where mod(worker_id,2) = 1;

#27
select * from Worker where mod(worker_id,2) = 0;