package nz.ac.vuw.ecs.problems;

/**
 * This class represents the problem 8 of Project Euler
 * "Largest product in a series"
 * Link:
 *      https://projecteuler.net/problem=8
 * Status:
 *      Correct
 * Answer:
 *      23514624000
 *
 * @author Yiming
 * @version 1.0.0
 * @date 11/10/16
 * @since 1.0.0
 */
public class Problem8 {

    private static String getProduct(int digitIndex){
        char[] subArray;
        long product = 1L;
        StringBuilder stringBuilder = new StringBuilder();
        char[] result = new char[digitIndex];
        long productResult = 1L;
        boolean breakPoint = false;
        String strNum = "73167176531330624919225119674426574742355349194934" +
                "96983520312774506326239578318016984801869478851843" +
                "85861560789112949495459501737958331952853208805511" +
                "12540698747158523863050715693290963295227443043557" +
                "66896648950445244523161731856403098711121722383113" +
                "62229893423380308135336276614282806444486645238749" +
                "30358907296290491560440772390713810515859307960866" +
                "70172427121883998797908792274921901699720888093776" +
                "65727333001053367881220235421809751254540594752243" +
                "52584907711670556013604839586446706324415722155397" +
                "53697817977846174064955149290862569321978468622482" +
                "83972241375657056057490261407972968652414535100474" +
                "82166370484403199890008895243450658541227588666881" +
                "16427171479924442928230863465674813919123162824586" +
                "17866458359124566529476545682848912883142607690042" +
                "24219022671055626321111109370544217506941658960408" +
                "07198403850962455444362981230987879927244284909188" +
                "84580156166097919133875499200524063689912560717606" +
                "05886116467109405077541002256983155200055935729725" +
                "71636269561882670428252483600823257530420752963450";
        for (int i = 0; i < strNum.length(); i++) {
            if (i+digitIndex < strNum.length() - 1){
                subArray = strNum.substring(i,i+digitIndex).toCharArray();
            } else {
                subArray = strNum.substring(i, strNum.length() - 1).toCharArray();
                breakPoint = true;
            }
            for (char aSubArray : subArray) {
                product *= Character.getNumericValue(aSubArray);
            }
            if (productResult <= product){
                productResult = product;
                result = subArray.clone();
            }
            product = 1L;
            if (breakPoint){
                break;
            }
        }
        for (int i = 0; i < result.length; i++) {
            stringBuilder.append(String.format("%c", result[i]));
            if (i != result.length-1){
                stringBuilder.append("*");
            }
        }
        stringBuilder.append(String.format("=%d",productResult));
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(getProduct(13));
    }
}
