import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment_04_Generic_Tester {

	public static <AnyType extends Comparable<AnyType>> AnyType min(AnyType a, AnyType b) {
		// ...
		if (a.compareTo(b) <= 0) {
            return a;
        } else {
            return b;
        }
	}
	
	public static <AnyType extends Comparable<AnyType>> AnyType max(AnyType a, AnyType b) {
		// TODO Convert this method to properly use Anytype and Comparable, then return the appropriate thing
		if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
	}

	public static <AnyType extends Comparable<AnyType>> AnyType min(AnyType[] a) {
		// TODO Convert this method to properly use Anytype and Comparable, then return the appropriate thing
		AnyType min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i].compareTo(min) < 0) {
                min = a[i];
            }
        }
        return min;

	}
	
	public static void main(String[] args) {

		System.out.println("Starting tests");

		System.out.println("Testing 4.23/4.24");
		
		String [] s = {"amet", "audiam", "convenire", "duis", "ea", "id", "in", "insolens", "ipsumd", "lorem", "mei", "mnesarchum", "olor", "populo", "primis", "putent", "quo", "quo", "scripta", "sit", "tollit", "ut", "vim", "vivendum"};
		Integer [] secondTester = new Integer[25];
		secondTester[0] = (int)(Math.random()*10);
		for(int i = 1; i < secondTester.length; i++) {
			secondTester[i] = secondTester[i-1] + (int)(Math.random()*10);
		}
		
		// try {
		// 	throw new Exception("TODO After you get the Anytype working, remove the following comments, and this exception code");
		// }
		// catch (Exception e) {
		// 	e.printStackTrace();
		// }

		//TODO remove these comments after you get the Anytype working properly
		
		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(secondTester.length/2));
				int next = (int)(Math.random()*(secondTester.length-x-2))+x+1;
				if(! secondTester[x].equals(min(secondTester[x], secondTester[next]))) {
					throw new Exception("Error with 2 argument min method.  Expecting min to return '" + secondTester[x] + "' not '" + min(secondTester[x], secondTester[next]) + "'");
				}
				if(! secondTester[x].equals(min(secondTester[next], secondTester[x]))) {
					throw new Exception("Error with 2 argument min method.  Expecting min to return '" + secondTester[x] + "' not '" + min(secondTester[x], secondTester[next])+ "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(secondTester.length/2));
				int next = (int)(Math.random()*(secondTester.length-x-2))+x+1;
				if(! secondTester[next].equals(max(secondTester[x], secondTester[next]))) {
					throw new Exception("Error with 2 argument max method.  Expecting max to return '" + secondTester[next] + "' not '" + max(secondTester[x], secondTester[next]) + "'");
				}
				if(! secondTester[next].equals(max(secondTester[next], secondTester[x]))) {
					throw new Exception("Error with 2 argument max method.  Expecting max to return '" + secondTester[next] + "' not '" + max(secondTester[x], secondTester[next])+ "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				ArrayList<Integer> a = new ArrayList<Integer>();
				int x = (int)(Math.random()*(secondTester.length/2));
				int next = (int)(Math.random()*(secondTester.length-x-2))+x+1;
				Integer small = secondTester[x];
				for(int j = x; j < next; j++) {
					a.add(secondTester[j]);
				}
				Collections.shuffle(a);
				Integer [] smaller = new Integer[a.size()];
				for(int j = 0; j < a.size(); j++) {
					smaller[j] = a.get(j);
				}
				
				if(! small.equals(min(smaller))) {
					String array = "";
					for(Integer f: smaller){
						array += " " + f;
					}
					throw new Exception("Error with array min method.  Expecting min to return '" + small + "' not '" + min(smaller) + "' for array with {" + array + " }");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		
		
		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(s.length/2));
				int next = (int)(Math.random()*(s.length-x-2))+x+1;
				if(! s[x].equals(min(s[x], s[next]))) {
					throw new Exception("Error with 2 argument min method.  Expecting min to return '" + s[x] + "' not '" + min(s[x], s[next]) + "'");
				}
				if(! s[x].equals(min(s[next], s[x]))) {
					throw new Exception("Error with 2 argument min method.  Expecting min to return '" + s[x] + "' not '" + min(s[x], s[next])+ "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(s.length/2));
				int next = (int)(Math.random()*(s.length-x-2))+x+1;
				if(! s[next].equals(max(s[x], s[next]))) {
					throw new Exception("Error with 2 argument max method.  Expecting max to return '" + s[next] + "' not '" + max(s[x], s[next]) + "'");
				}
				if(! s[next].equals(max(s[next], s[x]))) {
					throw new Exception("Error with 2 argument max method.  Expecting max to return '" + s[next] + "' not '" + max(s[x], s[next])+ "'");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		try {
			for(int i = 0; i < 20; i++) {
				ArrayList<String> a = new ArrayList<String>();
				int x = (int)(Math.random()*(s.length/2));
				int next = (int)(Math.random()*(s.length-x-2))+x+1;
				String small = s[x];
				for(int j = x; j < next; j++) {
					a.add(s[j]);
				}
				Collections.shuffle(a);
				String [] smaller = new String[a.size()];
				for(int j = 0; j < a.size(); j++) {
					smaller[j] = a.get(j);
				}
				
				if(! small.equals(min(smaller))) {
					String array = "";
					for(String f: smaller){
						array += " " + f;
					}
					throw new Exception("Error with array min method.  Expecting min to return '" + small + "' not '" + min(smaller) + "' for array with {" + array + " }");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Finishing testing 4.23/4.24");

		System.out.println("Starting tests for 4.29 (Comparable<MemoryCell>)");
		
		secondTester = new Integer[25];
		secondTester[0] = (int)(Math.random()*10);
		for(int i = 1; i < secondTester.length; i++) {
			secondTester[i] = secondTester[i-1] + (int)(Math.random()*10);
		}

		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(secondTester.length/2));
				int next = (int)(Math.random()*(secondTester.length-x-2))+x+1;
				GenericMemoryCell<Integer> smaller = new GenericMemoryCell<Integer>();
				smaller.write(x);
				GenericMemoryCell<Integer> larger = new GenericMemoryCell<Integer>();
				larger.write(next);
				
				int answer = smaller.compareTo(larger); 
				if(answer >= 0) {
					throw new Exception("Error with compareTo in generic memory cell.  Expecting the result to be negative for " + x + " " + next + " instead of " + answer);
				}
				
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(secondTester.length/2));
				int next = (int)(Math.random()*(secondTester.length-x-2))+x+1;
				GenericMemoryCell<Integer> smaller = new GenericMemoryCell<Integer>();
				smaller.write(x);
				GenericMemoryCell<Integer> larger = new GenericMemoryCell<Integer>();
				larger.write(next);
				
				int answer = larger.compareTo(smaller);
				if(answer <= 0) {
					throw new Exception("Error with compareTo in generic memory cell.  Expecting the result to be positive for " + next + " " + x + " instead of " + answer);
				}
				
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		try {
			for(int i = 0; i < 20; i++) {
				int x = (int)(Math.random()*(secondTester.length/2));
				GenericMemoryCell<Integer> smaller = new GenericMemoryCell<Integer>();
				smaller.write(x);
				GenericMemoryCell<Integer> smaller2 = new GenericMemoryCell<Integer>();
				smaller2.write(x);
				
				int answer = smaller.compareTo(smaller2);
				if(answer != 0) {
					throw new Exception("Error with compareTo in generic memory cell.  Expecting the result to be 0 for " + x + " " + x + " instead of " + answer);
				}
				
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}

		System.out.println("Ending tests for 4.29");

    	System.out.println("Starting tests for 4.36 (Comparable method in the Person class)");
    	s = new String[] {"Abbie Batalla", "Carline Duden", "Denys Groberg", "Ebba Guillet", "Halli Klave", "Ina Lennert", "Janice Lidder", "Linnie Taborda", "Nannette Winkles", "Rozamond Zukoski"};
		try {
			for(int i = 0; i < 20; i++) {
				ArrayList<String> a = new ArrayList<String>();
				int x = (int)(Math.random()*(s.length/2));
				int next = (int)(Math.random()*(s.length-x-2))+x+1;
				for(int j = x; j < next; j++) {
					a.add(s[j]);
				}
				//Collections.shuffle(a);
				Person [] smaller = new Person[a.size()];
				for(int j = 0; j < a.size(); j++) {
					smaller[j] = new Person(a.get(j), (int)(Math.random()*100), "Nowhere's vill, USA", "435-555-5555");
				}
				Person max = smaller[a.size()-1];

				List<Person> tmp = Arrays.asList(smaller);
				Collections.shuffle(tmp);
				smaller = tmp.toArray(smaller);

				if(! max.toString().equals(Person.findMax(smaller).toString())) {
					String array = "";
					for(Person f: smaller){
						array += f.getName() + ", ";
					}
					throw new Exception("Error with the comparable method in Person.  Expecting findMax to return '" + max + "' not '" + Person.findMax(smaller) + "' for array with {" + array + "}");
				}
			}
		}
		catch (Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Finishing tests for 4.36");
		
		System.out.println("Ending tests");
		
	}

}
