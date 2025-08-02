package MyArrays;
import java.util.Arrays;
import java.util.Scanner;
public class ReadfromSystem {

	public static void main(String[] args) {
		//program to read elements and print them on console
				System.out.println("Enter Array size");
				Scanner sc=new Scanner(System.in);
				int a=sc.nextInt();
				System.out.println("Enter numbers");
				int b[]=new int[a];
				for(int i=0;i<a;i++)
				{
					 b[i]=sc.nextInt();
				}
				System.out.println(Arrays.toString(b));

	
	}

}
