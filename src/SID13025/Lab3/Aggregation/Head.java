package SID13025.Lab3.Aggregation;

public class Head {
	private int numHair;
	private int R; // Radius of the circular head
    Eye eyes[]; // left eye and right eye
    Nose n;
    Mouth m;
Head(Eye le,Eye re,Nose n,Mouth m, int r,int hair){
	eyes=new Eye[2];
	eyes[0]=le;eyes[1]=re;
	this.n=new Nose(n.getX(),n.getY(),n.getZ());
	this.m=m;
	R=r;
	numHair=hair;
}
    public int getNumHair() {
		return numHair;
	}
	public void setNumHair(int numHair) {
		this.numHair = numHair;
	}
	public int getR() {
		return R;
	}
	public void setR(int r) {
		R = r;
	}
	public Nose getN() {
		return n;
	}
	public void setN(Nose n) {
		 this.n = n;
	}
	public Mouth getM() {
		return m;
	}
	public void setM(Mouth m) {
		this.m = m;
	}
	public Eye getEye1() {
		return eyes[1];
	}
	public void setEye1(Eye e) {
		this.eyes[1] = e;
	}
	public Eye getEye0() {
		return eyes[0];
	}
	public void setEye0(Eye e) {
		this.eyes[0] = e;
	}
 
	public boolean  isNormal(){
    	return (eyes[0].getR()==eyes[1].getR());
    	}
    	// Head is normal if eye 1 and and eye 2
                    // have the same size

    //Implementor
    	public boolean headAche(){
    		if(eyes[0].getR()==0&&eyes[1].getR()==0&&(m.getH()==0||m.getW()==0))
    			 return  true;
    		 return false;
    	} // The symptom of head ache is
                     // the mouth and both eyes 
                     // are closed.
    	public static void main(String args[])
    	{
    		Eye le=new Eye(2);
    		Eye re=new Eye(2);
    		Nose n=new Nose(4,3,5);
    		Mouth m=new Mouth(4,2);
    		Head  H=new Head(le,re,n, m, 10, 100);
    		System.out.println("eyes:\tleft\tright\n\t"+H.getEye0().getR()+"\t"+H.getEye1().getR());
    		System.out.println("nose:\tx\ty\tz\n\t"+H.getN().getX()+"\t"+H.getN().getY()+"\t"+H.getN().getZ()+"\n");
    		
    		System.out.println(H.isNormal()+"\neye small:"+H.getEye0().isSmall()+"\nNose big:"+
    		H.getN().isBig()+"\nNose possible:"+H.getN().isImpossible()
    		+"\nsz:"+H.getM().size());
    		
    		Eye le2=new Eye(2);
    		Eye re2=new Eye(4);
    		Nose n2=new Nose(0,0,5);
    		Mouth m2=new Mouth(4,12);
    		Head  H2=new Head(le2,re2,n2, m2, 3, 90);

    		System.out.println("eyes:\tleft\tright\n\t"+H2.getEye0().getR()+"\t"+H2.getEye1().getR());
    		System.out.println("nose:\tx\ty\tz\n\t"+H2.getN().getX()+"\t"+H2.getN().getY()+"\t"+H2.getN().getZ()+"\n");
    		
    		System.out.println(H2.isNormal()+"\neye small:"+H2.getEye0().isSmall()+"\nNose big:"+
    		H2.getN().isBig()+"\nNose possible:"+H2.getN().isImpossible()
    		+"\nsz:"+H2.getM().size());
    		
    		H2.getM().close();
    		H2.getEye0().close();
    		H2.getEye1().close();
    		System.out.println("eyes:\tleft\tright\n\t"+H2.getEye0().getR()+"\t"+H2.getEye1().getR());
    		System.out.println("\nheadAche:"+H2.headAche());
    		
    		/*
    		H2.getEye0().close()
    		System.out.println("H2:\n"+H2.isNormal()+"\n"+H2.getEye0().close()+"\n"+
    	    		H2.getN().isBig()+"\n"+H2.getN().isImpossible()
    	    		+"\n"+H2.getM().size());*/
    	}

}
/*class Eye{
    private:
       int r; // The radius of an eye
       // Helping function
       float pi() { return 3.1416; }
    public:
       ....
       // Predicate 
       int isSmall(); // if the radius is less than 10
       // Implementor
       void close(); // The shape of the eye changes from a 
                     // circle to a point
    };
    class  Nose{
    private:
       int x,y,z; // Three sides of a triangle nose
    public:
       ....
       // Predicate
       int isBig(); // if any side is largeer than 10
       int isImpossible(); // Same as the condition
                           // that for an imposible triangle
       // Implemetor
       void break(); // One of the side is changed to 0
    };
    class Mouth{
   
    };

    class Head{
    private:
       int numHair;
       int R; // Radius of the circular head
       Eye eyes[2]; // left eye and right eye
       Nose n;
       Mouth m;
    public:
       ....
       // Predicate
       int isNormal(); // Head is normal if eye 1 and and eye 2
                       // have the same size

       //Implementor
       void headAche(); // The symptom of head ache is
                        // the mouth and both eyes 
                        // are closed.
    };
    void main()
    {
       // Create test two objecs 
       // - normalHead
       // - abnormalHead  
     
    }
*/