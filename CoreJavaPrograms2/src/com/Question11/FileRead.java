package com.Question11;

import java.io.File;

public class FileRead {

	public static void main(String[] args) {
		
        File f = new File("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021\\Hello.txt");
 
        if (f.canRead()) {
            System.out.println("Can be Read");
        }
        
        else {
            System.out.println("Cannot be Read");
        }
	}

}
