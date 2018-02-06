package com.aml.thread;

public class ThreadDemo extends Thread{
	public void run() {
		try {
		      for(int i=1;i>=5;i++)
		      {
			    System.out.println(i);
			    System.out.println("child thread");
			    Thread.sleep(500);
		      }
	          	System.out.println("thread is running...");
	      } 
		catch(Exception e)
	    	{
		    	System.out.println("error ala ki re");
		
	        }
	  }
	
	public static void main(String[] args) 
	{
	  Thread t1=Thread.currentThread();
	  System.out.println(t1);
	  t1.setName("Thread1");
	  System.out.println(t1);
	  try 
	   {
	      for(int i=5;i>0;i--)
	      {
	    	  ThreadDemo td=new ThreadDemo();
		      Thread t=new Thread(td);
		      t.start();
		      System.out.println(i);
		      System.out.println("main thread");
		      Thread.sleep(1000);
		  // t.start();
	      }
	     
   	}
	 catch(Exception i)
	 {
		System.out.println("error alach re");
	 }
  }
}

