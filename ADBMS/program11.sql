set serveroutput on
declare
	n number(3);
	i number(3);
	fact number(4):=1;
begin
	n:=&n;
	if(n<1)
	then
		fact:=1;
	else
		for i in 1..n
		loop
			fact:=fact*i;
		end loop;
	end if;
	dbms_output.put_line('Factorial of '||n||' is '||fact);
end;
/


