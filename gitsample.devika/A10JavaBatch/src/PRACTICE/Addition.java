package PRACTICE;
import java.util.Scanner;
public class Addition 
{
	public static void main(String[] args)
	{
		
	 Scanner sc =new Scanner(System.in);
	 System.out.println("Enter the value");
	 int size=sc.nextInt();
	 String[] arr=new String[size];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=sc.next();	
		 }
	 for(int j=0;j<arr.length;j++)
	 {
		 System.out.println(arr[j]);
		 
		 
	 }
	}

}
