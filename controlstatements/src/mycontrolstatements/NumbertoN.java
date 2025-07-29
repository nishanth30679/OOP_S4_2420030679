package mycontrolstatements;

import java.util.Scanner;

public class NumbertoN {
	public static void main(String[] args) {
				// Print numbers from 1 to N.
				System.out.println("Enter number n");
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				for(int i=1; i <= n; i++) {
					System.out.println(i);
				}

			}

}
