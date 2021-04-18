package com.Question9;

import java.util.Collections;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTraverse {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector<String>();
		
		names.add("Sara");
		names.add("Moni");
		names.add("Sugan");
		names.add("Anu");
		names.add("Nisha");
		names.add("Zara");
		
		System.out.println("Before Reversing");
		names.forEach(n -> System.out.println(n));
		
		System.out.println("----");
		
		Collections.reverse(names);
		System.out.println("After Reversing");
		names.forEach(n -> System.out.println(n));
		
       for (int index = names.size() - 1; index >= 0; index--) {
    	   
           System.out.println(names.get(index));
        }
        ListIterator<String> listIterator  = names.listIterator(names.size());
  
        while (listIterator.hasPrevious()) {
        	
            System.out.println(listIterator.previous());
	}
	}
}


