class IntegerPairs {
    public static void main(String[] args) {
        for (int a = 1; a < 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int numerator = a * a + b * b + 1;
                int denominator = a * b;
                if (numerator % denominator == 0) {
                    System.out.println("a = " + a + ", b = " + b);
                }
            }
        }
    }
}