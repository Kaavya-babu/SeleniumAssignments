package Week3.day2;

import java.util.HashSet;
import java.util.Set;

public class UniqueChar {

	public static void main(String[] args) {
		String myName = "Kavitha";
		char[] charArray = myName.toCharArray();
		Set<Character> uniqueChar = new HashSet<Character>();
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
