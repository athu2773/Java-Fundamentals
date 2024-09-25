package Basic;

public class TypeCastingExample {
	
	public static void main(String[]args) {
		
		//WIDENING
		
		int intValue= 100;
		
		//Implicit Type casting from int to long
		long longValue = intValue;
		
		//Implicit Type Casting from long to double
		double doubleValue=longValue;
		
		System.out.println(intValue);
		System.out.println(longValue);
		System.out.println(doubleValue);
		
		//NARROWING
		
		double doubleValue1=100.894;
		
		//Explicit Type casting from double to long
		long longValue1=(long) doubleValue1;
		
		//Explicit Type Casting from long to int
		int intValue1=(int) longValue1;
		
		System.out.println(doubleValue1);
		System.out.println(longValue1);
		System.out.println(intValue1);
	}
}
