public class PythagoreanTripletLong {
    /*
     * PROBLEM:
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     * a² + b² = c². There exists exactly one Pythagorean triplet for which 
     * a + b + c = 1000. Find the product abc.
     */

    private static final int TARGET_SUM = 1000;

    public static long findProductABC() {
        long prod = 0;
        for (int a = 1; a < TARGET_SUM / 3; a++) {
            long numerator = 500L * (TARGET_SUM - 2L * a);
            long denominator = TARGET_SUM - a;
            if (numerator % denominator == 0) {
                long b = numerator / denominator;
                long c = TARGET_SUM - a - b;
                    if ((long)a * a + b * b == c * c) 
                    {
                        prod = (long)a * b * c;
                        return prod;
                    }
                }
            }
            return 0; 
        }

    public static void main(String[] args) {        
        System.out.println(findProductABC());
    }    
}