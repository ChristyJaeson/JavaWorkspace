package SID13025.Lab0;

public class Permutation {
	static int a[]={11,22,33};
	/*public static void Permutation(int start, int end)
	{
		int i; 
		System.out.println(start);
		if(start==end)
		{
			System.out.println("return a");
			return;
		}
		else
		{
			for(i=start;i<=end;i++)
			{
				//System.out.println("i= "+i+"start="+start+"end="+end);
				//System.out.println(a[0]+" "+a[1]+" "+a[2]);
				int temp;
				temp=a[end];
				a[end]=a[i];
				a[i]=temp;
				System.out.println(a[0]+" "+a[1]+" "+a[2]);
				Permutation(i+1,end);
				temp=a[end];
				a[end]=a[i];
				a[i]=temp;
				//Permutation(i+1,end);
				//System.out.println("post"+a[0]+" "+a[1]+" "+a[2]);
				
			}
		}
		
	}*/
	public static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++){
	        	//System.out.println(i+prefix + str.charAt(i)+"+"+ str.substring(0, i) +"+"+ str.substring(i+1, n));
	        
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	 }
	
	
	public static void main(String args[])
	{
		
		//int a[]={1,2,3};
		//String a[]= {"1","2","3"};
		permutation("","abdc");
	}


}
