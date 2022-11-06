package week1.day1;

public class Mobile {
	
	String mobileBrandName= "Apple";
	char mobileLogo= 'A';
	short noOfMobilePiece= 2;
	int modelNumber= 11;
	long mobileImeiNumber= 254669646;
	float mobilePrice= 65000.65f;
	boolean isDamaged= true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Mobile mymob= new Mobile();
		System.out.println("My mobile name is "+ mymob.mobileBrandName+ " "+mymob.modelNumber );
		System.out.println("My mobile Price is "+ mymob.mobilePrice );
		System.out.println("My mobile logo and IMEI number is "+ mymob.mobileLogo + " "+ mymob.mobileImeiNumber );
		System.out.println("Is my mobile damaged? =  "+ mymob.isDamaged );
	}

}
