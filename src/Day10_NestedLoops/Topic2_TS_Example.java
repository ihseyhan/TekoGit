package Day10_NestedLoops;

import java.util.Scanner;

public class Topic2_TS_Example {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int Total = 0;
        for (int i = 0; i <= 5 ; i++) {
            System.out.println("Please enter a number");
            int Number = scan.nextInt();
            Total = Total + Number;
            System.out.println("Now total will become " +Total);

        }
        System.out.println("Average = "+ Total / 5);

    }
}
