package SID13025.Lab3.Aggregation;

public class Eye {
	      private int r; 
 	      Eye(int R){r=R;};
	       public int getR() {
			return r;
		}
		public void setR(int r) {
			this.r = r;
			
			
		}
		public float pi() { return  3.1416f; }
	       public boolean isSmall(){
	        	return r<10; 
	       }
	       void close(){ 
	    	   setR(0);
	    }

}
