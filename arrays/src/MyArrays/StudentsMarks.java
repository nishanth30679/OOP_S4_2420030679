package MyArrays;
import java.util.Scanner;
public class StudentsMarks {

	public static void main(String[] args) {
		//program to take student's six subject's marks and print the subject marks, total, average.
				Scanner sc= new Scanner(System.in);
				int arr[] =new int[6];
				System.out.println("enter student marks");
				for(int i=0;i<6;i++)
				{
					arr[i]=sc.nextInt();
				}
				int total=0;
				for(int i=0;i<6;i++)
				{
					total+=arr[i];
				}
				int avarage=total/6;
				for(int i=0;i<6;i++)
				{
					System.out.println("subject "+ i+" marks is  "+arr[i]);
				}
				System.out.println("total of the students is "+total);
				System.out.println("Average marks of the student is "+avarage);
				
				
	}

}
