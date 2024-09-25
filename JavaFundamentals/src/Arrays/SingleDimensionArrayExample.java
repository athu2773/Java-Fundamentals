package Arrays;

public class SingleDimensionArrayExample {
	
	public static void main(String[]args) {
//		
//		//declaring an array
//		int[] marks; //writing it seperate
//		marks= new int[5];	
//		
//		//combining the above statement
//		int[] marks1 = new int[5];
//		
//		//Initializing an array
//		
//		int[] marks2 = new int[] {10,20,30,40,50}; // here we can skip the size because we are allocating the value
//		
//		//Declare and assign 
		
		int[] marks3 = new int[5];
		marks3[0]=100;
		marks3[1]=200;
		marks3[2]=300;
		marks3[3]=400;
		marks3[4]=500;
		
		for (int i = 0; i < marks3.length; i++) {
			System.out.println(marks3[i]);
			
		} 
		System.out.println("*****************");
		
		for(int value : marks3) {
			System.out.println(value);
		}
	}

}
