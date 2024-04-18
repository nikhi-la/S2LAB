set serveroutput on
declare
	r number(6,2);
	ch number(6):=0;
	area number(6,4);
begin
	loop
		r:=&r;
		if(r<1)
		then
			dbms_output.put_line('Radius less than 1');

		else
			area:=3.14*r*r;
			dbms_output.put_line('Area : '|| area);
			ch:=ch+1;
			if(ch=2)then
			break;
			end if;
		end if;	
	end loop;	
end;
/