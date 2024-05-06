class A implements Runnable
{
    public void run()
    {
        System.out.println("Hai");
    }
}
class ThreadImpl
{
    public static void main(String args[])
    {
        A a=new A();
        Thread threada=new Thread(a);

        threada.start();
    }
}