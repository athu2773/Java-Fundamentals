package operator;

public class ArithmeticAssingmentOperationsExample {
	
	public static void main(String[]args) {
		
		int num1 = 10;
		int num2 = 20;
		int num3;
		
		
		num3=num1;
		
		System.out.println("num3 = num1 :"+num3);
		
		
		num1 += num2;
		System.out.println("num1 += num2 : "+num1);
		
		num1 -= num2;
		System.out.println("num1 -= num2 : "+num1);
		
		num1 *= num2;
		System.out.println("num1 *= num2 : "+num1);
		
		num1 /= num2;
		System.out.println("num1 /= num2 : "+num1);
		
		num1 %= num2;
		System.out.println("num1 %= num2 : "+num1);
	}

}
