package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 5 of Project Euler ()
 * "Smallest multiple":
 * Description:
 *      2520 is the smallest number that can be divided by
 *      each of the numbers from 1 to 10 without any remainder.
 *      What is the smallest positive number that is evenly divisible
 *      by all of the numbers from 1 to 20?
 *
 * Link:
 *      https://projecteuler.net/problem=5
 * Status:
 *      Correct
 * Answer: (silly solution)
 *      232792560
 *
 * @author Yiming
 * @version 1.0.0
 * @date 10/10/16
 * @since 1.0.0
 */
public class Problem5 {
    private static long getSmallestMultiple(int range){
        int count = 0;
        long result = 0L;
        for (long i = 1; i <= 10000000000000L; i++) {
            for (int j = 1; j <= range; j++) {
                if (i%j == 0){
                    count++;
                }
            }
            if (count >= range){
                result = i;
                break;
            }else {
                count = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getSmallestMultiple(20));
    }
}
