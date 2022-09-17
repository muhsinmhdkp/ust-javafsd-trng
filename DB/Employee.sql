use ustDB;

drop table Employee;
create table Employee (EMP_ID INT NOT NULL PRIMARY KEY , 
					   MANAGER_ID INT,
                       FIRST_NAME varchar(50)  not null,
                       LAST_NAME varchar(50)  not null,
                       EMP_TITLE varchar(50)  not null,
                       SALARY varchar(50)  not null,
                       JOINING_DATE  varchar(50)  not null,
                       DEP  varchar(50)  not null) ;
                       
desc Employee;

insert into Employee value (1,null, 'Monika','Arora','Manager',100000,'02/20/14 9.00','HR'),
						   (2,1,'Niharika','verma','Executive',80000,'06/11/14 9.00','Admin'),
                           (3,1,'Vishal','Singhal','Executive',300000,'02/20/14 9.00','HR'),
                           (4,null, 'Amitabh','Singh','Manager',500000,'02/20/14 9.00','Admin'),
			 			   (5,4,'Vivek','Bhati','Asst.Manager',500000,'06/11/14 9.00','Admin'),
						   (6,5,'Vipul','Diwan','Executive',200000,'06/11/14 9.00','Account'),
						   (7,4,'Satish','kumar','Lead',75000,'01/20/14 9.00','Account'),
                           (8,4,'Geetika','Chauhan','Lead',90000,'04/11/14 9.00','Admin'),
                           (8,null,'Geetik',' ','Lead',4000,'04/11/14 9.00','Admin');
  
  

select * from Employee;

select concat( FIRST_NAME, ' ',LAST_NAME)as NAME from Employee where SALARY between 50000 and 100000;

select concat( a.FIRST_NAME, ' ',a.LAST_NAME)as eNAME, concat( b.FIRST_NAME, ' ',b.LAST_NAME)as mNAME from Employee a, Employee b where a.MANAGER_ID = b.EMP_ID;

select DEP,count(*)  as Count  from Employee group by DEP order by Count desc;

select concat( FIRST_NAME, ' ',LAST_NAME) as Name,EMP_TITLE,SALARY,DEP from Employee where MANAGER_ID is null;

select count(EMP_ID) as Count from Employee where JOINING_DATE >= '01/01/2014' and JOINING_DATE <= '12/31/2014';

select SALARY from (select row rn from Employee ) where rn=5 order by SALARY asc; 

with ordered as(select row_number() over (order by SALARY asc) as rowNum from Employee) select * from Employee where row_number is 5;

select distinct SALARY from Employee group by  SALARY  having row_number 5;







