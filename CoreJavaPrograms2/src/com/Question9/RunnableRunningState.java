package com.Question9;

public class RunnableRunningState {
	
	public static void main(String[] args) {
		
      try {

          Thread1 thread1 = new Thread1();
          Thread2 thread2 = new Thread2();
          Thread3 thread3 = new Thread3();

          thread1.start();
          thread2.start();
          thread3.start();
      }
      catch (Exception e) {
    	  
          e.printStackTrace();
      }	

	}
	  
}
	class Thread1 extends Thread {
	  
	    public void run()
	    {
	  
	        System.out.println("Thread 1 started ");
	  
	        for (int i = 1; i <= 10; i++) 
	        {
	            System.out.print(i + " ");
	  
	        System.out.println("\nThread 1 completed");
	        }
	    }
	}
	  
	class Thread2 extends Thread {
	  
	    public void run()
	    {
	  
	        System.out.println("Thread 2 started ");
	  
	        for (int i = 100; i <= 110 ; i++) {
	            System.out.print(i + " ");
	        
	        System.out.println("\nThread 2 completed");
	        }
	    }
	}
	  
	class Thread3 extends Thread {
	  
	    public void run()
	    {
	  
	        System.out.println("Thread 3 started ");
	  
	        for (int i = 200; i <= 210; i++) {
	            System.out.print(i + " ");
	  
	        System.out.println("\nThread 3 completed");
	        }
	    }
	}
	
	
	
	
	/* Output :
	 * 	Thread 1 started 
		Thread 3 started 
		Thread 2 started 
		200 100 201 101 202 102 1 203 204 205 206 207 103 2 3 4 5 6 208 7 8 9 10 
		Thread 1 completed
		104 105 106 209 210 
		Thread 3 completed
		107 108 109 110 
		Thread 2 completed
  */
