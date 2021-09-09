
public class HeightConverter {
	public static void main(String[] args) {
		double conversionFactor= 2.54;
		String myName= "Sage Silberman";
		int myAge= 16;
		int myHeightInches= 64;
		double myHeightCM= conversionFactor*myHeightInches;
		System.out.println(myName);
		System.out.println("age: " +myAge);
		System.out.println("height: " +myHeightInches+ " inches");
		System.out.println("height: " +myHeightCM + " centimeters");
	}
	
}
