package SCANNERCLASS;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr=new int[size];
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int n = arr.length;
		for(int j=0;j<n-1;j++)
		{
			for(int i=0;i<n-1;i++) 
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
for(int k=0;k<arr.length;k++)
{
	System.out.println(arr[k]+" ");
}
	}

}
