package week1.day1;

public class TwoWheeler {
	
	int noOfWheels= 2;
	short noOfMirrors= 2;
	long chasisNumber= 5678;
	boolean isPunctured= false;
	String bikeName= "Contiental GT";
	double runningKm= 6789;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler myBike= new TwoWheeler();
		System.out.println("My bike has "+ myBike.noOfWheels + " wheels");
		System.out.println("My bike has "+ myBike.noOfMirrors + " mirrors");
		System.out.println("My bike's number is "+ myBike.chasisNumber);
		System.out.println("My bike is puctured?= "+ myBike.isPunctured );
		System.out.println("My bike name is "+ myBike.bikeName);
		System.out.println("My bike has ran "+ myBike.runningKm + " KMS");

		
		
		

	}

}
