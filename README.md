# btc-v2-repo

## SQL Commands

```sql

use btc_new_db;

show tables;

create table dept(deptno numeric(4) primary key, dname varchar(20) not null, location varchar(30));

create table employee(empno numeric(4) primary key, empname varchar(30) not null, salary numeric(10,2) default 0, deptno numeric(4),
							constraint fk_deptno foreign key(deptno) references dept(deptno));
                            
                            
desc employee;

insert into dept values(10,'IT', 'Bangalore');
insert into dept values(20,'SALES', 'Mumbai');
insert into dept values(30,'Accounts', 'Kolkata');
insert into dept values(40,'HR', 'Delhi');


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

SELECT * FROM emp where ename like '[S-Z]%T';
SELECT * FROM emp where sal like '___';

select * from emp where hiredate like '____-02%';


-- Group Functions

-- sum avg min max count 

select min(sal) from emp;

select job, min(sal) as 'Minimum Salary', count(*) as 'Total Employees' from emp where job='CLERK' group by job; 

select job, min(sal) as 'Minimum Salary', count(*) as 'Total Employees' from emp group by job having count(*)>2; 


-- where vs having



select e.*, d.* from emp e join dept d USING(deptno);

select d.deptno, d.dname from dept d left join emp e on d.deptno=e.deptno where e.empno is NULL;

-- find the no of employees working in Kolkata

select count(empno) as Total_Emp_From_Kolkatha from emp e ,dept d where e.deptno=d.deptno and location='Kolkata';

-- display the dept details along with employee count

select d.*, count(empno) as 'Total Employees' from dept d left join emp e using(deptno) group by d.deptno, d.location, d.dname; 

-- display the total salary of SALES dept

select sum(e.sal) from emp e left join dept d on d.deptno=e.deptno where d.dname='SALES';

-- display the emplyee details of IT dept




-- find the SALESMAN working in Mumbai




-- Find the manager working for IT dept



-- Find the least earner of SALES dept

select employee.*,dept.*,min(sal) from emp employee join dept where employee.DeptNo=dept.deptno and dept.dname='SALES';

select e.* from emp e left join dept d on d.deptno=e.deptno where d.dname='SALES' order by sal limit 1;

-- find the least earning manager

select distinct m.* from emp e join emp m on e.mgr=m.empno order by m.sal limit 1;

-- find the EMPLOYEE whose salary is more than his manager









```
