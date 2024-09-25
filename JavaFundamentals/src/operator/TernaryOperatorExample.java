package operator;

public class TernaryOperatorExample {
	
	public static void main(String[]args) {
		boolean Authenticated = true;
		
		//If -Else statement 
		
		if(Authenticated)
			System.out.println("The user is sucessfully logged in ");
		else
			System.out.println("The is not logged in ");
		
		//ternary operator
		
		String result= (Authenticated)?"Logged in " : "Not logged in"; // here we dont use the if else statement
		System.out.println(result);
	}
}
