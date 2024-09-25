package Basic;

import java.awt.Point;
import java.util.Date;

public class VariableAndDataTypesExample {
		public static void main(String[]args) {
		
		//primitive data types
		
		byte age=23;
		long viewsCount=1_23_234_675;
		
		// here i always need to put the F in front of the float or else it shows that the compilation error
		float price= (float) 126.67; 
		
		// here i always need to put the single word of alphabet in single quote or else it shows that the compilation error
		char gender = 'M';
		boolean isValue = true;
		System.out.println(isValue);
		System.out.println(age);
		System.out.println(viewsCount);
		System.out.println(gender);
		System.out.println(price);
		
		
		//Non - primitive Data Type 
		
		String name  = "Atharva Sawant";
		System.out.println(name);
		
		Date now = new Date();
		System.out.println(now);
		
		Point point1 = new Point(10,20);
		Point point2 = point1;
		System.out.println(point1.x+":"+point1.y);
		System.out.println(point2.x+":"+point2.y);
		
		point1.y=25;
		System.out.println(point1.x+":"+point1.y);
		System.out.println(point2.x+":"+point2.y);
	}
}