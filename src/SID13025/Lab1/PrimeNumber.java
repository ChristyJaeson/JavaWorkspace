package SID13025.Lab1;

public class PrimeNumber {

	public static void main(String args[])
	{
		int num=2;
		for(int i=2; i<=100; i++ )
		{
			for(int j=2;j<=i;j++)
			{
				if(i==j)
						System.out.print(i+" ");
				else
				{
					if(i%j==0)
						break;
					
				}
				
			}
		}
		//System.out.println(sum);
	}

}
