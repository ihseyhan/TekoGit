package Day09_WhileLoop;

import java.util.Scanner;

public class Topic7_TS_WhileLoopExamples2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int Number1 = scan.nextInt();
        System.out.println("Please enter the second number");
        int Number2 = scan.nextInt();

        int i = Number1;
        int Sum = 0;
        while(i <= Number2){

        Sum = Sum + i;

            i++;
        }
        System.out.println("Sum = " + Sum);

    }
}
