package SID13025.Lab2.Person_Age;

import java.util.Scanner;

public class _Book {
	public static void main(String args[])
	{
		Book mobidick=new Book(704);
		mobidick.trace("mobidick");
		mobidick.burn();
		//mobidick.trace("mobidick");
		if(mobidick.isThin())
			 System.out.println("mobidick is thin and has "+mobidick.getPages());
		else
			System.out.println("mobidick is not thin and has "+mobidick.getPages());
		
		
	}

}
