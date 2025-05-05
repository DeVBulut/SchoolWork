import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TheBooksString {

	//My recreation of Figure 20.2
	public static int hash(String key, int tableSize) {
		int hashVal = 0;
		
		for(int i = 0; i < key.length(); i++) {
			hashVal = 37 * hashVal + key.charAt(i);
		}

		hashVal %= tableSize;
		if(hashVal < 0) {
			hashVal += tableSize;
		}
		
		return hashVal;
	}
	
	
	public static void main(String[] args) {
		int tableSize = 100;
        int[] distribution = new int[tableSize];

        try (BufferedReader br = new BufferedReader(new FileReader("onlineDictionary.txt"))) {
            String line;
            while ((line = br.readLine()) != null) 
			{
                int hashValue = hash(line, tableSize);
                distribution[hashValue]++;
            }
        }
		catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < tableSize; i++) {
            System.out.println("Position " + i + ": " + distribution[i] + " times");
        }
	}

}
