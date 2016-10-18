package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 14 of Project Euler
 * "Highly divisible triangular number"
 * Link:
 *      https://projecteuler.net/problem=14
 * Status:
 *      Correct
 * Answer:
 *      5537376230
 *
 * @author Yiming
 * @version 1.0.0
 * @date 18/10/16
 * @since 1.0.0
 */
public class Problem14 {
    private static int count = 0;

    private static long getSeqNum(long num){
        count++;
        if (num == 1){
            return 1;
        }
        if (num % 2 == 0){
            num = num/2;
        } else {
            num = 3 * num + 1;
        }
        return getSeqNum(num);
    }

    public static void main(String[] args) {
        int biggest = 0;
        long biggestIndex = 0L;
        for (long i = 1; i <= 1000000L; i++) {
            getSeqNum(i);
            if (count > biggest){
                biggest = count;
                biggestIndex = i;
            }
            count = 0;
        }
        System.out.println(biggestIndex);
    }
}
