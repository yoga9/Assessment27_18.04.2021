package com.Question11;

public class CheckLetterInString {

	public static void main(String[] args) {
		
		String a = "Umbrella";
		boolean per = false;
		
		for(int i = 0; i < a.length(); i++)
		{
		   if(a.charAt(i) == 'e')
		{
		    per=true;
		    break;
		}
		   }
		System.out.println("The character is present : "+per);
	
	String s1 = "Umbrella";
	System.out.println("The character is present : "+s1.contains("e"));

}
}
