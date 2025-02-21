package Logical_Programs;

public class Array_3 {
	public static void main(String[] args) {
		int []arr= {10,21,30,41};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	}	

}
