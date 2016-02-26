package SID13025.Lab2.Person_Age;

public class CS408Grader {
	
	private int a;

	public CS408Grader() {
		// TODO Auto-generated constructor stub
	}
	CS408Grader(int a)
	{
		this.a=a;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
		trace( "Arun is grader for Session : "+getA());
	}
 	boolean isNormal(int grader)
	{
 		if(this.a==grader)
 			return true;
		return false;
	}
 	boolean isNormal()
	{
 		if(this.a==2)
 		{
 			trace( "Arun is grader for 2 ");
 			return true;
 		}
 		trace( "Arun is not grader for 2 ");
		return false;
	}
 	private void trace(String s)
 	{
 		System.out.println(s);
 	}

}
