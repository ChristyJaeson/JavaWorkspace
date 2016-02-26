package SID13025.Lab2;

public class Face {

	int noEye,noNose,noMouth;
	Face(int noEye,int noNose,int noMouth){
		this.noEye=noEye;
		this.noNose=noNose;
		this.noMouth=noMouth;
	}
	public int getNoEye() {
		return noEye;
	}
	public void setNoEye(int noEye) {
		this.noEye = noEye;
	}
	public int getNoNose() {
		return noNose;
	}
	public void setNoNose(int noNose) {
		this.noNose = noNose;
	}
	public int getNoMouth() {
		return noMouth;
	}
	public void setNoMouth(int noMouth) {
		this.noMouth = noMouth;
	}
	public void convertToNormal()
	{
		if(this.noEye!=2)
			setNoEye(2);
		if(this.noNose!=1)
			setNoNose(1);
		if(this.noMouth!=1)
			setNoMouth(1);
		if(checkConversion())
		{
			return;
		}
		else
		{
			System.out.println("ERROR - ABORTING");
			new Exception("Face obj - Not normalised"); 
		}
		
	}
	private boolean checkConversion()
	{
		if(noEye==2 && noNose==1 && noMouth==1)
			return true;
		else
			return false;
	}
	void print(String s)
	{
System.out.println(s+" Face features:"+"\nEyes: "+this.getNoEye()+"\nNose: "+this.noNose+"\nMouth: "+this.noMouth);
	}
	public static void main(String args[])
	{
		Face F1 =new Face(2,2,1);
		Face F2 =new Face(1,1,2);
		Face F3 =new Face(2,1,1);
		F1.print("F1");
		F2.print("F2");
		F3.print("f3");
		//System.out.println("calling convert");
		F1.convertToNormal();
		System.out.println(F1.getNoEye()+"-"+F1.noNose+"-"+F1.noMouth);
		F2.convertToNormal();
		System.out.println(F2.getNoEye()+"-"+F2.noNose+"-"+F2.noMouth);
		F3.convertToNormal();
		System.out.println(F3.getNoEye()+"-"+F3.noNose+"-"+F3.noMouth);
		F1.print("F1");
		F2.print("F2");
		F3.print("F3");
	}
}
