package SID13025.Lab2.Person_Age;

public class Person {
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	Person(int age)
	{
		this.age=age;
	}
	boolean isOld()
	{
		if(age>80)
			return true;
		else
			return false;
	}
	boolean oneYearOlder()
	{
		age++;
		return true;
	}
	void kill()
	{
		age=-1;
	}
	
}
