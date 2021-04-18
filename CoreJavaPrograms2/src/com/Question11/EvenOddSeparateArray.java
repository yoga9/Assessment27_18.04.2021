package com.Question11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EvenOddSeparateArray {

	public static void main(String[] args) {
		

	    List<Integer> lst = Arrays.asList(1,2,3,4,5); 

	    Predicate<Integer> evenFunc = (a) -> a%2 == 0;
	    Predicate<Integer> oddFunc = evenFunc.negate();

	    List<Integer> even = lst.stream().filter(evenFunc).collect(Collectors.toList());
	    List<Integer> odd = lst.stream().filter(oddFunc).collect(Collectors.toList());

	    System.out.println("The Even List : "+even);
	    System.out.println("The Odd List : "+odd);
	   
	 
	  }

	}


