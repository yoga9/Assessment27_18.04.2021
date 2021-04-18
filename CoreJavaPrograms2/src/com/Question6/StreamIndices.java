package com.Question6;

import java.util.stream.IntStream;

public class StreamIndices {

	public static void main(String[] args) {
		
		 String[] array = { "V", "E", "E", "T", "E", "C", "H" };
		  
	        IntStream
	  
	            // Get the Stream from the array
	            .range(0, array.length)
	  
	            // Map each elements of the stream
	            // with an index associated with it
	            .mapToObj(index -> String.format("%d -> %s", index, array[index]))
	  
	            // Print the elements with indices
	            .forEach(System.out::println);
	}

}
