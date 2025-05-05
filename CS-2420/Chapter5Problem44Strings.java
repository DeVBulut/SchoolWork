
public class Chapter5Problem44Strings {

	public static void main(String[] args) {
		solveTheEquation();
	}

	//TODO List the BigOh Runtime Here: O(N^2)
	public static String makeLongString1( int N )
	{
		String result = "";
		for( int i = 0; i < N; i++ )
			result += "x";
		return result;
	}

	//TODO List the BigOh Runtime Here: O(N)
	public static String makeLongString2( int N )
	{
		StringBuilder result = new StringBuilder( "" );
		for( int i = 0; i < N; i++ )
			result.append( "x" );
		return new String( result );
	}

	public static void solveTheEquation()
	{
		long arrayForNums[] = new long[75];
		for (int i = 1; i < 75; i++) {
			long x = ((long)i) * i * i * i * i;
			arrayForNums[i] = x;
		}

		//test for the array
		// for (int i = 0; i < arrayForNums.length; i++) {
		// 	System.out.println( i + " is " + arrayForNums[i]);
		// }


		

			int target = 74;
			for (int a = 1; a <= target; a++) {
				for (int b = a; b <= target; b++) {
					for (int c = b; c <= target; c++) {
						for (int d = c; d <= target; d++) {
							for (int e = d; e <= target; e++) {
								//System.out.println( a + " " + b + " " + c + d + " " + e);
								long sum = arrayForNums[a] + arrayForNums[b] + arrayForNums[c] + arrayForNums[d] + arrayForNums[e];
								long f = (long) Math.pow(sum, 1.0 / 5.0);
			
								if (f >= e && f <= target && sum == arrayForNums[((int)f)]) {

									System.out.println("A: " + a + ", B: " + b + ", C: " + c + ", D: " + d + ", E: " + e + ", F: " + f);
								}
							}
						}
					}
				}
			}

			
	}
}
