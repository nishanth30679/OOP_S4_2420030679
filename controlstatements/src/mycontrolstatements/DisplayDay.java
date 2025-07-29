package mycontrolstatements;

import java.util.Scanner;

public class DisplayDay {

	public static void main(String[] args) {
				// Display day name based on number (1–7).
		      System.out.println("Enter a number from 1-7");
		      Scanner sc = new Scanner(System.in);
		      int num = sc.nextInt();
		      
		      if(num==1)
		    	  System.out.println("Sunday");
		      else if(num==2)
		    	  System.out.println("Monday");
		      else if(num==3)
		    	  System.out.println("Tueday");
		      else if(num==4)
		    	  System.out.println("Wednesday");
		      else if(num==5)
		    	  System.out.println("Thursday");
		      else if(num==6)
		    	  System.out.println("Friday");
		      else if(num==7)
		    	  System.out.println("Saturday");
		      else 
		    	  System.out.println("Number not accepted");
		      
		      
			}

}
