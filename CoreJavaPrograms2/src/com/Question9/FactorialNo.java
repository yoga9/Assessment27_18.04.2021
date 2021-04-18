package com.Question9;

public class FactorialNo {

	public static void main(String[] args) {
		
		int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(num));
        System.out.println("Factorial : "+ factorial1(6));
        System.out.println("Factorial : "+ factorial2(4));
	}
	
	// method to find factorial of given number
    static int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }

    // Method to find factorial of given number
    static int factorial1(int n)
    {
        int res = 1, i;
        for (i=2; i<=n; i++)
            res *= i;
        return res;
    }
    
    static int factorial2(int n)
    {
    
      // single line to find factorial
      return (n == 1 || n == 0) ? 1 : n * factorial2(n - 1);
    
    }
}
