# btc-v2-repo

## SQL Commands

```sql

create database btc_new_db;
use btc_new_db;
create table student(roll int, calss numeric(2), student_name varchar(30), phone numeric(11), marks numeric(5,2));
desc student;

insert into student values(1001, 6, 'Rahul', 5676868797,96.2);

select * from student;

```

## Day 2 - Commands

```sql

use btc_new_db;

show tables;

create table dept(deptno numeric(4) primary key, dname varchar(20) not null, location varchar(30));

create table employee(empno numeric(4) primary key, empname varchar(30) not null, salary numeric(10,2) default 0, deptno numeric(4),
							constraint fk_deptno foreign key(deptno) references dept(deptno));
                            
                            
desc employee;

insert into dept values(10,'IT', 'Bangalore');

insert into employee values(2021,'Mahesh', 55000.00, 10);

insert into employee values(2022,'Rohit', 45000.00, 10);

-- DML

-- INSERT UPDATE DELETE

insert into dept(dname,deptno) values('SALES', 20);

SELECT * FROM dept;

update dept set location='Mumbai' where deptno=20;

delete from dept; -- ==truncate

set autocommit=0;

savepoint p1;

delete from employee where empno=2022;

select * from employee;

rollback to p1;

commit;

set autocommit=1;


-- DQL 

select deptno, dname from dept;

select * from employee where deptno=10;

SELECT * FROM employee order by salary desc;

-- IN BETWEEN LIKE AND OR GROUP BY ORDER BY 


```
