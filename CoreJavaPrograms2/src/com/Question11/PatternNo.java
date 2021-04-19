package com.Question11;

public class PatternNo {

	public static void main(String[] args) {
		
		int i, j, k;
		
		for (i = 4; i >= 1; i--) {
			
			for (j = 7; j > i; j--) {
				
				System.out.print(" ");
			}
			
			for (k = 1; k < (i * 2); k++) {
				
				if (k % 2 == 1) {
					
					System.out.print("1");
					
				} else {
					
					System.out.print("0");
				}
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		
		
		
		
//				int rows = 4;
//		
//			    for(int i = rows; i >= 1; --i) {
//			    	
//			      for(int space = 1; space <= rows - i; ++space) {
//			        System.out.print("  ");
//			      }
//		
//			      for(int j=i; j <= 2 * i - 1; ++j) {
//			        System.out.print("* ");
//			      }
//		
//			      for(int j = 0; j < i - 1; ++j) {
//			        System.out.print("* ");
//			      }
//		
//			      System.out.println();

//	}
		 
	         
	        

}
}
