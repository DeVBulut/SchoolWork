import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Assignment_03_31_BigComplex {
	
	public BigDecimal realPart;
    public BigDecimal imaginaryPart;

	public Assignment_03_31_BigComplex() {
		//TODO this constructor should represent the number 0+0i
		//Note - Be sure to use BigDecimals's!
		this.realPart = BigDecimal.ZERO;
		this.imaginaryPart = BigDecimal.ZERO;
	}
	public Assignment_03_31_BigComplex(BigDecimal real) {
		//TODO this constructor should represent the number real+0i
		this.realPart = real;
		this.imaginaryPart = BigDecimal.ZERO;
	}
	public Assignment_03_31_BigComplex(BigDecimal real, BigDecimal imaginary) {
		//TODO this constructor should represent the number real+imaginary i
		realPart = real;
		imaginaryPart = imaginary;
	}
	
	public Assignment_03_31_BigComplex(String s) {
		//TODO this constructor should represent the number shown in the String - Assume the number will be something like "4.6" or "4.6 + 8.35i"
		if(s.contains("i")){
		String a[] = s.split(" ");
		BigDecimal x = new BigDecimal(a[0]);
		realPart = x;
		String b[] = a[2].split("i");
		BigDecimal y = new BigDecimal(b[0]);
		imaginaryPart = y;
		}else
		{
			BigDecimal x = new BigDecimal(s);
			realPart = x;
			imaginaryPart = BigDecimal.ZERO;
		}
	}

	public static Assignment_03_31_BigComplex add(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of adding a and b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		BigDecimal realSum = a.realPart.add(b.realPart);
		BigDecimal imaginarySum = a.imaginaryPart.add(b.imaginaryPart);
		return new Assignment_03_31_BigComplex(realSum, imaginarySum);
	}
	
	public static Assignment_03_31_BigComplex subtract(Assignment_03_31_BigComplex a, Assignment_03_31_BigComplex b) {
		//TODO - this method should create a third Complex number that is the result of subtracting b from a.  I.e. a-b
		//Note: We are doing this slightly different from the book example, in that both a and b are provided as parameters
		BigDecimal real= a.realPart.subtract(b.realPart);
		BigDecimal imaginary = a.imaginaryPart.subtract(b.imaginaryPart);
		return new Assignment_03_31_BigComplex(real, imaginary);
	}

	public boolean equals(Assignment_03_31_BigComplex a) {
		//TODO - I am adding this equals method so that you can have a slightly easier time thinking about equality before you tackle the next method
		if(a.realPart.equals(realPart) && a.imaginaryPart.equals(imaginaryPart)){
			return true;
		}
		return false;
	}

	@Override
	public boolean equals(Object a) {
		//TODO - This method should follow a similar pattern to the example in the book - where you check if a is actually a complex number
		if (a == null || !(a instanceof Assignment_03_31_BigComplex)) {
			return false;
		}

		Assignment_03_31_BigComplex otherComplex = (Assignment_03_31_BigComplex) a;
		return this.realPart.equals(otherComplex.realPart) && this.imaginaryPart.equals(otherComplex.imaginaryPart);
	}
	
	
	@Override
	public String toString() {
		//TODO - this method should return the string representation of the number.  My main method assumes there will be a space around both sides of the plus sign, but no space before the i
		//NOTE: This method needs to work correctly so that almost all the tests work!!!!!
		//NOTE: Also, don't just always put the i part on - only if i isn't 0
		//NOTE: You do NOT have to convert the + to a - if the imaginary part is negative!!! 
		if(realPart == BigDecimal.ZERO && imaginaryPart == BigDecimal.ZERO)
		{
			return "0";
		}else if(realPart != BigDecimal.ZERO && imaginaryPart == BigDecimal.ZERO)
		{
			String a = realPart.toString();
			return a;
		}else if(realPart == BigDecimal.ZERO && imaginaryPart != BigDecimal.ZERO)
		{
			String a = imaginaryPart.toString();
			return a + "i";
		}else{
			return realPart + " + " + imaginaryPart + "i";
		}
	}
	
	
}
