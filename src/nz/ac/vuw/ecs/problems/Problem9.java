package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 9 of Project Euler
 * "Special Pythagorean triplet"
 * Link:
 *      https://projecteuler.net/problem=9
 * Status:
 *      Correct
 * Answer:
 *      31875000
 *
 * @author Yiming
 * @version 1.0.0
 * @date 12/10/16
 * @since 1.0.0
 */
public class Problem9 {
    private static boolean isPythagoreenTriplet(int a, int b, int c){
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    private static long getResult(){
        int c;
        long result = 0;
        for (int a = 1; a <= 1000; a++) {
            for (int b = 1; b <= 1000; b++) {
                c = 1000 - a - b;
                if (isPythagoreenTriplet(a,b,c)){
                    result = a * b * c;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getResult());
    }
}
