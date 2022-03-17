Create Table salesman (
salesman_id  int,
salesman_name varchar2(20),
salesman_city varchar2(20),
commission int
);

Describe salesman

Insert into salesman Values (5001,'James Hoog','New York',15);
INSERT INTO salesman VALUES(5002, 'Nail Knite', 'Paris', 13);
Insert All
into salesman values (5005,'Pit Alex','London',11)
into salesman values (5006, 'McLyon' ,' Paris',14)
into salesman values (5007,'Paul Adam','Rome',13)
into salesman values (5003,'Lauson Hen','San Jose',12)
select 1 from dual;

select * from salesman;


-- Write an SQL statement to know which salesman are working for which customer.
SELECT a.customer_name AS "Customer Name", a.city, b.salesman_name AS "Salesman", b.commission FROM customers a 
INNER JOIN salesman b ON a.salesman_id=b.salesman_id;

-- Write an SQL statement to make a list in ascending order for the customer who holds a grade less than 300 and works either through a salesman
SELECT a.customer_name, a.city, a.grade, b.salesman_name AS "Salesman", b.salesman_city FROM customers a 
LEFT OUTER JOIN salesman b ON a.salesman_id=b.salesman_id WHERE a.grade<300 
ORDER BY a.customer_id;