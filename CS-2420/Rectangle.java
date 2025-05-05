public class Rectangle extends Shape {
	
    private double length;
    private double width;

    public Rectangle( double len, double wid ) {
        if(len >= 0 && wid >= 0){
        length = len; width = wid;
        }else{
            throw new IllegalArgumentException();
        }   
    }
     
    public double area( ) {
        return length * width;
    }
    
    public double perimeter( ) {
        return 2 * ( length + width );
    }
    
    public String toString( ) {
        return "Rectangle: " + length + " " + width;
    }
    
    public double getLength( ) {
        return length;
    }
    
    public double getWidth( ) {
        return width;
    }

}