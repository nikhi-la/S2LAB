//By extending thread class

class A extends Thread
{
    public void run()
    {
        for(int i=0;i<5;++i)
        {
            try{
            System.out.println("Hello");
            sleep(1000);
            }catch(Exception e){}
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=0;i<5;++i)
        {
            try{
                System.out.println("World");
                sleep(1000);
            }catch(Exception e){}
        }
    }
}

class ThreadEx
{
    public static void main(String args[])
    {
        A a=new A();
        B b=new B();

        a.start();
        b.start();
    }
}