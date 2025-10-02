package today;

import java.util.Scanner;

public class hackerrank3 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
            int number = stdIn.nextInt();
            Double decimal = stdIn.nextDouble();
            stdIn.nextLine();
            String text = stdIn.nextLine();
        stdIn.close();

        System.out.println("String: " + text + "\n" + "Double: " + decimal + "\n" + "Int: " + number);
    }
}
