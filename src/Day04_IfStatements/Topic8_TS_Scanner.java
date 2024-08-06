package Day04_IfStatements;

import java.util.Scanner;

public class Topic8_TS_Scanner {
    public static void main(String[] args) {
        //Scanner
        //We will get a value from user
        Scanner scan = new Scanner(System.in); //Creating a scanner object

        System.out.println("Please enter a number");

        int a = scan.nextInt();

        System.out.println("a = " + a);
    }
}
