package nz.ac.vuw.ecs.problems;


import java.util.ArrayList;

/**
 * This class represents the problem 3 of Project Euler
 * "Largest prime factor"
 * Link:
 *      https://projecteuler.net/problem=3
 * Status:
 *      Correct
 * Answer:
 *      sum = 6857
 *
 * @author Yiming
 * @version 1.0.0
 * @date 9/10/16
 * @since 1.0.0
 */
public class Problem3 {
    private static ArrayList<Integer> list = new ArrayList<Integer>();

    private static void primeFactorization(long num){
        int i = 2;
        long temp = num;
        do {
            if (temp % i == 0 && isPrime(i)){
                list.add(i);
                temp = temp/i;
                i = 1;
            }
            i++;
        }while(i<=temp);
    }

    private static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if ( num % i == 0){
                count++;
            }
        }
        return count <= 2;
    }

    public static void main(String[] args) {
        primeFactorization(600851475143L);
        for (Integer num:list
             ) {
            System.out.println(num.intValue());
        }
        System.out.println("The largest prime factor is "+ list.get(list.size() - 1));
    }
}
