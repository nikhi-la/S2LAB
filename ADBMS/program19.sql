set serveroutput on
create table customer(acc_no int primary key,balance int);
insert all into customer values(1002,10000) into customer values(1003,30000) select * from dual;

--procedure

create or replace procedure deposit(accno in number,amt in number)is
begin
    update customer set balance=balance+amt where acc_no=accno;
end deposit;
/

--Main program
declare
    accno number;
    amt number;
begin
    accno:=&accno;
    amt:=&amt;

    deposit(accno,amt);
end;
/
select * from customer;