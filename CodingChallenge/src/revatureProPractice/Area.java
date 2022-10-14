package revatureProPractice;

public class Area{

	  public static void main(String[] args) {
	      Area a= new Area();
	      System.out.println(a.calculateTriangleArea(1.0,2.0));
	    
	  }
	    public double calculateTriangleArea(double d, double e)
	    {
	      return  0.5*d*e; 
	    }
	    public int calculateTriangleArea(int base, int height) {
	      return base*height; 
	    }
	}