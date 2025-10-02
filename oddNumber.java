import java.util.Scanner;

public class oddNumber {
    
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
            int thisNumber = inputNumber.nextInt();
        inputNumber.close();

        if (isOdd(thisNumber)) {
            System.out.print("weird");
        } else {
            if (thisNumber >= 2 && thisNumber <= 5) {
                System.out.println("not weird");
            } else if (thisNumber >= 6 && thisNumber <= 20) {
                System.out.println("weird");
            } else if (thisNumber > 20 && thisNumber <= 100) {
                System.out.println("not weird");
            }
        }
    }
}
