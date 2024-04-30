set serveroutput on
--Function
create or replace function findMax(a in number,b in number)
return number is
c number;
begin
	if a>b then
		c:=a;
	else
		c:=b;
	end if;
	return c;
end findMax;
/
--Main Program

declare
	x number(4);
	y number(5);
	z number(5);
begin
	x:=&x;
	y:=&y;
	z:=findMax(x,y);
	dbms_output.put_line('Larger number ( '||x||','||y||' ) is '||z);	
end;
/

