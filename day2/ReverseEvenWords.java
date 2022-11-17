package Week2.day2;

import java.util.Arrays;
import java.util.Iterator;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test="I am a software tester";
		String[] words= test.split(" ");
		System.out.println(Arrays.toString(words));
		
		for(int i=1; i< words.length; i=i+2)
		{
			System.out.println(words[i]);
			
			
		}

	}

}
