package Day09_WhileLoop;

import java.util.Scanner;

public class Topic1_TS_Example1 {
    public static void main(String[] args) {
        /*
        Get 2 numbers from user
        count how many number we have
        count the number that can divided by 3
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int Start = scan.nextInt();
        System.out.println("Please enter second number");
        int End = scan.nextInt();
        int Count = 0;
        for (int i = Start ; i <= End; i++) {

            if(i % 3 == 0){
                System.out.println(i+ " can be divided by 3");
                Count = Count + 1;
            }
        }
        System.out.println("Count = "+Count);

    }
}
