package MyArrays;
import java.util.Scanner;
public class SmallestandLargest {

	public static void main(String[] args) {
		// program to display smallest and largest element the array of elements
				Scanner sc =new Scanner(System.in);
				System.out.println("Enter size of Array");
				int a= sc.nextInt();
				int arr[]=new int[a];
				for(int i=0;i<a;i++)
				{
					arr[i]=sc.nextInt();
				}
				int temp=arr[0];
				for(int j=0;j<a;j++)
				{
					if(temp<arr[j])
						temp=arr[j];
				}
				System.out.println("Greatest number of array is:"+temp);
				int temp1=arr[0];
				for(int j=1;j<a;j++)
				{
					if(temp1>arr[j])
						temp1=arr[j];
				}
				System.out.println("Smallest number of array is:"+temp1);
	}

}
