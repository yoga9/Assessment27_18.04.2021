package com.Question11;

import java.util.Scanner;

public class PatternNo {

	public static void main(String[] args) {
		
				int rows = 4;
		
			    for(int i = rows; i >= 1; --i) {
			    	
			      for(int space = 1; space <= rows - i; ++space) {
			        System.out.print("  ");
			      }
		
			      for(int j=i; j <= 2 * i - 1; ++j) {
			        System.out.print("* ");
			      }
		
			      for(int j = 0; j < i - 1; ++j) {
			        System.out.print("* ");
			      }
		
			      System.out.println();

	}
		  Scanner sc = new Scanner(System.in);
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        for (int i = 1; i <= rows; i++) 
	        {
	            for (int j = 7; j > i; j++)
	            {
	            	
	                if(j%2 == 0)
	                {
	                    System.out.print(0);
	                }
	                else
	                {
	                    System.out.print(1);
	                }
	            }
	             
	            System.out.println();
	        }

}
}
