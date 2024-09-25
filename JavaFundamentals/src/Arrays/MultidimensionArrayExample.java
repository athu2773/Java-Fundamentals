package Arrays;

public class MultidimensionArrayExample {
	
	public static void main(String[]args) {
		
		int marks[][]= {
				{10,20,30,40,50},
				{60,70,80,90,100},
				{110,120,130,140,150}
		};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				System.out.println(marks[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
