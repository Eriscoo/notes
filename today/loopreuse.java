package today;

import java.util.Scanner;

public class loopreuse {
    
    public static void isLoop(int N) {
        for (int i = 1; i <= 10; i++) {
            int result = N * i;
            System.out.println(N + " x " + i + "=" + result);
        }
    }

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
            int N = inputNumber.nextInt();
        inputNumber.close();

        isLoop(N);
    }
}
