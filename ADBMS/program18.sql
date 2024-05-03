set serveroutput on
---Procedure with same in and out parameter
create or replace procedure square(x in out number)is
begin
    x:=x*x;
end square;
/

---Mainprogram

declare
    a number;
    b number;
begin
    a:=&a;
    b:=a;
    square(a);
    dbms_output.put_line('Square of '||b||' : '||a);
end;
/