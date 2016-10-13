package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 12 of Project Euler
 * "Highly divisible triangular number"
 * Link:
 *      https://projecteuler.net/problem=12
 * Status:
 *      Correct
 * Answer:
 *      76576500
 *
 * @author Yiming
 * @version 1.0.0
 * @date 13/10/16
 * @since 1.0.0
 */
public class Problem12 {
    private static long getNthTriangleNum(long num){
        return num * (num + 1)/2;
    }

    private static int countDivisors(long triangleNum){
        int count = 1;
        long result = 0L;
        for (int t = 2; t <= triangleNum; t++) {
            if (triangleNum % t == 0){
                if (count > 1 && result == t){
                    count *= 2;
                    break;
                }
                result = triangleNum/t;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        long num = 1;
        while (countDivisors(getNthTriangleNum(num)) <= 500){
            num++;
        }
        System.out.println("Final:\n"+getNthTriangleNum(num) + ":"+ countDivisors(getNthTriangleNum(num)));
    }
}
