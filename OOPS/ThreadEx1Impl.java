//extends Thread class

class Thread1 implements Runnable
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
                Thread.sleep(1010); //sleep(1000);
            }catch(Exception e){}
        }
    }
}

class ThreadEx1Impl
{
    public static void main(String args[])
    {
        Thread1 t1=new Thread1();
        Thread td1=new Thread(t1);//only difference from extend thread

        Thread2 t2=new Thread2();
        Thread td2=new Thread(t2); //only difference from extend thread

       
        td1.start(); 
        td2.start();
    }
}