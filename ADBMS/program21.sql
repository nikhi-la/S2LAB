set serveroutput on
create table customers(c_id int,c_name varchar(30),c_salary int);
create or replace trigger salary_change
after insert or update or delete on customers
for each row
declare
    salary_diff number(30);
Begin  
    salary_diff:= :new.c_salary - :old.c_salary;
    dbms_output.put_line('Salary Difference : '||salary_diff);    
    dbms_output.put_line('Old Salary : '||:old.c_salary);
    dbms_output.put_line('New Salary : '||:new.c_salary);
end;
/
insert into customers values(&id,'&name',&salary);
select * from customers;
update customers set c_salary=&salary where c_id=&c_id;
select * from customers;