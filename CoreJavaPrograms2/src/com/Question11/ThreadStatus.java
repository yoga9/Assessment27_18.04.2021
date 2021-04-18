package com.Question11;

import java.util.Set;

public class ThreadStatus {

	 public static void main(String args[]) throws Exception
	    {
	        for (int thread_num = 0; thread_num < 5; thread_num++) { 
	        	
	            Thread t = new Thread(new MyThread());
	            t.setName("MyThread:" + thread_num);
	            t.start();
	        }
	        
	        Set<Thread> threadSet = Thread.getAllStackTraces().keySet();
	        
	        for (Thread t : threadSet) {
	            System.out.println("Thread :" + t + ":" + "Thread status : " + t.getState());
	        }
	    }
	}
	class MyThread implements Runnable {
		
	    public void run()
	    {
	        try {
	            Thread.sleep(2000);
	        }
	        catch (Exception err) {
	            System.out.println(err);
	        }
	    }
	}
	  

	  
	   