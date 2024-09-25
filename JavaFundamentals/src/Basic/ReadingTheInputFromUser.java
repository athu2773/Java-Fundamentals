package Basic;

import java.util.Scanner;

public class ReadingTheInputFromUser {
	
	public static void main(String[]args) {
		
		//Declaring the Scanner method
		Scanner scanner1 = new Scanner(System.in);
		
		//Entering the name 
		System.out.println("Enter Your Name : ");
		String name = scanner1.nextLine();
		
		//Entering age
		System.out.println("Enter Your age : ");
		int age = scanner1.nextInt();
		
		//Entering the Gender
		System.out.println("Enter the Gender : ");
		char gender=scanner1.next().charAt(0); // here nextline will show error
		
		//Entering the contact 
		System.out.println("Entering the Contact Number : ");
		double contact =scanner1.nextDouble();
		
		
		System.out.println("User Details");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
		System.out.println("Conatct : "+contact);
	}
}
