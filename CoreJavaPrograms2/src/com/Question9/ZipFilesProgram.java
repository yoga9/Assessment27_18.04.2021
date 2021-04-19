package com.Question9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipFilesProgram {

	public static void main(String[] args) {
		
		// creating object of the file.
					ZipFilesProgram file = new  ZipFilesProgram();
					System.out.println("Files in the Zip are : ");

					// enter the path of the zip file with name.
					file.printFileList("C:\\Users\\yogv2c18463\\Desktop\\YogiVeeTech.zip");
				}
			

		public void printFileList(String filePath)
		{
			// initializing the objects.
			ZipEntry zEntry = null;
			try 
			{
				FileInputStream	fis = new FileInputStream(filePath);
				ZipInputStream	Zis = new ZipInputStream(new BufferedInputStream(fis));

				// this will search the files while end of the zip.
				while((zEntry = Zis.getNextEntry()) != null)
				{
					System.out.println(zEntry.getName());
				}
				Zis.close();
			} 
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		
		
}
