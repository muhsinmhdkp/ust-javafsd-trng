use ustDB;
drop table Customer;
create table Customer   (Cust_id INT NOT NULL PRIMARY KEY , 
					   Cust_name varchar(50),
                       City varchar(50),
                       Grade int ,
                       Salesman_id int) ;
desc Customer;
Drop table Order1;

create table Order1    (Order_no INT NOT NULL PRIMARY KEY , 
					   Order_Date varchar(50),
                       Order_amt int,
                       Cust_ID int references Costomer(Cust_id),
                       Salesman_ID int,
                       Commission varchar(5));
                       
                       
insert into Customer values (3001,"Nick Rimando", "New YOrk ", 100, 5001),
							(3002,"Brad Davis", "New YOrk ", 200, 5001),
                            (3003,"Graham Zusi", "California", 200, 5002),
                            (3004,"Julian Green", "London", 300, 5002),
                            (3005,"Fabian John", "Paris", 300, 5006),
                            (3006,"Geoff Rock", "Berlin", 100, 5003),
                            (3007,"Rozy Altidor", "Moscow", 200, 5007);

select * from Customer;



insert into Order1 values (1,"12/22/2005",160,3001,5002,"13%"),
						  (9,"08/10/2005",190,3001,5005,"11%"),
                          (2,"07/13/2005",500,3002,5001,"15%"),
                          (4,"17/15/2005",420,3002,null,"0"),
                          (7,"12/22/2005",1000,3003,null,"0"),
                          (5,"10/02/2006",820,3004,5001,"15%"),
                          (8,"11/03/2006",2000,3004,5001,"15%"),
                          (10,"10/09/2006",1500,3005,5006,"14%"),
                          (12,"20/10/2006",1800,3005,5003,"12%"),
                          (13,"20/10/2006",1800,4004,5003,"12%");
                          
                          
							

select * from Order1;

select Cust_name, count(Order1.Cust_ID) from  Customer inner join Order1 on Customer.Cust_id =Order1.Cust_ID group by Customer.Cust_id;
select * from  Order1 where Cust_ID not in (select Cust_id from Customer);


select max(Order_amt) as Max_amount, min(Order_amt) as Min_amount, avg(Order_amt) as Average_amount from Order1;
select cust_ID, count(cust_ID) as No_of_orders, sum(Order_amt) as Total from Order1 where cust_ID in (select cust_id from Customer group by city) group by cust_ID;


                            
                      

