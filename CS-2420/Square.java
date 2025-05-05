
public class Square extends Shape implements Comparable<Square>{

	//TODO 4.33 - get this entire class working correctly
	private double _sideLength;
	public Square( double sideLength ) {
		if(sideLength >= 0){
				_sideLength = sideLength;
		}else{
			throw new IllegalArgumentException();
		}
	}

	@Override
	public int compareTo(Square o) {
		//Assume squares are differentiated by the length of their side
		//Compares this object with the specified object for order. Returns a negative integer, zero, or a positive integer as this object is less than, equal to, or greater than the specified object. 
		if(_sideLength > o._sideLength){
			return 1;
		}else if(_sideLength == o._sideLength){
			return 0;
		}else{
		
			return -1; 
		}
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		
		return _sideLength * _sideLength;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return _sideLength * 4;
	}


}
