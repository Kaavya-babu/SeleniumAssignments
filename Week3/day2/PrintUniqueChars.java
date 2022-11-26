package Week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueChars {

	public static void main(String[] args) {
		String myName = "Kavya";
		char[] charArray = myName.toCharArray();
		Set<Character> uniqueChar = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++)  {
			boolean add = uniqueChar.add(charArray[i]);
			if(!add)
			{
				uniqueChar.contains(charArray[i]);
				uniqueChar.remove(charArray[i]);
			}
			else
			{
				uniqueChar.add(charArray[i]);
			}

		}
		System.out.println("The Unique Chrarcter of the myName String is: " + uniqueChar);

	}

	}


