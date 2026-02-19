/*
use case 1: Application Entry point


public class PalindroneCheckerApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Palindrome Checker Management System" +
                "\nVersion : 1.0" +
                "\nSystem initialized successfully");
    }
}


 */

public class PalindroneCheckerApp {

    public static boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";

        System.out.println(word1 + " is a palindrome: " + isPalindrome(word1));
        System.out.println(word2 + " is a palindrome: " + isPalindrome(word2));
    }
}
