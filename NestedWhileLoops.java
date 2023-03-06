import java.util.Scanner;
public class NestedWhileLoops{

    public static void main(String args[]){

        Scanner _scan = new Scanner(System.in);
        System.out.println("Login Loop");

        
        // String username, password;
        // do{
        //     System.out.println("Enter Username and Password");
        //     username = _scan.nextLine();
        //     password = _scan.nextLine();
        //     if(!username.equals("Dr") && !password.equals("B")){
        //     System.out.println("Invalid User");
        //     }
        // }while(!username.equals("Dr") && !password.equals("B"));

        System.out.println("Star Pattern");

        int row, column;
        row = _scan.nextInt();
        column = _scan.nextInt();

        // for(int i = 1; i <= row; i++){
        //     for(int a = 1; a <= column; a++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        int i = 1, a = 1;
        while(i <= row){
            i++;
            while(a <= column){
                
            }
        }
    }

}