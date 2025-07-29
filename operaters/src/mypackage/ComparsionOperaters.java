package mypackage;

import java.util.*;

public class ComparsionOperaters {

	public static void main(String[] args) {
		// Compare two integers and display which one is greater or if they are equal.
		System.out.println("enter the  numbers");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(a+"is Greater ");
		}
		else if(a==b) {
			System.out.println("Both number  are equal");
			
		}
		else {
			System.out.println(b+"is greater");
		}

	}

}
