package Day08_ForLoop;

import java.util.Scanner;

public class Topic6_TS_Example6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between 1-9");
        int MyNumber = scan.nextInt();

        for (int i = 1; i <9; i++) {
            System.out.printf("%d * %d = %d\n", MyNumber, i, MyNumber*i);
        }
    }
}
