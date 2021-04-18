package com.Question6;

public class MethodOverloading {

	int a,b,c;
	double d;
	double e;
	void sum() {       
		a=40;
		b=50;
		System.out.println("No Parameters : "+(a+b));
	}
	void sum(int x, int y) {      
		a=x;
		b=y;
		System.out.println("Pass 2 parameters - with same datatype : "+(a+b));
	}
	void sum(int x, double y) {      
		a=x;
		d=y;
		System.out.println("Pass 2 parameters - with different datatype : "+(a+d));
	}
	void sum(int x, int y, int z) {     
		a=x;
		b=y;
		c=z;
		System.out.println("Pass 3 parameters - with same datatype : "+(a+b+c));
	}
	void sum(int x, double y, double z) {     
		a=x;
		d=y;
		e=z;
		System.out.println("Pass 3 parameters - with different datatype : "+(a+d+e));
	}
	
	public static void main(String[] args) {
	
	MethodOverloading mo = new MethodOverloading();
	System.out.println("Performing Addition By MethodOverloding");
	
	mo.sum();
	mo.sum(5, 5);
	mo.sum(10, 10.5);
	mo.sum(4, 5, 6);
	mo.sum(10, 10.5, 10.5);
}
}
	
	

