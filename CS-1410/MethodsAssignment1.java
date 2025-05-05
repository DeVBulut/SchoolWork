/**
 * This class contains the methods for Chapter 5 Programming Assignment 1. 
 * 
 * @author 
 * @version
 *
 */
public class MethodsAssignment1 {

    /**
     * This is the main method.
     * 
     * @param args These are never used.
     */
    public static void main(String[] args) {
        System.out.println("Testing the maxFloat method");
        for(int i = 0; i < 5; i++) {
            float f1 = (float) (((int)(Math.random()*10000))/100.0);
            float f2 = (float) (((int)(Math.random()*10000))/100.0);
            float result = 0.0f;
            System.out.println("\tCalling the maxFloat method with " + f1 + " and " + f2);
            result = maxFloat(f1, f2);
            
            System.out.println("\t\tResult = " + result);
        }


        System.out.println("Testing the maxMixed method");
        for(int i = 0; i < 5; i++) {
            int theInt = (int) (Math.random()*100);
            float f2 = (float) (((int)(Math.random()*10000))/100.0);
            float result = 0.0f;
            System.out.println("\tCalling the maxMixed method with " + theInt + " and " + f2);
            result = maxMixed(theInt, f2);
            
            System.out.println("\t\tResult = " + result);
        }

        System.out.println("Testing the maxDoubles method");
        for(int i = 0; i < 5; i++) {
            double arg1 = (((int)(Math.random()*1000000))/10000.0);
            double arg2 = (((int)(Math.random()*1000000))/10000.0);
            String result = "";
            System.out.println("\tCalling the maxDoubles method with " + arg1 + " and " + arg2);
            result = maxDoubles(arg1, arg2);
            
            System.out.println("\t\tResult = " + result);
        }

        System.out.println("Testing the maxOfThree method");
        for(int i = 0; i < 5; i++) {
            double theDouble = (((int)(Math.random()*1000000))/10000.0);
            float f2 = (float) (((int)(Math.random()*10000))/100.0);
            int theInt = (int) (Math.random()*100);
            double result = 0.0;
            System.out.println("\tCalling the maxDoubles method with " + theDouble + ", " + f2 +" and " + theInt);
            result = maxOfThree(theDouble, f2, theInt);
            
            System.out.println("\t\tResult = " + result);
        }
    }
    public static float maxFloat(float x, float y){

        return Math.max(x, y);
    }
    public static float maxMixed(int x, float y) {
        float floatX = (float) x;
        return Math.max(floatX, y);
    }

    public static String maxDoubles(double x, double y) {
        
        double max_Double = Math.max(x, y);
        double min_Double = Math.min(x, y);
        String endResult = max_Double + " is larger than " + min_Double;
        return endResult;
    }
    
    public static double maxOfThree(double x, float y, int z) {
        double firstMax = Math.max(z, y);
        return Math.max(firstMax, x);
    }

}
