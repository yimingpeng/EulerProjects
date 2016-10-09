package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 2 of Project Euler
 * "Even Fibonacci numbers"
 * Link:
 *      https://projecteuler.net/problem=2
 * Status:
 *      Correct
 * Answer:
 *      sum = 4613732
 *
 * @author Yiming
 * @version 1.0.0
 * @date 9/10/16
 * @since 1.0.0
 */
public class Problem2 {
    public static int fibonacci(int i){
        if (i == 1){
            return 1;
        } else if(i == 2){
            return 2;
        }
        return fibonacci(i-2) + fibonacci(i-1);
    }

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int temp;
        do{
            temp = fibonacci(i);
            if (temp % 2 ==0) {
                sum += temp;
            }
            i++;
        } while (temp <= 4000000);
        System.out.printf("sum="+sum);
    }
}
