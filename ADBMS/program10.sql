
set serveroutput on
declare
	r number(6,2);
	ch number(6):=0;
	area number(6,4):=0;
begin
		r:=&r;

		if(r<1)
		then
			dbms_output.put_line('Radius less than 1');

		else
			for i in 1..r
			loop
				area:=area+r*3.14;
				end loop;
			dbms_output.put_line('Area : '|| area);
		end if;	

end;
/
