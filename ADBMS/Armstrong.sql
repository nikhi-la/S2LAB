set serveroutput on

create or replace function cubee(n in number)
return number is
c number;
begin 
    c:=n*n*n;
    return c;
end cubee;
/
declare
    n number;
    d number;
    x number;
    summ number:=0;
begin
    n := &n;
    x:=n;
    while(n!=0)
    loop
        d:=n mod 10;
        summ:=summ+cubee(d);
        n:=TRUNC(n / 10);
    end loop;
    if(x=summ)
    then
        dbms_output.put_line('Armstrong');
    else
        dbms_output.put_line('Not Armstrong');
    end if;
end;
/
