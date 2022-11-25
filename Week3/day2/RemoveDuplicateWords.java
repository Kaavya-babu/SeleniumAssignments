package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] textSplitted= text.split(" ");
		Set<String> duplicates= new LinkedHashSet<String>();
		
		for(int i=0; i<textSplitted.length; i++)
		{
			duplicates.add(textSplitted[i]);
			
		} System.out.println(String.join(" ", duplicates));
		
	}

}
