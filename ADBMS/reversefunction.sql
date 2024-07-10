set serveroutput on
create or replace function reversing(s in varchar)
return varchar is
rev varchar(10);
begin
    rev:='';
    for i in reverse 1..length(s)
    loop
        rev:=rev||substr(s,i,1);
    end loop;
    return rev;
end reversing;
/
declare
    s varchar(10);
    rev varchar(10);
begin
    s:='&s';
    rev:=reversing(s);
    dbms_output.put_line(rev);
    if s=rev
    then
        dbms_output.put_line('Palindrome');
    else
        dbms_output.put_line('Not Palindrome');
    end if;
end;
/