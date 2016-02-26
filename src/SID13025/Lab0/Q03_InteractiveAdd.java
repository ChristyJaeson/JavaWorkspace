package SID13025.Lab0;

import java.io.IOException;
import java.util.Scanner;

public class Q03_InteractiveAdd {
	public static void main(String args[]) throws IOException
	{
		
		Scanner scanner= new Scanner(System.in);
		int count,sum;
		System.out.println("How many numbers to enter?");
		count = scanner.nextInt();
		//System.out.println(count);
		
		sum=0;	
		for(int i=0;i<count;i++)
			
		{
			System.out.println("Please enter a number?");
			sum+=scanner.nextInt();
			//System.out.println(sum);
		}
		System.out.println("sum="+sum);
	}

}
