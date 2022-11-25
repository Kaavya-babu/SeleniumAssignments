package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateValues {

	public static void main(String[] args) {		
		String companyName= "google";
		char[] charArray= companyName.toCharArray();
		
		Set<Character> uniqueName= new LinkedHashSet<Character>();
		
		for(int i=0; i<charArray.length;i++)
		{
			uniqueName.add(charArray[i]);
		}
System.out.println(uniqueName);
	}

}
