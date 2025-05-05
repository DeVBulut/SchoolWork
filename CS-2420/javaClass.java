public class javaClass{

    public static void main(String[] args)
    {
        ArrayStack ar = new ArrayStack();
        ListStack ls = new ListStack();

        double startTime = System.nanoTime();

            for (int i = 0; i < 100; i++) {
                ar.push(Math.random());
            }

            for (int i = 0; i < 100; i++) {
                ar.pop();
            }

        System.out.println("ArrayStack operation took " + (System.nanoTime() - startTime));

        ar.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                ar.push(Math.random());
            }

            for (int i = 0; i < 1000; i++) {
                ar.pop();
            }
        
        System.out.println("ArrayStack operation took " + (System.nanoTime() - startTime));

        ar.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 10000; i++) {
                ar.push(Math.random());
            }

            for (int i = 0; i < 10000; i++) {
                ar.pop();
            } 

        System.out.println("ArrayStack operation took " + (System.nanoTime() - startTime));

        ar.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 100000; i++) {
                ar.push(Math.random());
            }

            for (int i = 0; i < 100000; i++) {
                ar.pop();
            }

        System.out.println("ArrayStack operation took " + (System.nanoTime() - startTime));

        ar.makeEmpty();


        // now for ls

        startTime = System.nanoTime();

            for (int i = 0; i < 100; i++) {
                ls.push(Math.random());
            }

            for (int i = 0; i < 100; i++) {
                ls.pop();
            }

        System.out.println("ListStack operation took " + (System.nanoTime() - startTime));

        ls.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 1000; i++) {
                ls.push(Math.random());
            }
        

            for (int i = 0; i < 1000; i++) {
                ls.pop();
            }
        System.out.println("ListStack operation took " + (System.nanoTime() - startTime));

        ls.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 10000; i++) {
                ls.push(Math.random());
            }

            for (int i = 0; i < 10000; i++) {
                ls.pop();
            }

        System.out.println("ListStack operation took " + (System.nanoTime() - startTime));

        ls.makeEmpty();
        startTime = System.nanoTime();

            for (int i = 0; i < 100000; i++) {
                ls.push(Math.random());
            }

            for (int i = 0; i < 100000; i++) {     
                ls.pop();
            }

        System.out.println("ListStack operation took " + (System.nanoTime() - startTime));

        ls.makeEmpty();
      
    }
}