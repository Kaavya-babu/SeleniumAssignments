package Week1.assignments;

public class ConvertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int number = -45;
		if (number < 0) {
			System.out.println("The entered number is Negative");
		}
		number = number * -1;
		System.out.println("The changed Positive number is = " + number);
	}

}
