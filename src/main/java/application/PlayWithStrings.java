package application;

import java.util.Arrays;

public class PlayWithStrings {
    public static void main(String[] args) {
        //System.out.println("Hello String World");
        String name = "Robert i";
        String name2 = "itrebor";


        printIntitials(name, name2);
        System.out.println(areAnagrams(name, name2));

//        System.out.println(newName.compareTo(newName2));
//
//
//        System.out.println(newName);
//        System.out.println(newName2);
    }

    /**
     * TODO: print initials
     * <p>
     * This method should print out the initials of a name to standard out.
     *
     * @param firstname
     * @param lastname
     */
    public static void printIntitials(String firstname, String lastname) {
//		System.out.println(firstname.substring(0,1) + lastname.substring(0,1));
        StringBuilder builder = new StringBuilder();
        builder.append(firstname.substring(0, 1));
        builder.append((lastname.substring(0, 1)));
        System.out.println(builder);
    }

    /**
     * TODO: check for anagrams
     * <p>
     * This method should determine if two strings are anagrams or not. An anagram is
     * a word or a phrase made by transposing the letters of another word or phrase.
     * For example, "parliament" is an anagram of "partial men," and "software" is
     * an anagram of "swear oft." The program should ignore white space and
     * punctuation.
     *
     * @param value1
     * @param value2
     * @return true if the values are anagrams, false otherwise.
     */
    public static boolean areAnagrams(String value1, String value2) {
        value1 = value1.replaceAll(" ", "").toLowerCase();
        value2 = value2.replaceAll(" ", "").toLowerCase();
        if (value1.length() == value2.length()) {
            char[] arr1 = value1.toCharArray();
            char[] arr2 = value2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                return true;
            }
//            System.out.println(arr1);
//            System.out.println(arr2);
        } else {
            return false;
        }
        return true;
    }

    /**
     * TODO: palindrone checker
     * <p>
     * This method should find out if a string value is a palindrome or not. A
     * palindrome is a sequence of characters (can also be a number) which reads the
     * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
     * bees in a cave?
     * <p>
     * Upper or lower case should not matter, but keep the white spaces, tabs and
     * punctuation in mind.
     *
     * @param value
     * @return true if it is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(String value) {
        return false;
    }
}
