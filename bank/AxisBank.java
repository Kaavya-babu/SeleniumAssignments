package bank;

public class AxisBank extends BankInfo {
//Assignment 3
	public void deposit()
	{
		System.out.println("Axis Bank deposit");
	}
	public static void main(String[] args) {
		AxisBank ab= new AxisBank();
		ab.deposit();
		ab.fixed();
		ab.saving();
	}

}
