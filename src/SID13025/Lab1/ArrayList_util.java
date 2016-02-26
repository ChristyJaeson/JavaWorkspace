package SID13025.Lab1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ArrayList_util {
	public static void main(String args[])
	{
		System.out.println("Enter the number of expenses:");
		Scanner scanner= new Scanner(System.in);
		int count = scanner.nextInt();
		String str;
		ArrayList<String> name= new ArrayList<String>();
		ArrayList<Double> value= new ArrayList<Double>();
		//System.out.println(args.length);
		
		for(int i=0;i<count;i++)
		{
			int j,k;
			System.out.println("Expenses name:");
			str=scanner.next().toUpperCase();
			if(!name.contains(str))
			{
				name.add(str);
				value.add(0.0);
				//value.set(name.indexOf(str), 0.0);
			}
			j=name.indexOf(str);
			System.out.println("Expenses Amount:");
			str=scanner.next();
			k=str.indexOf('$');
			if(k!=-1)
			{
				str=str.substring(k+1, str.length() );
				//System.out.println(str);
			}
			value.set(j, value.get(j)+Double.parseDouble(str));
		}
		System.out.println("Expense\tAmount");
		for(int i=0;i<name.size();i++)
		{
			System.out.println(name.get(i)+"\t$"+value.get(i));
		}
	}
}
