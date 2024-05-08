set serveroutput on
create table student(s_id int,s_name varchar(30));
create table statustable(action varchar(50),systemdate date);
create or replace trigger insert_display
after insert or update or delete on student
Begin
if(inserting)
then
	insert into statustable values('Insert Done',SYSDATE);
end if;
if(updating)
then
	insert into statustable values('Update Done',SYSDATE);
end if;
if deleting
then
	insert into statustable values('Delete Done',SYSDATE);
end if;
end;
/
insert into student values(&s_id,'&s_name');
select * from student;
select * from statustable;
update student set s_name='&sname' where s_id=&id;
select * from student;
select * from statustable;
delete from student where s_id=&id;
select * from student;
select * from statustable;