package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 10 of Project Euler
 * "Summation of primes"
 * Link:
 *      https://projecteuler.net/problem=10
 * Status:
 *      Correct
 * Answer:
 *      142913828922
 *
 * @author Yiming
 * @version 1.0.0
 * @date 12/10/16
 * @since 1.0.0
 */
public class Problem10 {
    private static boolean isPrime(int num){
        if (num%2==0 && num != 2) return false;
        for (int i = 3; i*i <= num; i+=2) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }

    private static long sumAllPrimes(int upper) {
        long sum = 0L;
        for (int i = 2; i <= upper; i++){
            if (isPrime(i)){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumAllPrimes(2000000));
    }
}
