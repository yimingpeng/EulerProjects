package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 7 of Project Euler
 * "10001st prime"
 * Link:
 *      https://projecteuler.net/problem=7
 * Status:
 *      Correct
 * Answer:
 *      104743
 *
 * @author Yiming
 * @version 1.0.0
 * @date 11/10/16
 * @since 1.0.0
 */
public class Problem7 {
    private static boolean isPrime(int num){
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
    private static int getNthPrime(int index){
        int i = 2;
        int count = 1;
        int result = 0;
        while (count <= index){
            if (isPrime(i)){
                count++;
                result = i;
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        int index = 10001;
        System.out.println("The "+index+"-th prime is " + getNthPrime(index));
    }
}
