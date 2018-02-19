package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerUtils {


    /**
     * @param n integer value input by client
     * @return the sum of all integers between 0 and not including `n`
     */
    public static Integer getSumOfN(Integer n) {
        int totalSum = 0;
        for (int i = 0; i <= n-1; i++){
            totalSum += i;
        }
        return totalSum;
    }

    /**
     * @param n integer value input by client
     * @return the product of all integers between 0 and not including `n`
     */
    public static Integer getProductOfN(Integer n) {
        int totalProduct = 1;
        for (int i = 1; i <= n; i++){
            totalProduct *= i;
        }
        return totalProduct;
    }

    /**
     * @param val integer value input by client
     * @return integer with identical digits in the reverse order
     */
    public static Integer reverseDigits(Integer val) {
        int reverseTheDigits = 0;
        int value = val;

        while (value != 0){
            reverseTheDigits = reverseTheDigits * 10 + value % 10;
            value = value / 10;
        }
        return reverseTheDigits;
    }
}
