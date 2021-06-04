select user(), database();

desc employee;
desc title;
desc department;

select * from employee;
delete from employee where EMP_NO = 1004;

select * from vw_full_employee;

select EMP_NO, EMP_NAME, TITLE_NO, MANAGER_NO, SALARY, DEPT_NO from vw_full_employee;