package com.Question6;

import java.io.*;
import java.io.FileWriter;

public class BufferedWriterEg {
	
	public static void main(String[] args) throws Exception {  
		
	    FileWriter writer = new FileWriter("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021\\Hello.txt"); 
	    
	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Hello World"); 
	    
	    buffer.close();  
	    System.out.println("Successfully File Written");  
	    }  
}
