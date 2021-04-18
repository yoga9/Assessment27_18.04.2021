package com.Question11;

import java.io.File;

public class FileDirectory {

	public static void main(String[] args) {
		
		File f = null;
	      String path;
	      boolean bool = false;
	      
	      try {
	         
	         f = new File("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021");
	         bool = f.isDirectory();
	         path = f.getPath();
	         System.out.println(path+" is directory? "+ bool);
	      }
	      
	     catch(Exception e) {
	          e.printStackTrace();
	       }
	      
	        File f1 = new File("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021");
	  
	        if (f1.isDirectory()) {
	        	
	            System.out.println("Directory");
	        }
	        else {
	        
	            System.out.println("is not Directory");
	        }

	}

}
