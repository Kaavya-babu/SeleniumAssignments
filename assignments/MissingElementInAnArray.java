package Week1.assignments;

//import java.util.Arrays;


public class MissingElementInAnArray {
	
	public static int getMissingNo (int a[], int n)
    {
        int i, total;
     	total  = (n + 1) * (n + 2) / 2;
     	for ( i = 0; i < n; i++)
     	total -= a[i];
     	return total;
    }
    public static void main(String[] args)
    {
      	int a[ ] = {1,5,3,4,7,6,8};
      	int miss = getMissingNo(a, 6);
      	System.out.println("The number missing is :"+miss);
    }
}


