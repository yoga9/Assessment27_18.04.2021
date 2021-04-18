package com.Question9;

import java.util.LinkedHashMap;

public class LinkedHashMapOccurance {

	    static void printCharWithFreq(String str, int n)
	    {
	        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<Character, Integer>();
	 
	        for (int i = 0; i < n; i++) {
	 
	            char c = str.charAt(i);
	            lhm.put(c, lhm.getOrDefault(c, 0) + 1);
	        }
	 
	        lhm.forEach(
	            (k, v) -> System.out.print("\nCharacter : " +k + " " + "Occurance :"+v));
	    }
	 
	    public static void main(String[] args)
	    {
	        String str = "LearningJava";
	        int n = str.length();
	 
	        printCharWithFreq(str, n);
	    }
	}


