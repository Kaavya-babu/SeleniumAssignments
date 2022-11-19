package week2.day2;


public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		
		//count of letters
		char[] letterchar= test.toCharArray();
		for(int i=0; i< letterchar.length;i++)
		{
			if(test.charAt(i) != ' ')    
                letter++;    
        } 
		for(int i=0; i< letterchar.length;i++)
		{
			if(test.charAt(i) == ' ')    
				space++;    
        } 
		String numberOnly= test.replaceAll("[^0-9]", "");
		char[] integers= numberOnly.toCharArray();
		for(int i=0; i<integers.length;i++)
		{
			if(numberOnly!="")
				num++;
		}
		String specialChars= test.replaceAll("[a-zA-Z0-9 ]", "");
		char[] special= specialChars.toCharArray();
		for(int i=0; i<special.length;i++)
		{
			if(specialChars!="")
				specialChar++;
		}
		
		
		
		System.out.println(letter);	
		System.out.println(space);
		System.out.println(num);
		System.out.println(specialChar);
		}

	}


