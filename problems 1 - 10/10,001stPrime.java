public class 10001stPrime {

    /* PROBLEM:
     * By listing the first six terms prime numbers: 2, 3, 5, 7, 11, and 13, we
     * can see that the 6th prime is 13. What is the 10,001st prime number?
     */

    public static void main(String[] args) {
        int count = 1;
        int num = 1;
        int prime = 2;

        while (count < 10001) {
            num += 2; 
            if (isPrime(num)) {
                count++;
                prime = num;
            }
        }

        System.out.println(prime);
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}