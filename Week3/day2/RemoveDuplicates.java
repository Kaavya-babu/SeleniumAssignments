package Week3.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String word= "We learn java basics as part of java sessions in java week1";
		int count=0;
		String[] strArray= word.split(" ");
		for(int i=0; i<strArray.length; i++) {
			for(int j=0; j< i; j++) {
				strArray[i].contains(word);
				System.out.println(strArray[i]);
			}
				
				
		
		
		}
	
	}

}
