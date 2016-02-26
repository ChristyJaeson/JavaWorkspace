package SID13025.Lab3.Aggregation;

public class Nose {
	       private int x,y,z; // Three sides of a triangle nose
	       Nose(int X,int Y,int Z){x=X;y=Y;z=Z;}
	       public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
		public int getZ() {
			return z;
		}
		public void setZ(int z) {
			this.z = z;
		}
  		public boolean isBig(){return ((x>10)||(y>10)||(z>10));} // if any side is largeer than 10
		public boolean isImpossible(){
			//System.out.println("----"+x+""+y+""+z);
			if((x+y>z)&&(x+z>y)&&(y+z>x))
			{
				//System.out.println("Nose possible");
				return true;
			}
			return false;
				
		} // Same as the condition
	                           // that for an imposible triangle
	       // Implemetor
	       void break_(){setX(0);} // One of the side is changed to 0
	

}
