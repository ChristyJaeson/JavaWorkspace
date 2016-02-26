package SID13025.Lab0;

import java.util.Random;

public class SmallestLargestRandom {
	public static void main(String args[])
	{
		int a[][]= new int[10][10];
		Random R= new Random(); 
		for (int i = 0; i <10; i++) 
		{
			for(int j=0;j<10;j++)
			{
				a[i][j]=R.nextInt(100);
				
			}
		}
		
		int small,large;
		small=large=a[0][0];
		System.out.println("Array:");
		for (int i = 0; i <10; i++) 
		{
			for(int j=0;j<10;j++)
			{
				if (a[i][j]<small)
					small=a[i][j];
				if (a[i][j]>large)
					large=a[i][j];
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println("smallest number :"+small+"\nLargest number :"+large);
		
		
		
	}


}
