package Logical_Programs;

public class Array_5 {
	public static void main(String[] args) {
		int []arr= {10,21,30,41};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
			count++;
			}
		}
		System.out.println(count);
	}	


}
