set serveroutput on
create or replace function factorial(a in number)
return number is
fact number;
begin
    if a=1 or a=0
    then
        return 1;
    else
        fact:=1;
        for i in 2..a
        loop
            fact:=fact*i;
        end loop;        
        return fact;
    end if;
end factorial;
/
declare
    num number;
    fact number;
begin
    num:=&num;
    fact:=factorial(num);
    dbms_output.put_line('Factorial of '||num||' is '||fact);
end;
/