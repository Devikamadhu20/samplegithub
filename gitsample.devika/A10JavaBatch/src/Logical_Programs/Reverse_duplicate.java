package Logical_Programs;

public class Reverse_duplicate {

	public static void main(String[] args) 
	{
	int []arr= {10,20,10,30,20,40};
	for(int i=0;i<arr.length;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				arr[j]=0;
			}
		}
	}
	for(int k=0;k<arr.length;k++)
	{
		if(arr[k]!=0)
		{
			System.out.print(arr[k]+" ");
			
		}
		
	}
	}

}
