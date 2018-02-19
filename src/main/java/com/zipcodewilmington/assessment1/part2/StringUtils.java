package com.zipcodewilmington.assessment1.part2;

/**
 * Created by leon on 2/16/18.
 */
public class StringUtils {

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return an array of strings, representative of each word in the sentence
     * given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence
     */
    public static String[] getWords(String sentence) {
       String[] arrayOfWords = sentence.split(" ");
       return arrayOfWords;
    }


    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence
     * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence
     */
    public static String getFirstWord(String sentence) {
        String[] arrayOfWords = sentence.split(" ");
        return arrayOfWords[0];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order
     */
    public static String reverseFirstWord(String sentence) {
        String myReverseString = "";
        int length = sentence.length();
        for (int i = length - 1; i >= 0; i--) {
            myReverseString = myReverseString + sentence.charAt(i);
        }

        String[] arrayOfWords = myReverseString.split(" ");
        return arrayOfWords[arrayOfWords.length-1];
    }

    /**
     * @param sentence a string containing words delimited by spaces, representative of a sentence
     * @return the first word in the specified sentence, with identical contents in reverse order and the first character capitalized
     * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized
     */
    public static String reverseFirstWordThenCamelCase(String sentence) {
        String myReverseString = "";
        int length = sentence.length();
        for (int i = length - 1; i >= 0; i--) {
            myReverseString = myReverseString + sentence.charAt(i);
        }
        String[] arrayOfWords = myReverseString.split(" ");
        String camelCaseThis = arrayOfWords[arrayOfWords.length-1];
        camelCaseThis = camelCaseThis.substring(0, 1).toUpperCase() + camelCaseThis.substring(1);
        return camelCaseThis;
    }


    /**
     * @param str string input from client
     * @param index the index of the character to be removed from `str`
     * @return string with identical contents, excluding the character at the specified index
     * given a string and index, return an identical string excluding the character at the specified index
     */
    public static String removeCharacterAtIndex(String str, int index) {
        StringBuilder removedCharacter = new StringBuilder(str);
        removedCharacter.deleteCharAt(index);
        String finalAnswer = removedCharacter.toString();
        return finalAnswer;
    }

}
