package com.Question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListForForeachLoop {

	public static void main(String[] args) {
		
		    ArrayList<String> colorsName = new ArrayList<String>();
		    colorsName.add("Violet");
		    colorsName.add("Pink");
		    colorsName.add("White");
		    colorsName.add("Black");
		    
		    System.out.println("Using For Loop");
		    for (int i = 0; i < colorsName.size(); i++) {
		      System.out.println(colorsName.get(i));
		    }
		    
		    System.out.println("-----");
		  
		    List<String> Vehicle = Arrays.asList("Bicycle", "Truck", "Bike", "Cab", "Bus", "Car", "Train", "Airplane");
			
			System.out.println("The list are "+Vehicle);
			
		    Collections.sort(Vehicle);
		    
			System.out.println("Using ForEach Loop");
		    Vehicle.forEach(a -> System.out.println(a));
		
		
	}
	}


