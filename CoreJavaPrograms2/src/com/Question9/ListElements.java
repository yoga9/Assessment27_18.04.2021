package com.Question9;

import java.util.ArrayList;

public class ListElements {
	
	public static void main(String[] args) {
		
        ArrayList<Integer> list = new ArrayList<Integer>(5);
  
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
  
        System.out.print("ArrayList: " + list);
  
        int first = list.get(0);
        int last = list.get(list.size() - 1);
  
        System.out.println("\nFirst Element : " + first  + ", Last Element : " + last);
	}
}
