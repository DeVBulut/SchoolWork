import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment_08 {


	//8.21
	public static boolean doTheNumbersAddToK_NSquared(Integer [] a, int k) {
			double startTime = System.nanoTime();

		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {
				if(a[i] + a[j] == k){
					//System.out.println("time it took on N^2 time is " + (System.nanoTime() - startTime));
					return true;
				}
			}
		}
		//System.out.println("time it took on N^2 time is " + (System.nanoTime() - startTime));
		return false; 
	}
	
	public static boolean doTheNumbersAddToK_NLogN(Integer[] a, int k) {
        double startTime = System.nanoTime();
        Arrays.sort(a);

        Set<Integer> seenNumbers = new HashSet<>();

        for (int num : a) {
            int complement = k - num;
            if (seenNumbers.contains(complement)) {
                return true;
            }
            seenNumbers.add(num);
        }

        return false;
    }
	
	
	
	//8.27
	public static <AnyType extends Comparable<? super AnyType>> int howManyNonDuplicates(AnyType [] a) {
		Arrays.sort(a);

		int n = a.length;
		int newSize = 0;

		for (int i = 0; i < n; i++) {

			if (i == 0 || a[i].compareTo(a[i - 1]) != 0) {

				a[newSize++] = a[i];
			}
		}

		return newSize;
	}
	
	//8.33
	public static boolean areTheseAnagrams(String s1, String s2) {

		s1 = s1.replaceAll(" ",  "");
		s2 = s2.replaceAll(" ",  "");
		if (s1.length() != s2.length()) {
            return false;
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
	}

}
