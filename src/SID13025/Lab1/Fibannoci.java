package SID13025.Lab1;

import java.util.Scanner;

public class Fibannoci {

	public static void main(String args[])
	{
		int sum=0,a=-1,b=1;
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter the maximum limit");
		int i = scanner.nextInt();
		sum =a+b;
		a=b;
		b=sum;
		//System.out.println(i);
		do
		{
			System.out.println(sum);
			sum =a+b;
			a=b;
			b=sum;
				
		}while(sum<=i);
		
	}

}
