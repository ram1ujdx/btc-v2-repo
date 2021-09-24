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

use btc_new_db;
create table emp(EMPNO numeric(04),ENAME varchar(30),JOB varchar(30),HIREDATE date,MGR int,SAL int,COMM int,DEPTNO int);
desc emp;
insert into emp values(7369,'SMITH','CLERK','1980-12-17',7902,800,NULL,20);
insert into emp values(7499,'ALLEN','SALESMAN','1981-02-20',7698,1600,300,30);
insert into emp values(7521,'WARD','SALESMAN','1981-02,22',7698,1250,500,30);
insert into emp values(7566,'JONES','MANAGER','1981-04-02',7839,2975,NULL,20);
insert into emp values(7654,'MARTIN','SALESMAN','1981-09-28',7698,1250,1400,30);
insert into emp values(7698,'BLAKE','MANAGER','1981-05-01',7839,2850,NULL,30);
insert into emp values(7782,'CLARK','MANAGER','1981-06-09',7839,2450,NULL,10);
insert into emp values(7788,'SCOTT','ANALYST','1987-04-19',7566,3000,NULL,20);
insert into emp values(7839,'KING','PRESIDENT','1981-11-17',NULL,5000,NULL,20);
insert into emp values(7844,'TURNER','SALESMAN','1981-09-08',7698,1500,0,30);
insert into emp values(7876,'ADAMS','CLERK','1987-05-23',7788,1100,NULL,20);
insert into emp values(7900,'JAMES','CLERK','1981-12-03',7698,950,NULL,30);
insert into emp values(7902,'FORD','ANALYST','1981-12-03',7566,3000,NULL,20);
insert into emp values(7934,'MILLER','CLERK','1982-01-23',7782,1300,NULL,10);

select distinct job from emp;
select * from emp order by sal asc;

select * from emp order by sal desc;

select * from emp where job='MANAGER';
SELECT * FROM EMP WHERE empno in (select mgr from emp);

select * from emp where hiredate<'1981-01-01';
select * from emp where extract(year from hiredate)<1981;

select empno,ename,sal,sal/30 as 'Daily Salary',sal*12 as 'Annual Salary' from emp;

select ename,hiredate, datediff(now(),hiredate)/365 as 'Experience' from emp order by 3 desc;

select * from emp where job='analyst' or job='clerk';

select * from emp where job not in('analyst','clerk');


select * from emp where sal <= 2000 and sal >= 1000;

select * from emp where sal not between 1000 and 2000;

```
