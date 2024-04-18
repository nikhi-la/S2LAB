
declare
ch number(6):=5;
begin
	while(ch>0)
	loop
		dbms_output.put_line(ch);
		ch:=ch-1;
	end loop;
end;
/
set serveroutput on