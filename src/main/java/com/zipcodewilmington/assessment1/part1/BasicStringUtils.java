package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String answer = str.substring(0, 1).toUpperCase() + str.substring(1);

        return answer;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String myReverseString = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            myReverseString = myReverseString + str.charAt(i);
        }
        return myReverseString;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String myReverseString = "";
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            myReverseString = myReverseString + str.charAt(i);
        }
        String myAnswer = myReverseString.substring(0, 1).toUpperCase() + myReverseString.substring(1);
        return myAnswer;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {

        String removedFirstLast = str.substring(1, str.length() - 1);
        return removedFirstLast;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] startingString = str.toCharArray();
        for (int i = 0; i < startingString.length; i++) {
            char tester = startingString[i];
            if (Character.isUpperCase(tester)) {
                startingString[i] = Character.toLowerCase(tester);
            } else if (Character.isLowerCase(tester)) {
                startingString[i] = Character.toUpperCase(tester);
            }
        }
        return new String(startingString);
    }
}
