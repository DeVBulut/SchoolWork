import java.util.Scanner;
public class NestedWhileLoops{

    public static void main(String args[]){

        Scanner _scan = new Scanner(System.in);

        System.out.println("Login Loop");
        String username, password;
        do{
            System.out.println("Enter Username and Password");
            username = _scan.nextLine();
            password = _scan.nextLine();
            if(!username.equals("Dr") && !password.equals("B")){
            System.out.println("Invalid User");
            }
        }while(!username.equals("Dr") && !password.equals("B"));


        System.out.println("Star Pattern");

        int row, column;
        row = _scan.nextInt();
        column = _scan.nextInt();

        int i = 1, a = 1;
        while(i <= row){
            
            while(a <= column){
                a++;
                System.out.print("*");
            }
            a = 1;
            System.out.println();
            i++;
        }
     

        System.out.println("Rewritten 3");

        int nn = 1, oo = 1, gg = 20;
        while(nn <= 20){
            
            while(oo < nn){
                oo++;
                System.out.print(" ");
            }
            oo = 1;
            while(gg >= nn){
                gg--;
                System.out.print("*");
            }
            gg = 20;
            nn++;
            System.out.println();
        }

        System.out.println("Rewritten 4");
        int ii = 0, aa = 20, jj = 0;
        while(ii <= 20){

            while( aa > ii){
                aa--;
                System.out.print(" ");
            }

            while(jj < ii){
                jj++;
                System.out.print("*");
            }
            aa = 20;
            jj = 0;
            ii++;
            System.out.println();
        }

        System.out.println("Rewritten 5");
        int iii = 0, aaa = 20, jjj = 0, kll = 20, uuu = 40;
        while(iii <= 40){
            if(iii <= 20){
                while( aaa > iii){
                      aaa -=2;
                      System.out.print(" ");  
                 }
                 aaa = 20;

            while(jjj <= iii){
                   if(iii % 2 == 0){
                           System.out.print("*"); 
                    }
                    jjj+=1;
            }
            jjj = 0;
            }
            
            else{ 

                while(kll < iii){
                       System.out.print(" ");
                       kll+=2;
                }
                kll = 20;

             while(uuu >= iii){
                    if(i % 2 == 0){
                        System.out.print("*"); 
                 }
                 uuu -=1;
                }
                uuu = 40;
            
           }
           iii+=2;
           System.out.println();
        }
        _scan.close();
    }
}