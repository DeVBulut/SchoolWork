
public class Assignment_05_InPractice {

	public static boolean doesTheArrayMeetCriteria_5_30(int [] a) {
		//TODO Add code here that determines whether an integer i exists such that A[i] = i in an array of increasing integers
		//TODO What is the runtime of your algorithm?
		long startTime = System.nanoTime();
		for (int i = 0; i < a.length; i++) {
			if(a[i] == i)
			{
				long endTime = System.nanoTime();
				long runtimeOfAlgorithm = endTime - startTime;
				return true;
			}
		}
		long endTime = System.nanoTime();
		long runtimeOfAlgorithm = endTime - startTime;
		return false;

	}

	public static boolean isAPrime(int num) {
		//TODO Add code here.  I am assuming you will be dividing all the odd integers up to sqrt(num) and seeing if any leave a 0 remainder
		long startTime = System.nanoTime();
			if(num%2 == 0)
			{
				return false;
			}
			else
			{
				for (int i = 3; i < num; i++) 
				{
					if(num % i == 0){
						long endTime = System.nanoTime();
						long runTime = endTime - startTime;
						return false;
					}
				}
				return true;
			}
		}

	public static boolean majorityElement(int [] a) {
		//TODO Finish this method appropriately 
		long startTime = System.nanoTime();
		for (int i = 0; i < a.length; i++) {
			int majorityCount = 0;
			for (int j = 0; j < a.length; j++) {
				if(a[i] == a[j])
				{
					majorityCount++;
				}
			}
			if(majorityCount > a.length / 2)
			{
				return true;
			}
		}
		return false;		
	}	

}
