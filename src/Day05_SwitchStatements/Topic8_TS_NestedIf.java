package Day05_SwitchStatements;

import java.util.Scanner;

public class Topic8_TS_NestedIf {
    public static void main(String[] args) {
        /*
        If number is zero just print
        If number is even and less than 50 double it
        If number is odd and less than 70 triple
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        if (Number == 0) {
            System.out.println("Number = " + Number);
        } else if (Number % 2 == 0) {
            if (Number < 50) {
                Number = Number * 2;
                System.out.println("Number = " + Number);
            } else
                Number = Number * 3;
                System.out.println("Number = " + Number);
            }else{

                if (Number < 70) {
                    Number = Number * 3;
                } else {
                    Number = Number / 2;
                }
                Number = (Number < 70) ? Number * 3 : Number /2;
            }

        }


    }

