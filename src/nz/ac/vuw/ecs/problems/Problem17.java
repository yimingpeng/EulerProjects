package nz.ac.vuw.ecs.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents the problem 17 of Project Euler
 * "Number letter counts"
 * Link:
 *      https://projecteuler.net/problem=17
 * Status:
 *      Correct
 * Answer:
 *      1366
 *
 * @author Yiming
 * @version 1.0.0
 * @date 21/10/16
 * @since 1.0.0
 */
public class Problem17 {
    private static Map<Integer, String> numMaps;

    static{
        numMaps  = new HashMap<Integer, String>();
        numMaps.put(1, "one");
        numMaps.put(2, "two");
        numMaps.put(3, "three");
        numMaps.put(4, "four");
        numMaps.put(5, "five");
        numMaps.put(6, "six");
        numMaps.put(7, "seven");
        numMaps.put(8, "eight");
        numMaps.put(9, "nine");
        numMaps.put(10, "ten");
        numMaps.put(11, "eleven");
        numMaps.put(12, "twelve");
        numMaps.put(13, "thirteen");
        numMaps.put(14, "fourteen");
        numMaps.put(15, "fifteen");
        numMaps.put(16, "sixteen");
        numMaps.put(17, "seventeen");
        numMaps.put(18, "eighteen");
        numMaps.put(19, "nineteen");
        numMaps.put(20, "twenty");
        numMaps.put(30, "thirty");
        numMaps.put(40, "forty");
        numMaps.put(50, "fifty");
        numMaps.put(60, "sixty");
        numMaps.put(70, "seventy");
        numMaps.put(80, "eighty");
        numMaps.put(90, "ninety");
    }

    @SuppressWarnings("Duplicates")
    private static int getSum(){
        int sum = 0;
        int unit = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;
        for (int i = 1; i <= 1000; i++) {
            //The first twenty numbers
            if (i <= 20){
                sum+= numMaps.get(i).length();
            } else if (i < 100){
                //consider tens
                if (i % 10 == 0){
                    sum += numMaps.get(i).length();
                }else {
                    // the rest numbers smaller than 100
                    unit = i % 10;
                    tens = (i / 10) * 10;
                    //1 represents the hyphen.
                    sum += numMaps.get(unit).length() + numMaps.get(tens).length();
                }
            } else if (i < 1000){
                //consider hundreds
                if (i % 100 == 0){
                    hundreds = i/100;
                    sum += numMaps.get(hundreds).length() + "hundred".length();
                } else {
                    hundreds = i/100;
                    sum += numMaps.get(hundreds).length() + "hundred".length() + "and".length();
                    tens = i%100;
                    if (tens <= 20){
                        sum += numMaps.get(tens).length();
                    } else if (tens > 20){
                        if (tens % 10 == 0){
                            sum += numMaps.get(tens).length();
                        } else {
                            unit = tens % 10;
                            tens = (tens / 10) * 10;
                            sum += numMaps.get(unit).length() + numMaps.get(tens).length();
                        }
                    }
                }
            } else {
                //consider thousands
                thousands = i/1000;
                sum += numMaps.get(thousands).length() + "thousand".length();
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getSum());
    }
}
