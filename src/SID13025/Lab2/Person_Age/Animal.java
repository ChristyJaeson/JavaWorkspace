package SID13025.Lab2.Person_Age;

public class Animal {
	private int legs;

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	private void trace(String s)
 	{
 		System.out.println(s);
 	}
	public Animal(int a) {
		// TODO Auto-generated constructor stub
		legs=a;
	}
	public boolean isDisable()
	{
		return legs==0;
	}
	public void removelegs(int a) {
		if(legs-a < 0)
			trace("legs cant be <0");
		else
			legs-=a;
	}
	public static void main(String args[])
	{
		Animal rat=new Animal(4);
		Animal panda=new Animal(4);
		Animal a2=new Animal(4);
		
		Animal a3=new Animal(4);
		Animal a4=new Animal(4);
		Animal a5=new Animal(4);
		
		System.out.println( "panda's legs="+panda.getLegs());
		 System.out.println("panda break a leg");
		 panda.removelegs(1);
		 if(panda.isDisable())
		 System.out.println("panda disabled");
		 else
			 System.out.println("panda not disabled");
		 System.out.println("panda's legs="+panda.getLegs());
		
	}
}
