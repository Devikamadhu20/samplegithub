package Scanner_class;

import java.util.Scanner;

public class Array_declaration_intialisation {

	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
        	System.out.println(arr[j]+" ");
        }

	}

}
