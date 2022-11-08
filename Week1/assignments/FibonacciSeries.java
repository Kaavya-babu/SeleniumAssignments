package Week1.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		int count= 8, num1=0, num2=1, num3;
		System.out.println("The fibonacci series of "+count+ " is");
		
		for (int i =1; i < count; i++) {
			System.out.print(num1+" ");
			num3= num1+ num2;
			num1= num2;
			num2= num3;
			
		}

	}

}
