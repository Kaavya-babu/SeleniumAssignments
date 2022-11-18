package Week2.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
     String text1="stops";
     String text2="potss";
     if(text1.length()==text2.length())
     {
    	 char[] chars1= text1.toCharArray();
    	 char[] chars2= text1.toCharArray();
    	 Arrays.sort(chars1);
    	 Arrays.sort(chars2);
    	 boolean result = Arrays.equals(chars1, chars2);

    	 if(result)
    	 {
    		 System.out.println("Anagram");
    	 } 
    	 else System.out.println("Not an anagram");
    	 
     } else System.out.println("Both Strings are not equal");
	}

}
