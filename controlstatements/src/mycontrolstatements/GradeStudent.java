package mycontrolstatements;

import java.util.Scanner;

public class GradeStudent {

	public static void main(String[] args) {
				// Grade a student based on marks.
		        System.out.println("Enter student marks");
		        Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
		        
		        if((a<100) && (a>90))
		        	System.out.println("O Grade, Passed");
		        else if((a<89) && (a>80))
		        	System.out.println("A Grade, Passed");
		        else if((a<79) && (a>70))
		        	System.out.println("B Grade, Passed");
		        else if((a<69) && (a>60))
		        	System.out.println("C Grade, Passed");
		        else if((a<59) && (a>50))
		        	System.out.println("D Grade, Passed");
		        else 
		        	System.out.println("F Grade, Fail");

	}

}
