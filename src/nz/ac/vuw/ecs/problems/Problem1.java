package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 1 in project euler.
 * Link:
 *  https://projecteuler.net/problem=1
 * Status:
 *     Correct
 * Answer:
 *      233168
 * @author Yiming
 * @version 1.0.0
 * @date 7/10/16
 * @since 1.0.0
 */
public class Problem1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.printf("sum=" + sum);
    }
}
