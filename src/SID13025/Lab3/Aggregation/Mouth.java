package SID13025.Lab3.Aggregation;

public class Mouth {
	       int w,h; // width and height of a ractangle Mouth
 	       Mouth(int W,int H){w=W;h=H;}// Predicate
 	       public boolean isBig(){return ((w>10)&&(h>5));} // A mouth is big if w > 10 and
	    public int getW() {
			return w;
		}
		public void setW(int w) {
			this.w = w;
		}
		public int getH() {
			return h;
		}
		public void setH(int h) {
			this.h = h;
		}
		// h > 5
	       // Implementor
	       void close(){h=0;} // The shape of the mouth changes from
	                     // rectangle to a line
	       public int size()
	       {return w*h;}
}
