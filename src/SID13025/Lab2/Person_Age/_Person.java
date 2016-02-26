package SID13025.Lab2.Person_Age;

import java.util.Scanner;

public class _Person {
	public static void main(String args[])
	{
		Person jack=new Person(23);
		System.out.println("Jack's Age:"+jack.getAge());
		jack.oneYearOlder();
		System.out.println("Jack's Age:"+jack.getAge());
		System.out.println("Jack is old  : "+jack.isOld());
		System.out.println("Jack's Age:"+jack.getAge());
		jack.kill();
		System.out.println("Jack's Age:"+jack.getAge());
		
	}
	

}
