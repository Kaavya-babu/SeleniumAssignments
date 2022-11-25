package Week3.day2;

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class SecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> findLargest= new TreeSet<Integer>();
		
		for(int i=0; i<data.length; i++) {
			findLargest.add(data[i]);
		}
		List<Integer> largestNumber= new  ArrayList<Integer>(findLargest);
		Collections.sort(largestNumber);
		System.out.println("The Second Largest Num is : " + largestNumber.get(largestNumber.size()-2));

	}

}
