package mycontrolstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
				// Print the multiplication table for a given number.
				System.out.println("Enter a number");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				
				for(int i=1;i<=10;i++)
				System.out.println(num+ " x "+i+" = "+(num*i));
				

			}


}
