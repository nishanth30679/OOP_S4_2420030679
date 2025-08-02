package MyArrays;
import java.util.Scanner;
public class SearchAmongelements {

	public static void main(String[] args) {
		//program to search for an element among given elements
				System.out.println("enter the size of the array");
				Scanner sc =new Scanner(System.in);
				int a = sc.nextInt();
				System.out.println("Enter Elements");
				int arr[]=new int[a];
				for(int i=0;i<a;i++)
				{
					arr[i]=sc.nextInt();
				}
				System.out.println("Enter element to be searched");
				int c=sc.nextInt();
				int found =0;
				for(int i=0;i<a;i++)
				{
					if(arr[i]==c)
					{
						System.out.println("Element is found at the index "+i);
						found=1;
					}
						
				}
				if(found==0)
				{
					System.out.println("Element not found");
				}
				


	}

}
