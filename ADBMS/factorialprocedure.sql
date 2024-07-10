set serveroutput on
create or replace procedure factorials(a in number,fact out number) is
begin
    if a=1 or a=0
    then
        fact:=1;
    else
        fact:=1;
        for i in 2..a
        loop
            fact:=fact*i;
        end loop;    
    end if;
end factorials;
/
declare
    num number;
    fact number;
begin
    num:=&num;
    factorials(num,fact);
    dbms_output.put_line('Factorial of '||num||' is '||fact);
end;
/