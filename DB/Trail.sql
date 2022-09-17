create database ustDB;
show databases;
use ustDB;
create table ust_table(ID int not null primary key,
 name varchar(20), 
 state varchar(20),
 age int);
  show tables;
  desc ust_table;
  insert into ust_table values 
   (1,"muhsin","kerala",23),
   (2,"kiran","kerala",23),
   (3,"namitha","kerala",23);
 
 select * from ust_table;
 
 
 
 update ust_table set age = 25 where id = 2;
 
 select name, if (id>2,"good","bad") as remarks from ust_table;

create table table2(iD int not null primary key , dpt_name varchar(30), city varchar(34));
alter table table2 change column dpt_name dept_name varchar(35);

 insert into table2 values (1,"physics","kozhikode"),
 (2,"CS","Kannur"),
 (3,"IT","EKM");
 
 insert into table2 values(4,"zoology","kozhikode"),
 (5,"botony","EKM");

select name, dept_name,city,state from ust_table join table2 on ust_table.ID  =  table2.iD;

select count(ID) from ust_table;

select city, count(*) from table2 group by city ;

