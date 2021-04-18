package com.Question9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ListToStream {
		
	    private static <T> Stream<T> convertListToStream(List<T> list)
	    {
	        return list.stream();
	    }
	  
	    public static void main(String args[])
	    {
	  
	        List<String> PersonDetails = Arrays.asList("Name", "DOB", "Address", "ContactNo");
	  
	        System.out.println("List: " + PersonDetails);
	  
	        Stream<String> stream = convertListToStream(PersonDetails);
	  
	        System.out.println("Stream from List: " + Arrays.toString(stream.toArray()));
	        
	        List<String> nameList = Arrays.asList("Sara", "Janu", "Yalini", "Karunya");
	        
	        nameList.stream();
	        nameList.forEach(a -> System.out.println(a));
	        
	}
}
