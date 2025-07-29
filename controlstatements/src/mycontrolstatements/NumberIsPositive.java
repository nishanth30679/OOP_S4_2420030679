package mycontrolstatements;

import java.util.Scanner;

public class NumberIsPositive {

	public static void main(String[] args) {
				// Check if a number is positive.
		        System.out.println("Enter a number");
		        Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
		        if(a > 0)
		        	System.out.println("The number is Positive");
		        else if(a < 0)
		        	System.out.println("The number is negative");
		        else
		        	System.out.println("Zero");
	}

}
