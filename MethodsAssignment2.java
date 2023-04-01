import java.util.Scanner;
public class MethodsAssignment2 {

    public static void main(String[] args){
        int a = getPositiveIntFromUser();
        System.out.println(a);
        int b = getRangeOfIntFromUser(100, 0);
        System.out.println(b);
        int c = getAnyIntFromUser();
        System.out.println(c);
    }

    /*
     *  Create a method called getRangeOfIntFromUser that takes 2 integers. 
     *  These integers should be the lowest value that is acceptable and the highest value that is acceptable.
     *  The method should ask the user for a number in that range.
     *  
     *  If the user enters a number outside that range the method should keep asking the user for an integer in that range until they enter the correct number. 
     *  Once the user enters the correct number, the method should return the users integer.
     */

        public static int getAnyIntFromUser(){
            Scanner _scanner = new Scanner(System.in);
            System.out.println("Please Enter a Integer");
            int userInt = _scanner.nextInt();
            return userInt;
        }

        public static int getPositiveIntFromUser(){
            Scanner _scanner = new Scanner(System.in);
            int userInt;
            do{
                System.out.println("Enter a positive Int");
                 userInt = _scanner.nextInt();
            }while(userInt < 0);
            return userInt;
        }

        public static int getRangeOfIntFromUser(int x, int y){
            Scanner _scanner = new Scanner(System.in);
            int maxInt = Math.max(x, y);
            int minInt = Math.min(x, y);
            int userInt;
            do{
              System.out.println("Please enter a number between " + maxInt + " and " + minInt);
              userInt = _scanner.nextInt();
                
            }while(userInt < minInt || userInt > maxInt);
            return userInt;
        }
}
