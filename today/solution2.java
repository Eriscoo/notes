package today;

import java.util.Scanner;

public class solution2 {
    
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
            System.out.print("Input the number: ");
            int thisNumber = inputNumber.nextInt();
        inputNumber.close();

        if (isEven(thisNumber)) {
            System.out.println(thisNumber + " adalah bilangan genap.");
        } else {
            System.out.println(thisNumber + " adalah bilangan ganjil.");
        }
    }
}
