package com.Question6;

public class StarSquarePattern {

	public static void main(String[] args) {

		 {
			    System.out.println("Function to print hollow Square");
		        int rows = 6, columns = 6;
		        print_square(rows, columns);
		    }
	}
	  
	    static void print_square(int n, int m)
	    {
	        int i, j;
	        
	        for (i = 1; i <= n; i++)
	        {
	            for (j = 1; j <= m; j++)
	            {
	                if (i == 1 || i == n || j == 1 || j == m)           
	                    System.out.print("*");           
	                else
	                    System.out.print(" ");           
	            }
	            System.out.println();
	        }
	      
	    }
}
