package today;

import java.util.Scanner;

public class hackerrank1 {
    
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main (String[] args) {
        Scanner inputNumber = new Scanner(System.in);
            System.out.print("Input the number: ");
            int thisNumber = inputNumber.nextInt();
        inputNumber.close();

        if (isOdd(thisNumber)) {
            System.out.println("Weird");
        } else {
            if (thisNumber >= 2 && thisNumber <= 5) {
                System.out.println("Not Weird");
            } else if (thisNumber >= 6 && thisNumber <= 20) {
                System.out.println("Weird");
            } else if (thisNumber > 20 && thisNumber <= 100) {
                System.out.println("Not Weird");
            }
        }
    }
}
