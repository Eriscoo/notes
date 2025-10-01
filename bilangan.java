import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
            System.out.print("Masukkan nomor disini: ");
            int number = inputNumber.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " adalah bilangan genap.");
            } else {
                System.out.println(number + " adalah bilangan ganjil.");
            }
        inputNumber.close();
    }
}