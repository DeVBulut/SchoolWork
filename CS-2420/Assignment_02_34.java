import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment_02_34 {
    public static List<String> oldestPersonAll()
    {
        File file = new File("Assignment_02_34_small.txt");

        List<String> oldestNames = new ArrayList<>();
        int oldestPersonAge = 0;

        try (Scanner scanner = new Scanner(file)) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length == 3) {
                    String name = parts[0] + " " + parts[1];
                    int age = Integer.parseInt(parts[2]);

                    if (age > oldestPersonAge) {
                        
                        oldestNames.clear();
                        oldestNames.add(name);
                        oldestPersonAge = age;

                    }
                    else if (age == oldestPersonAge) {
                        oldestNames.add(name);
                    }
                }
            }

            return oldestNames;

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        return null;
    }
    
    public static String oldestPersonOutputTie()
    {
        File _file = new File("Assignment_02_34_large.txt");
        String oldestPersonName = null;
        int oldestPersonAge = 0;
        try (Scanner _scanner = new Scanner(_file))
        {
            while (_scanner.hasNextLine()) {

                String line = _scanner.nextLine();
                String[] parts = line.split(" ");
                if (parts.length == 3) 
                {
                    String name = parts[0] + " " + parts[1];
                    int age = Integer.parseInt(parts[2]);

                    if (age > oldestPersonAge) {
                        oldestPersonName = name;
                        oldestPersonAge = age;
                    } 

                }
            }
            return oldestPersonName + " is the oldest person with the age of " + oldestPersonAge;
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not valid");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(" oldestPersonOutputTie Function Output: ");
        System.out.println(oldestPersonOutputTie());
        System.out.println(" oldestPersonAll Function Output: ");
        System.out.println(oldestPersonAll());
    }




}
