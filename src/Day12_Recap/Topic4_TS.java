package Day12_Recap;

import java.util.Scanner;

public class Topic4_TS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth year");
        int Birthyear = scan.nextInt();
        int Age = 2024 - Birthyear;
        System.out.println(Age);
        int MyLuckyNumber = 21;


        if (Age < 18) {
            System.out.println("Sorry, you can not join the lottery");
        } else {
            System.out.println("Please enter your lucky number");
            int YourLuckyNumber = scan.nextInt();

            if (MyLuckyNumber == YourLuckyNumber) {
                System.out.println("Congrats you won 1 million dollar");
            } else {
                System.out.println("Please try again");

            }
        }
    }
}
