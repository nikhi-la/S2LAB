set serveroutput on
declare
	num number(5,2);
begin
	num := &num;

	if(num mod 2=0)
	then
		dbms_output.put_line(num ||' is Even');
	else
		dbms_output.put_line(num ||' is Odd');
	end if;
end;
/