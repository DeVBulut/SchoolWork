import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LinkedListSet<AnyType extends Comparable<? super AnyType>> extends LinkedList<AnyType> {

    @Override
    public void insert(AnyType x, LinkedListIterator<AnyType> p) {
        if (!contains(x)) {
            super.insert(x, p);
        }
    }

    public boolean contains(AnyType x) {
        LinkedListIterator<AnyType> iterator = first();
        while (iterator.isValid()) {
            if (iterator.retrieve().equals(x)) {
                return true;
            }
            iterator.advance();
        }
        return false;
    }


    public static LinkedListSet<String> createSetFromFile(String fileName, int length, String type) {
        LinkedListSet<String> set = new LinkedListSet<>();
        try {
            Scanner scanner = new Scanner(new File(fileName));
                
                if(type.equals("a")){
                    while (scanner.hasNext()) {
                        String word = scanner.next().toLowerCase();
                        if (word.length() <= length) {
                            set.insert(word, set.zeroth());
                        }
                    }
                }
            
                if(type.equals("b")){
                    while (scanner.hasNext()) {
                        String word = scanner.next().toLowerCase();
                        if (word.length() >= length) {
                            set.insert(word, set.zeroth());
                        }
                    }
                }

                if(type.equals("c")){
                    while (scanner.hasNext()) {
                        String word = scanner.next().toLowerCase();
                        if (word.length() == length) {
                            set.insert(word, set.zeroth());
                        }
                    }
                }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return set;
    }

    public static LinkedListSet<String> union(LinkedListSet<String> set1, LinkedListSet<String> set2) {
        LinkedListSet<String> result = new LinkedListSet<>();
        LinkedListIterator<String> iterator1 = set1.first();
        LinkedListIterator<String> iterator2 = set2.first();

        while (iterator1.isValid()) {
            result.insert(iterator1.retrieve(), result.zeroth());
            iterator1.advance();
        }

        while (iterator2.isValid()) {
            result.insert(iterator2.retrieve(), result.zeroth());
            iterator2.advance();
        }

        return result;
    }

    public static LinkedListSet<String> intersect(LinkedListSet<String> set1, LinkedListSet<String> set2) {
        LinkedListSet<String> result = new LinkedListSet<>();
        LinkedListIterator<String> iterator1 = set1.first();

        while (iterator1.isValid()) {
            if (set2.contains(iterator1.retrieve())) {
                result.insert(iterator1.retrieve(), result.zeroth());
            }
            iterator1.advance();
        }

        return result;
    }

    public static LinkedListSet<String> difference(LinkedListSet<String> set1, LinkedListSet<String> set2) {
        LinkedListSet<String> result = new LinkedListSet<>();
        LinkedListIterator<String> iterator1 = set1.first();

        while (iterator1.isValid()) {
            if (!set2.contains(iterator1.retrieve())) {
                result.insert(iterator1.retrieve(), result.zeroth());
            }
            iterator1.advance();
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedListSet<String> setA = createSetFromFile("Partial_Book.txt", 5,"a");
        LinkedListSet<String> setB = createSetFromFile("Partial_Book.txt", 5, "b");
        LinkedListSet<String> setC = createSetFromFile("Partial_Book.txt", 5, "c");

       // Print sizes of sets A, B, and C
        System.out.println("Size of Set A: " + listSize(setA));
        System.out.println("Size of Set B: " + listSize(setB));
        System.out.println("Size of Set C: " + listSize(setC));

        // Perform and print the results of set operations
        System.out.println("\nUnion of A and B: " + listSize(union(setA, setB)));
        System.out.println("Union of B and C: " + listSize(union(setB, setC)));
        System.out.println("Union of A and C: " + listSize(union(setA, setC)));

        System.out.println("\nIntersection of A and B: " + listSize(intersect(setA, setB)));
        System.out.println("Intersection of B and C: " + listSize(intersect(setB, setC)));
        System.out.println("Intersection of A and C: " + listSize(intersect(setA, setC)));

        System.out.println("\nDifference A - B: " + listSize(difference(setA, setB)));
        System.out.println("Difference B - A: " + listSize(difference(setB, setA)));
        System.out.println("Difference A - C: " + listSize(difference(setA, setC)));
        System.out.println("Difference B - C: " + listSize(difference(setB, setC)));
        System.out.println("Difference C - A: " + listSize(difference(setC, setA)));
        System.out.println("Difference C - B: " + listSize(difference(setC, setB)));

        System.out.println("\nUnion of A, B, and C: " + listSize(union(union(setA, setB), setC)));
        System.out.println("Intersection of A, B, and C: " + listSize(intersect(intersect(setA, setB), setC)));

        System.out.println("\nDifference A - (B ∩ C): " + listSize(difference(setA, intersect(setB, setC))));
        System.out.println("Difference B - (A ∩ C): " + listSize(difference(setB, intersect(setA, setC))));
        System.out.println("Difference C - (A ∩ B): " + listSize(difference(setC, intersect(setA, setB))));

    }
}
