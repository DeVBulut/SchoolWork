import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReviewFileIO {

	//I have listed this method first, because it needs to be working properly before my autograder can check the other methods
	//For auto-grading - each word should be on it's own line, and have a windows newline \r\n after it
	public static void writeWordsToNewFile(ArrayList<String> words, String outputFilename) {

		try {

			FileWriter fileWriter = new FileWriter(outputFilename);
			for (String string : words) {
				fileWriter.write(string + "\r\n");
			}
			fileWriter.close();
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}

	//This method should return null if the wordNumber is too large, or too small
	//This method should assume an array number style.  I.e. the first word is number 0
	public static String whatIsTheWord(String inputFilename, int wordNumber) {
		if(wordNumber >= 0){
			try {
				int currentIndex = 0;
				File file = new File(inputFilename);
				Scanner _scanner = new Scanner(file);
				while(_scanner.hasNext())
				{
					String wordString = _scanner.next();
					if(wordNumber == currentIndex)
					{
						_scanner.close();
						return wordString; 
					}
					currentIndex++;
				}
				_scanner.close();
				return null;
			} 	
			catch (FileNotFoundException e) 
			{
				e.printStackTrace();
				return null;
			}
		}else{return null;}
		
	}

	//This method should look through the file and find words that are of appropriate size
	public static ArrayList<String> findWordsOfThisSize(String inputFilename, int wordSize) {
		ArrayList<String> words = new ArrayList<String>(); //This variable has been created for you, just in case you haven't seen how to do this
		try 
		{
			File _file = new File(inputFilename);
			Scanner _scanner = new Scanner(_file);
			while(_scanner.hasNext())
			{
				String word = _scanner.next();
				if(word.length() == wordSize)
				{
					words.add(word);
				}
			}
			_scanner.close();
		} 
		catch (Exception e) {
			
		}
		return words;//Finally you return all those words
	}

	//This method should look in the file represented by inputFilename, and return all the words matching the prefix and postfix
	public static ArrayList<String> findWords(String inputFilename, String prefix, String postfix){
		ArrayList<String> words = new ArrayList<String>();
		try
		{
			File _file = new File(inputFilename);
			Scanner _scanner = new Scanner(_file);
			while(_scanner.hasNext()){
				String word = _scanner.next();
				if(word.startsWith(prefix)) 
				{
					if(word.endsWith(postfix)) 
					{ 
						words.add(word);
					}
				}
			}
		}
		catch(Exception e)
		{
				
		}
		return words;
	}
	
}
