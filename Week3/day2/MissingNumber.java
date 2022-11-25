package Week3.day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numArray= {1, 2, 4 ,5 , 6, 8, 6, 9, 3, 9, 10 };
		
		Set<Integer> number= new TreeSet<Integer>();
		for(int i=0; i< numArray.length; i++) {
			number.add(numArray[i]);
		} System.out.println(number); //printing the set without duplicate values in ascending order
		
		Integer[] myArray = new Integer[number.size()];
	      //Converting Set object to integer array
	      int j = 0;
	      for (Integer k: number) {
	        myArray[j++] = k;
	         //Converting the Set into Array
	      }System.out.println(myArray);
	        
//	        for(int p=1;p<myArray.length; p++) {
//	        if(myArray[p-1]==myArray[p+1]) {
//	        	System.out.println("Number is present");
//	        } else {
//	        	System.out.println("The number"+ p + " is missing");
//	        }
//	        }
	  	      
	        }
	      
		}
	

	


