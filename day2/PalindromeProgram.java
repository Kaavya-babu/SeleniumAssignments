package Week2.day2;

public class PalindromeProgram {

	public static void main(String[] args) {
		String pal= "madam", rev="";
		
		for (int i= pal.length()-1; i>=0; i--)
		{
			rev= rev+ pal.charAt(i);
		}
		if (rev.equalsIgnoreCase(pal))
		{
			System.out.println(pal+" is in palindrome");
		}
		else System.out.println("It is not in palindrome");
	}

}
