/* Threads allows a program to operate more efficiently by doing multiple things at the same time.

Threads can be used to perform complicated tasks in the background without interrupting the main program.

There are two ways to create a thread.
1. Thread class

2. Runnable interface:

It can be created by extending the Thread class and overriding its run() method:


*/

class simplethread extends Thread{

//class simplethread implements Runnable{

	simplethread(){

 	  Thread u=new Thread(this,"Pattern");

	System.out.println("\n\nThe name of the Thread is="+u.getName());


	System.out.print("\n\n Inside simplethread constructor");

	u.start();
	
	}
 	
	public void run() {

      	System.out.println("\nRun method is invoked by m.start--->  ");
	
	try{

     		for(int count=1;count<10;count++){
	
			for(int j=0;j<count;j++){
  	   
				System.out.print(" *  ");
	
					Thread.sleep(100);
		
	
			}//for inner

				System.out.print('\n');
		
    		}//for outer


	}catch(InterruptedException e){System.out.println(e);}

 	}//run

}//simplethread


class ThreadSimple{
  
	public static void main(String args[]){          // throws InterruptedException{
   
		simplethread m=new simplethread();
	
				//m.run();// without the effect of thread

		System.out.print("\n\n Inside main method");
  	
		 //m.start(); 
	
      /* When the class extends Thread*/
try{

  		for(int i=1;i<10;i++) {
	
    			 for(int j=0;j<i;j++){  
				
				System.out.print("  "+i);

 			}//inner for

		Thread.sleep(5);/* Sleep can be used with throws /trycatch Interrupted Exception*/
		
		System.out.print('\n');
		
		
     		}//outer for
}catch(InterruptedException e){System.out.println(e);}

  	}//main

}//class ThreadSimple






