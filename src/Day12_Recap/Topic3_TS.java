package Day12_Recap;

import java.util.Scanner;

public class Topic3_TS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        int sum = 0;

        while(Number > 0){
            int Remainder = Number % 10;
            sum = sum + Remainder;
            Number /=10; //Number = number / 10;
            
        }
        System.out.println("sum = " + sum);
    }
}
