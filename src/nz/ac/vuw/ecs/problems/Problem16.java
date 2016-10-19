package nz.ac.vuw.ecs.problems;

import java.math.BigInteger;

/**
 * This class represents the problem 16 of Project Euler
 * "Power digit sum"
 * Link:
 *      https://projecteuler.net/problem=16
 * Status:
 *      Correct
 * Answer:
 *      1366
 *
 *
 * @author Yiming
 * @version 1.0.0
 * @date 20/10/16
 * @since 1.0.0
 */
public class Problem16 {
    private static BigInteger getSum(int num){
        BigInteger tmp = new BigInteger("2");
        tmp = tmp.pow(num);
        BigInteger result =  new BigInteger("0");
        while(tmp.divide(new BigInteger("10")).intValue() != 0 || tmp.intValue() != 0){
            result = result.add(tmp.remainder(new BigInteger("10")));
            tmp = tmp.divide(new BigInteger("10"));
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getSum(1000));
    }
}
