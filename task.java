public class task {

    public static boolean isPalindrome(String text) {
        return text.equals(new StringBuilder(text).reverse().toString());
    }

    public static String firstWord(String[] word) {
        for (String kata : word) {
            if (isPalindrome(kata)) {
                return kata;
            }
        }
        return "";
    }
    
    public static void main(String[] args) {
        String[] example1 = {"abc","car","ada","racecar","cool"};
        String[] example2 = {"notapalindrome","racecar"};

        System.out.println(firstWord(example1));
        System.out.println(firstWord(example2)); 
    }
}
