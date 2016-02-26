package SID13025.Lab0;

import java.io.IOException;
import java.util.Scanner;

public class Q10 {
	public static void main(String args[]) throws IOException
	{
		
		Scanner scanner= new Scanner(System.in);
		String InString,splitString[];
		
		System.out.println("Enter the sequence");
		InString = scanner.next();//Pattern required "12-34-56"
		splitString=InString.split("-");
		int count;//=new Integer(splitString.length);
		count=splitString.length;
		int a[]=new int[count];
		for(int i=0;i<count;i++)
		{
			a[i]=Integer.parseInt(splitString[i])-1;
		}
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<count;j++)
			{
				for(int k=0;k<count;k++)
				{
					System.out.print(a[k]+" ");
				}
				System.out.println();
				a[j]++;
			}
		}
		
	}


}
