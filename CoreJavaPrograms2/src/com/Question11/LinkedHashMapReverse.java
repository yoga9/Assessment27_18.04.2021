package com.Question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LinkedHashMapReverse {

	public static void main(String[] args) {
		
		 LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
	        
	        lhmap.put(1, "One");
	        lhmap.put(2, "Two");
	        lhmap.put(3, "Three");
	        lhmap.put(4, "Four");
	        lhmap.put(5, "Five");
	        
	        Set<Integer> setKeys = lhmap.keySet();
	        
	        LinkedList<Integer> listKeys = new LinkedList<Integer>(setKeys);
	        
	        Iterator<Integer> iterator = listKeys.descendingIterator();
	        
	        while(iterator.hasNext()) {
	        	//System.out.println( lhmap.get( iterator.next() ) );
	            Integer key = iterator.next();
	            System.out.println("Key : " + key + "\t" + "Value : " + lhmap.get(key));
	        }
	        
	        
	        // Reverse of Insertion Order iterating
	        System.out.println("\nReverse of Insertion Order:\n");
	 
	        List<Integer> alKeys = new ArrayList<Integer>(lhmap.keySet());
	 
	        Collections.reverse(alKeys);
	 
	        for(Integer strKey : alKeys){
	            System.out.println("Key : "  + strKey + "\t" + "Value : "  + lhmap.get(strKey));
	        }

	}

}
