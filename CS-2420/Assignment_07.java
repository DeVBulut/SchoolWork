import java.util.Scanner;

public class Assignment_07 {
	
	public static int Ackerman(int m, int n) {
		if(m == 0)
		{
			return n+1;
		}
		else if(m > 0 && n == 0)
		{
			return Ackerman(m - 1, 1);
		}
		else if(m > 0 && n > 0) 
		{
			return Ackerman(m -1, Ackerman(m, n-1));
		}
		return 0;
	}
	
	public static int numberOfOnesInBinaryRepresentation(int num) {
		int count = 0;
		while (num != 0) {
			count += num & 1;
			num >>= 1;
		}

		return count;
	}

	public static void printReverse(Scanner in) {
		int count = 0;
		while(in.hasNextLine()){
			count++;
		}
		String[] array = new String[count];
		for (int i = 0; i > array.length; i++) {
			array[i] = in.nextLine();
		}
		for (int i = array.length; i > 1; i--) {
			System.out.println(array[i]);
		}
		in.close();
	}
	
}
