import java.util.Scanner;

public class palindrome {
    
    public static void main(String[] args) {
        Scanner textInput = new Scanner(System.in);
            System.out.print("Masukkan kata, frasa atau angka: ");
            String text = textInput.nextLine();

            if (text.equals(new StringBuilder(text).reverse().toString())) {
                System.out.println(text + " adalah Palindrome.");
            } else {
                System.out.println(text + " bukanlah Palindrome.");
            }
        textInput.close();
    }
}
