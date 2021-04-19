package com.Question11;

import com.Question6.ClassLevelLock;

public class ClassLevelLockProgram implements Runnable {

			public static void main(String[] args) {
				
				ClassLevelLock test1 = new ClassLevelLock();
				Thread t1 = new Thread(test1);
				Thread t2 = new Thread(test1);
				
				ClassLevelLock test2 = new ClassLevelLock();
				Thread t3 = new Thread(test2);
				
				t1.setName("t1");
				t2.setName("t2");
				t3.setName("t3");
				
				t1.start();
				t2.start();
				t3.start();

			}

			@Override
			public void run() {
				// TODO Auto-generated method stub
				classLock();
			}
			
			public void classLock() {
				
				System.out.println(Thread.currentThread().getName());
				
				synchronized (ClassLevelLock.class) {
					
					System.out.println("Synchronized block " + Thread.currentThread().getName());
					System.out.println("Synchronized block " + Thread.currentThread().getName() + " end");
				}
		}
		
	}

/* Output :
 	t1
	t3
	Synchronized block t3
	t2
	Synchronized block t3 end
	Synchronized block t2
	Synchronized block t2 end
	Synchronized block t1
	Synchronized block t1 end
*/
