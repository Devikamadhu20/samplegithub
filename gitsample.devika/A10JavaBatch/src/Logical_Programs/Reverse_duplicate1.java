package Logical_Programs;

public class Reverse_duplicate1 {

	public static void main(String[] args) 
	{
		char []arr= {'A','B','C','A','B'};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					arr[j]='Z';
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k]!='Z')
			{
				System.out.print(arr[k]+" ");
				
			}
			
		}
		}
		
	}


