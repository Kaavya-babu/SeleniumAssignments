package Week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindOccurences {

	public static void main(String[] args) {
		int num[]= {2,3,5,6,3,2,1,4,2,1,6,-1};
		Map<Integer, Integer> occ= new TreeMap<Integer, Integer>();
		
		for(int i=0; i <num.length; i++ ) {
			if(occ.containsKey(num[i])) {
				int value= occ.get(num[i]);
				occ.put(num[i], value+ 1);
			
			} else {
				occ.put(num[i], 1);
			}
		} System.out.println(occ);

	}

}
