package com.Question6;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEg {

	public static void main(String[] args) throws Exception {
		
		FileReader fr=new FileReader("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021\\Hello.txt");    
        BufferedReader br=new BufferedReader(fr);    

        int i;    
        while((i=br.read())!=-1){  
        System.out.print((char)i);  
        }  
        br.close();    
        fr.close(); 

	}

}
