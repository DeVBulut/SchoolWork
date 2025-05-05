
public abstract class Shape {

	public abstract double area( );
	public abstract double perimeter( );
	public double xpos; 
	public double ypos;

	public double semiperimeter( ) {
		return perimeter( ) / 2; 
	}

	public static double distance(Shape s1, Shape s2) {
		//TODO finish this method - The tester code assumes that shapes will be placed with the putShapeHere method
		double xPosFinal = s1.xpos - s2.xpos;
		double yPosFinal = s1.ypos - s2.ypos;
		double distance= (xPosFinal * xPosFinal) + (yPosFinal * yPosFinal);
		double squareRoot = Math.sqrt(distance);
		return squareRoot;
	}

	public void putShapeHere(double x, double y) {
		//TODO: This is how you will be getting the information from the test program as to where the shape should be
		//You need to do something with this information
		xpos = x;
		ypos = y;
	}

}
