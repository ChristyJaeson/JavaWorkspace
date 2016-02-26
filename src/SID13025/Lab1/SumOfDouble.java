package SID13025.Lab1;

public class SumOfDouble {

	public static void main(String args[])
	{
		double arr[]={9.0,10.0,1.0,2.0,3.0,4.0,5.0,6.0,7.0,8.0};
		double sum=0.0; 
		for(int i=0; i<arr.length; i++ )
		{
			sum += arr[i]; 
		}
		System.out.println(sum);
	}
}
