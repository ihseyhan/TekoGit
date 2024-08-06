package Day06_StringAndStringMethods;

import java.util.Scanner;

public class Topic2_TS_ScannerCalculator {
    public static void main(String[] args) {
        /*
        lets create a calculator
        lets ask user ti enter first number
        lets ask user ti enter second number
        lets ask operation
       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number");
        int FirstNumber = scan.nextInt();
        System.out.println("Please enter second number");
        int SecondNumber = scan.nextInt();

        System.out.println("Please choose the opeartion: \n1 for Multiplication \n2 for division \n3 for addition \n4 for subtraction \n5 for mod");
        int Operation = scan.nextInt();

        switch (Operation){
            case 1:
                System.out.printf("The result is %d", FirstNumber * SecondNumber);
                break;
            case 2:
                System.out.printf("The result of division is %d", FirstNumber / SecondNumber);
                break;
            case 3:
                System.out.printf("The result of addition is %d", FirstNumber - SecondNumber);
                break;
            case 4:
                System.out.printf("The result of subtraction is %d", FirstNumber - SecondNumber);
                break;
            case 5:
                System.out.printf("The result of mod %d", FirstNumber % SecondNumber);
                break;
            default:
                System.out.println("Invalid Option");
                break;
            /*
            %s = string
            %d = numeric
            %f = double
             */
        }

    }
}
