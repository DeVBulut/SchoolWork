import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = askTableSize(input);
        printMultiplicationTable(size);
    }

    public static int askTableSize(Scanner input) {

        int size = 0;
        while (size <= 0) {
            System.out.print("Enter the size of the multiplication table ");
            size = input.nextInt();
        }
        return size;
    }

    public static void printMultiplicationTable(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("\t" + i);
        }

        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < size; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}

