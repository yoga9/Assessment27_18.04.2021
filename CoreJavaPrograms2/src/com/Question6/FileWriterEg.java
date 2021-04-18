package com.Question6;

import java.io.FileWriter;

public class FileWriterEg {

	public static void main(String[] args) {
		  try {    
	           FileWriter fw=new FileWriter("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021\\Hello.txt"); 
	           
	           fw.write("Welcome to Java Program");    
	           fw.close(); 
	           
	           System.out.println("File Written Successfully");    
	          }
		  catch(Exception e)
		  {
			  System.out.println("An error Occured");
		 }    
	         

	}

}
