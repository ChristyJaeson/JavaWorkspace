package SID13025.Lab1;

public class Histogram {
	public static void main(String args[])
	{	
	int a[][]={
			{1,1,1,1,34,56,34},
			{2,2,2,2,34,1,2},
			{3,3,3,3,3,4,1},
			{4,4,4,4,1,2,56}
		};
	int i,j,k;
	int set_count=0;
	boolean set=false;
	int[][] count=new int[2][10];
	for(i=0;i<4;i++)
	{
		for(j=0;j<7;j++)
		{
			set=false;
			for(k=0;k<set_count;k++)
			{
				if(a[i][j]==count[0][k])
				{
					count[1][k]++;
					set=true;
					break;
				}
			}
			if(!set)
			{
				//System.out.println(a[i][j]+" "+count[0][0]);
				count[0][set_count]=a[i][j];
				count[1][set_count]=1;
				set_count++;
			}
		}
	}
	System.out.println("No.\tCount");
	for(k=0;k<set_count;k++)
	{
		System.out.println(count[0][k]+"\t"+count[1][k]);
	}
		}
		
}
