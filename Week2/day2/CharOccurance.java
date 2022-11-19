package week2.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
		int value= 0;
		char occ= 'n';
		char[] characters= str.toCharArray();
		for(int i=0;i<characters.length;i++)
		{
			if(characters[i]==occ)
			{
				value++;
			}
		}
System.out.println("The Count of occurence of "+ occ+ "is "+ value);
	}

}
