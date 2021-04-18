package com.Question6;

//import java.io.*;
import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) {
		
		try {
			File obj = new File("C:\\Users\\yogv2c18463\\eclipse-workspace\\Assessment27 - 17.04.2021\\Hello1.txt");
			if(obj.createNewFile()) {
				System.out.println("File created : " +obj.getName());
			}
			else {
				System.out.println("File already exist");
			}
		}
		catch(IOException e)
		{
			System.out.println("An error Occured");
			e.printStackTrace();
		}

	}

}
