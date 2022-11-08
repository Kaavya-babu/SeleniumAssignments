package Week1.assignments;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {

		int data[] = {3,2,11,4,6,7};
		int size= data.length;
	    Arrays.sort(data);
	    int result = data[size-2];
	    System.out.println("The Second Largest number is :"+result);

	}

}
