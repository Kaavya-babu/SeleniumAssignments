package Week3.day2;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueValues {

	public static void main(String[] args) {
		String myName = "Kaavya";
		char[] uniqueArray = myName.toCharArray();
		Set<Character> uniqueValue = new LinkedHashSet<Character>();
		for (int i = 0; i < uniqueArray.length; i++)  {
			 uniqueValue.add(uniqueArray[i]);
//			if(!add)
//			{
//				uniqueValue.contains(uniqueArray[i]);
//				uniqueValue.remove(uniqueArray[i]);
//			}
//			else
//			{
//				uniqueValue.add(uniqueArray[i]);
//			}

		}
		System.out.println("The Unique Chrarcter of the myName String is: " + uniqueValue);
	}

}
