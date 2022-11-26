package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesPaypal {

	public static void main(String[] args) {
		String wordU= "Paypal India";
		String WordS= wordU.replaceAll("\\s", "");
		String word =WordS.toLowerCase();
		char[] wordArray= word.toCharArray();
		Set<Character> charSet= new LinkedHashSet<Character>();
		Set<Character> dupCharSet= new LinkedHashSet<Character>();
		for(int i=0; i< wordArray.length;i++)
		{
			boolean add =charSet.add(wordArray[i]);
			if (!add)
			{
				charSet.contains(wordArray[i]);
				dupCharSet.add(wordArray[i]);
			}
			
		} //System.out.println(dupCharSet);
		charSet.removeAll(dupCharSet);
		System.out.println(charSet);
		
		
	}

}
