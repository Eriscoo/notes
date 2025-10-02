package today;

import java.util.Scanner;

public class solution {

    public static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }
    
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);
            String thisText = inputText.nextLine();
        inputText.close();

        if (isPalindrome(thisText)) {
            System.out.println(thisText + " adalah Palindrome.");
        } else {
            System.out.println(thisText + " bukanlah Palindrome.");
        }
    }
}
