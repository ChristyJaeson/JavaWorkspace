package SID13025.Lab0;

public class ComputeVolume {
	double SphereVolume(double radius)
	{
		double Volume;
		Volume = (4/3)*(22/7)*(Math.pow(radius,3.0 ));
		return Volume;
	}
	double CylinderVolume(double radius, double height)
	{
		double Volume;
		Volume = (22/7)*(Math.pow(radius,2.0 ))*height;
		return Volume;
	}
	public static void main(String args[])
	{
		ComputeVolume c= new ComputeVolume(); 
		System.out.println(c.SphereVolume(1.0));
		System.out.println(c.CylinderVolume(1.0,.7));
		
	}
	
}
