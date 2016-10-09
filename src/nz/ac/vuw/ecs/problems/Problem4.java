package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 4 of Project Euler
 * "Largest palindrome product"
 * Link:
 *      https://projecteuler.net/problem=4
 * Status:
 *      Correct
 * Answer:
 *      906609 = 993 * 913
 *
 * @author Yiming
 * @version 1.0.0
 * @date 9/10/16
 * @since 1.0.0
 */
public class Problem4 {
    private static StringBuilder output = new StringBuilder();
    private static void findAllPalindromicNumbers(int digits){
        for (int i = (int)Math.pow(10, digits*2) - 1; i > (int)Math.pow(10, digits*2-1); i--) {
            if (isPlaindromic(i)){
                for (int j = (int)Math.pow(10, digits) - 1; j > (int)Math.pow(10, digits - 1); j--) {
                    if (i % j == 0 && getDigits(i/j) == digits){
                        output.append(String.format("%d = %d * %d\n", i, j, i/j));
                    }
                }
            }
        }
    }

    private static int getDigits(int num){
        int temp = num;
        int count = 1;
        do{
            count++;
            temp = temp/10;
        }while(temp/10 != 0);

        return count;
    }

    private static boolean isPlaindromic(int num){
        int digits = getDigits(num);
        if (num < 2){
            throw new IllegalArgumentException("1-digit number can't be palindromic!");
        }
        int[] array = new int[digits];
        int temp = num;
        for (int i = 0; i < digits; i++) {
            array[i] = temp%((int)Math.pow(10, 1));
            temp = temp / ((int)Math.pow(10, 1));
        }

        int count = 0;
        for (int i = 0; i < digits/2; i++) {
            if (array[i] == array[digits-i-1]){
                count++;
            }
        }
        return count >= digits/2;
    }

    public static void main(String[] args) {
        //System.out.println(isPlaindromic(99099));
        int digits = 3;
        findAllPalindromicNumbers(digits);
        //System.out.println(output);
        System.out.println("Largest palindrome number from the product of two "+ digits +"-digit numbers is " +
                output.substring(0, 19));
    }
}
