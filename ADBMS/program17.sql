set serveroutput on
---procedure
create or replace procedure findMin(a in number,b in number,c out number)is
begin
    if(a<b)
    then
        c:=a;
    else
        c:=b;
    end if;
end findMin;
/

---Main program

declare
    x number;
    y number;
    m number;
begin
    x:=&x;
    y:=&y;
    findMin(x,y,m);
    dbms_output.put_line('Minimum of ( '||x||' , '||y||' ) : '||m);
end;
/