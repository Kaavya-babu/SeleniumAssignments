package Week3.day2;

import java.util.HashMap;
import java.util.Map;
//import java.util.Set;

public class MostDuplicateNumber {

	public static void main(String[] args) {
		String input= "abbabacaca";
		char[] charArray= input.toCharArray();
		
		Map<Character, Integer> duplicate =new HashMap<Character, Integer>();
		for (int i=0; i < charArray.length; i++) {
			if(duplicate.containsKey(charArray[i])){
				int value= duplicate.get(charArray[i]);
				duplicate.put(charArray[i], value+ 1);
				
			} else {
				duplicate.put(charArray[i], 1);
			}
			
			
		} System.out.println(duplicate);

	}

}
