package com.Question9;

public class PatternProgram {

	public static void main(String[] args) {
		
		int n=4;  
		//Mirrored Right Triangle Star Pattern
		 
		for (int i= 0; i<= n; i++)  
		{  
		 
			for (int j=1; j<=n-i; j++)  
			{  
			System.out.print(" ");  
			}  
			
			for (int k=0;k<=i;k++)  
			{  
			System.out.print(" * ");  
			}  
			
		System.out.println(" ");  
		
		}  
	}

}
