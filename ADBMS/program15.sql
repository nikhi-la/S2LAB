set serveroutput on
create or replace function addnum(a in number,b in number)
return number is
c number;
begin
	c:=a+b;
	return c;
end addnum;
/
--Mainprogram
declare
	x number(4);
	y number(4);
	z number(4);
begin	
	x:=&x;
	y:=&y;
	z:=addnum(x,y);
	dbms_output.put_line('Sum of '||x||' and '||y||' : '||z);
end;
/