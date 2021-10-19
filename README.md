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


select d.*, (select count(empno) from emp e where e.deptno=d.deptno) as 'Total Employees' from dept d;



-- display the total salary of SALES dept

select sum(e.sal) from emp e left join dept d on d.deptno=e.deptno where d.dname='SALES';

select sum(sal) from emp where deptno=(select deptno from dept where dname ='sales');

-- display the emplyee details of IT dept

-- Using Join
SELECT e.* from emp e join dept d using(deptno) where d.dname='IT';

-- Using Sub-query


select * from emp where deptno=(select deptno from DEPT where dname='IT');



-- find the SALESMAN working in Mumbai




-- Find the manager working for IT dept



-- Find the least earner of SALES dept

select employee.*,dept.*,min(sal) from emp employee join dept where employee.DeptNo=dept.deptno and dept.dname='SALES';

select e.* from emp e left join dept d on d.deptno=e.deptno where d.dname='SALES' order by sal limit 1;

-- find the least earning manager

select distinct m.* from emp e join emp m on e.mgr=m.empno order by m.sal limit 1;

-- find the EMPLOYEE whose salary is more than his manager


select distinct m.* from emp e join emp m on e.mgr=m.empno;

select * from emp where empno in(select distinct mgr from emp);

select *
from emp e,(select *from emp where empno in(SELECT mgr from emp)) a
where e.sal >a.sal
  and e.mgr = a.empno;
  
  
select * from dept where deptno not in(select deptno from emp);

select ename, sal from emp where empno in(select mgr from emp) order by sal limit 1;

-- manager with the no of employees working under them

select count(*) as No_Employee, mgr from emp, dept where emp.deptno=dept.deptno group by mgr;

select m.*, (select count(empno) from emp e where e.mgr=m.empno) as 'Total Employees' from emp m where m.empno in(select mgr from emp);


-- dept with least no of employees

use btc_new_db;
-- manager with highest no of employees



-- Functions

DELIMITER //
create function findExperience(hiredate date) returns float
deterministic
begin 
	DECLARE expr float;
    set expr= datediff(now(),hiredate)/365;
    return (expr);
    
    end//
    
DELIMITER ;

drop function findExperience;

select empno, ename, hiredate, findExperience(hiredate) as 'Exp' from emp;

create table dept_backup as (select * from dept where deptno=0);
desc dept_backup;

DELIMITER //
create trigger before_delete_backup before DELETE on dept for each row
begin
insert into dept_backup values(old.deptno, old.dname, old.location);
end //

DELIMITER ;

delete from dept where deptno=10;
alter table employee drop constraint fk_deptno;

select * from dept_backup;

USE btc_new_db;

set autocommit=0;

START transaction;

insert into dept values(110,'Customer','Mumbai');

savepoint p1;
insert into emp values(9999,'MAHESH','CLERK','1982-01-23',7782,1300,NULL,10);
insert into emp values(8888,'kabir','1982-01-23',7782,1300,NULL,10);

commit;

release savepoint p1;

ROLLBACK TO p1;
rollback;
select * from dept;
select * from emp;








```




## SonarQube steps -

1. Download SonarQube

1. Extract and Run StartSonar.bat

1. Visit localhost:9000 and change the security settings

1. Add the following dependency to your maven project

```xml

	<dependency>
	<groupId>org.sonarsource.scanner.maven</groupId>
  		<artifactId>sonar-maven-plugin</artifactId>
    	<version>3.6.0.1398</version>
	</dependency>

```

1. Add global maven settings
	
	```text
	
	~ .m2/settings.xml
	
	```

1. Copy and Paste the following -

```xml

<settings>
    <pluginGroups>
        <pluginGroup>org.sonarsource.scanner.maven</pluginGroup>
    </pluginGroups>
    <profiles>
        <profile>
            <id>sonar</id>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
            <properties>
                <!-- Optional URL to server. Default value is http://localhost:9000 -->
                <sonar.host.url>
                  http://localhost:9000
                </sonar.host.url>
            </properties>
        </profile>
     </profiles>
</settings>

```

1. Run your project as Maven Build with goal clean verify sonar:sonar

1. Visit localhost:9000

