package MyArrays;
import java.util.Scanner;
public class DuplicateElements {

	public static void main(String[] args) {
		//program to remove duplicate elements and print the unique elements
				System.out.println("Enter Array size");
				Scanner sc =new Scanner(System.in);
				int n=sc.nextInt();
				System.out.println("Enter Elements");
				int arr[]=new int[n];
				for(int i=0;i<n;i++)
				{
				arr[i]=sc.nextInt();
				}
				
				for(int i=0;i<n;i++) {
				boolean dublicate= false	;
				for(int j=0;j<i;j++)
				{
					if(arr[i]==arr[j])
					{
						dublicate=true;
						break;
					}
				}
				if(!dublicate)
				{
					System.out.print(arr[i ]);
				}
				
				}
	}


}

