package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 6 of Project Euler
 * "Sum square difference"
 * Link:
 *      https://projecteuler.net/problem=6
 * Status:
 *      Correct
 * Answer:
 *      25164150
 *
 * @author Yiming
 * @version 1.0.0
 * @date 11/10/16
 * @since 1.0.0
 */
public class Problem6 {
    private static int getSumSquared(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return (int)Math.pow(sum,2);
    }


    private static int getSquareSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += Math.pow(i,2);
        }
        return sum;
    }

    private static int getDifference(int num1, int num2){
        return Math.abs(num1 - num2);
    }

    public static void main(String[] args) {
        System.out.println("The difference: "+ getDifference(getSquareSum(100), getSumSquared(100)));
    }
}
