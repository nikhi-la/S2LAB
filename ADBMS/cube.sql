set serveroutput on
create or replace function cubee(n in number)
return number is
c number;
begin 
    c:=n*n*n;
    return c;
end cubee;
/
declare
    n number;
    d number;
    summ number:=0;
begin
    n := 12;
    d:=n mod 10;
    dbms_output.put_line(summ);
end;
/
