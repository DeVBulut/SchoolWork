
public class Assignment_01_17 {

	public static int max(int a, int b, int c) {
		int maxFirst = (a > b) ? a : b;
		int maxFinal = (maxFirst > c) ? maxFirst : c;
		return maxFinal;
	}

	public static int max(int a, int b, int c, int d) {
		int maxFirst = (a > b) ? a : b;
		int maxSecond = (maxFirst > c) ? maxFirst : c;
		int maxFinal = (maxSecond > d) ? maxSecond : d;

		return maxFinal;
	}

}
