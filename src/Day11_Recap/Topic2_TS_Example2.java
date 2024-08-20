package Day11_Recap;

import java.util.Scanner;

public class Topic2_TS_Example2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        if (Number % 2 == 0 && Number % 5 == 0){
            System.out.printf("%d is divisible by 2 and 5 same time ", Number);
        }else{
            System.out.printf("%d is not divisible by 2 and 5", Number);
        }

    }
}
