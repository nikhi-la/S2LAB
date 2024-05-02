set serveroutput on

create or replace function square(a in number) 
return number is
sq number;
begin
	sq:=a*a;
	return sq;
end square;
/
--Mainprogram
create table squares(n int,squareofn int);
declare
	s number(4);
	i number(4);
begin
	for i in 1..10
	loop
		s:=square(i);
		dbms_output.put_line(s);
		insert into squares values(i,s);
	end loop;
	 
end;
/
select * from squares;