//extends Thread class

class Thread1 extends Thread
{
    Thread1()
    {
        Thread u1=new Thread(this,"T1");//To explicitly give thread name .By default it is thread-1,3,5....
        //this is used to refer to this thread.Then only u.start() execute

        System.out.println(u1.getName()); //get thread name

        //u1.start(); //Case 1: automatically start thread's run method when object is created in the main class.
                    //Otherwise use object.start in main class

    }
    public void run()
    {
        for(int i=0;i<5;++i)
        {
            try{
                System.out.println(i);
                Thread.sleep(1000); //sleep(1000);
            }catch(Exception e){}
        }
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        for(int i=5;i<11;++i)
        {
            try{
                System.out.println(i);
                Thread.sleep(1000); //sleep(1000);
            }catch(Exception e){}
        }
    }
}

class ThreadEx1
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();

        //t1.run(); //Case 2 : run is invoked just like a normal method.Thread is not affected

        t1.start(); //Case 3 : Actual way of invoking thread.Thread's run method is invoked
        t2.start();
    }
}