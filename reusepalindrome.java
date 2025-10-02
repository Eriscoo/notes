public class reusepalindrome {
    
    // Reusable function untuk cek palindrome
    public static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static void main(String[] args) {
        String text = "kodok";

        // Gunakan reusable function
        if (isPalindrome(text)) {
            System.out.println(text + " adalah Palindrome.");
        } else {
            System.out.println(text + " bukanlah Palindrome.");
        }
    }
}
