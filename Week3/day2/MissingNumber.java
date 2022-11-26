package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		
        int[] numArray= {1, 2, 4 ,5 , 6, 8, 6, 9, 3, 9, 10 };
        int missing=1;
		
		Set<Integer> number= new TreeSet<Integer>();
		for(int i=0; i< numArray.length; i++) {
			number.add(numArray[i]);
		} System.out.println(number); //printing the set without duplicate values in ascending order
		
		for(Integer missingNumber: number) {
			if(missingNumber!=missing++) {
				System.out.println(missing-1+" is the missing number");
				break;
			}
		}
		
		  
		
	} 

}
