package mypackage;

import java.util.*;

public class arthematicoperations {

	public static void main(String[] args) {
		//  Perform addition, subtraction, multiplication, division, and modulus of two numbers.
     System.out.println("enter the two inputs");
	 Scanner ts= new Scanner(System.in);
     int num1 = ts.nextInt();
     int num2 = ts.nextInt();
     int sum = num1+num2;
     int sub = num1-num2;
     int mul = num1*num2;
     int div = num1/num2;
     int mod = num1%num2;
     System.out.println("addition = "+sum);
     System.out.println("subtraction = "+sub);
     System.out.println("multiplication = "+mul);
     System.out.println("division = "+div);
     System.out.println("modulus  = "+mod);
    
	}

}
