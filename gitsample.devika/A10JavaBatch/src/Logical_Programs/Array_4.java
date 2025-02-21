package Logical_Programs;

public class Array_4 {
	public static void main(String[] args) {
		int []arr= {10,21,30,41};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==1)
			{
			count++;
			}
		}
		System.out.println(count);
	}	

}
