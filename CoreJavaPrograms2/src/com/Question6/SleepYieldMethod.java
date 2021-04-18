package com.Question6;

public class SleepYieldMethod extends Thread{
	
	 public void run(){  
		 
		 System.out.println(Thread.currentThread().getName());
		  for(int i=1;i<5;i++){  
		    try{
		    	
		    	Thread.sleep(500);
		    }
		    catch(InterruptedException e)
		    {
		    	System.out.println(e);
		    	}  
		    System.out.println(i);  
		  }  
	 }
	
//	 public void run(){  
//	        for (int i=0; i<4 ; i++)
//	        {
//	            System.out.println(Thread.currentThread().getName());  
//	    }  
//	 }
//	 
	public static void main(String[] args) {
	
		SleepYieldMethod t1=new SleepYieldMethod();  
		SleepYieldMethod t2=new SleepYieldMethod();  
			   
			  t1.start();  
			  t2.start();  
			  t1.setName("Thread 1 Sleep");
			  t2.setName("Thread 2 Sleep");
			  
			  SleepYieldMethod t3 = new SleepYieldMethod();  
			  SleepYieldMethod t4 = new SleepYieldMethod();  
			  
		        t3.start();  
		        t4.start(); 
		        t3.setName("Thread 3 Yield");
				t4.setName("Thread 4 Yield");
				
		        for (int i=0; i<2; i++)  
		        {  
		            // Control passes to child thread  
		            t3.yield();  
		            System.out.println(Thread.currentThread().getName() + " Thread 3 in control");  
		        }  
			
	} 
}


		/*Output : For Yield
		 * main Thread 3 in control
	Thread 4 Yield
	Thread 4 Yield
	Thread 4 Yield
	Thread 4 Yield
	Thread 3 Yield
	Thread 3 Yield
	Thread 3 Yield
	Thread 3 Yield
	main Thread 3 in control
 */
		 
