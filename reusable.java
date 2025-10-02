import java.util.Scanner;

public class reusable {
    
    // Reusable function untuk cek bilangan genap
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Masukkan nomor disini: ");
        int number = inputNumber.nextInt();

            // Gunakan reusable function
            if (isEven(number)) {
                System.out.println(number + " adalah bilangan genap.");
            } else {
                System.out.println(number + " adalah bilangan ganjil.");
            }

            // Contoh lain: print semua bilangan genap dari 1 sampai 100
            System.out.println("Bilangan genap dari 1 sampai 100:");
            for (int i = 1; i <= 100; i++) {
                if (isEven(i)) {
                    System.out.println(i + " ");
                }
            }

        inputNumber.close();
    }
}
