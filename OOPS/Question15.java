import java.util.Scanner;
class Fibonacci implements Runnable
{
    Thread t;
    int range,f1=0,f2=1;

    Fibonacci(int n)
    {
        t=new Thread(this,"Fibonacci series");
        range=n;
    }
    public void run()
    {   
        int f3;
        System.out.println(t.getName());
        
        for(int i=0;i<range;++i)
        {
            System.out.print(f1+"  ");
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        System.out.println();
    }
}

class EvenNum implements Runnable
{
    Thread t1;
    int range;

    EvenNum(int n)
    {
        t1=new Thread(this,"Even Number series");
        range=n;
    }

    public void run()
    {     
        try{
            Thread.sleep(100); 
        }catch(Exception e){}  

        System.out.println(t1.getName());

        for(int i=1;i<=range;++i)
        {
            if(i%2==0)
                System.out.print(i+"  ");
        }
        System.out.println();
    }
}

class Question15
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter range");
        int n=s.nextInt();

        Fibonacci f=new Fibonacci(n);
        Thread fib=new Thread(f);
        
        EvenNum e=new EvenNum(n);
        Thread en=new Thread(e);

        fib.start();
        en.start();
    }
}
