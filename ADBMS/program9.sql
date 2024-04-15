declare
r number(6,2);
pi constant number(6,2):=3.14;
area number(6,2);
begin
r:=&r;
area:=pi*r*r;
dbms_output.put_line('Area of the circle '||area);
end;
/
set serveroutput on
