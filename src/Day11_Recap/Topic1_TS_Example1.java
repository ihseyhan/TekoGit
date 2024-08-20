package Day11_Recap;

import java.util.Scanner;

public class Topic1_TS_Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your birth year?");
        int Birthyear = scan.nextInt();
        int Age = 2024 - Birthyear; //onemli he bu

            if (Age >= 19) {
                System.out.println("You can buy liquor");
            } else {
            //    System.out.println("You can not buy liquor now. But you can buy " +(19-Age)+ " years later");
                System.out.printf("You can not buy liquor now. But you can buy %d years later" , 19-Age);
            }
        }
    }


