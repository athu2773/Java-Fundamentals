package operator;

public class ArithmeticOperationsExample {
	
	public static void main(String[]args) {
		
		int num1 = 100;
		int num2 = 50;
		
		System.out.println("Addition : "+(num1 + num2));
		System.out.println("Substraction : "+(num1 - num2));
		System.out.println("Multulication : "+(num1 * num2));
		System.out.println("Division : "+(num1 / num2));
		System.out.println("Remainder : "+(num1 % num2));
		
		System.out.println("Post Increment : "+(num1++));
		System.out.println("Pre Increment : "+(++num1));
		
		System.out.println("Post Decrement : "+(num1--));
		System.out.println("Pre Decrement : "+(--num1));
	}
}
