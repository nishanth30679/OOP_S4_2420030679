package mycontrolstatements;

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		//Check if a number is even or odd.
				System.out.println("Enter a Number");
				Scanner sc = new Scanner(System.in);
				int a = sc.nextInt();
				
				if(a % 2 == 0)
					System.out.println("The number is even");
				else
					System.out.println("The number is odd");

			}

}
