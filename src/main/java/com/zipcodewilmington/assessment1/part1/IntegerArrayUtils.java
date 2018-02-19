package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int myArraySum = 0;
        for (int i: intArray)
            myArraySum += i;
        return myArraySum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int myArrayProduct =1;
        for (int i: intArray)
            myArrayProduct *= i;
        return myArrayProduct;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double myArrayAverage =0.0;
        for (int i: intArray)
            myArrayAverage += i;


           Double averageAnswer =  (myArrayAverage / intArray.length);
        return averageAnswer;
    }
}
