set serveroutput on

create or replace function factorial(n in number)
return number is
fact number:=1;
begin 
    if(n!=0)
    then
        for i in 2..n
        loop
            fact:=fact*i;
        end loop;
    end if;
    return fact;
end factorial;
/
declare
    n number;
begin
    n := &n;
    n:=factorial(n);
    dbms_output.put_line(n);
end;
/
