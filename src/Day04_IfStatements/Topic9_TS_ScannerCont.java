package Day04_IfStatements;

import java.util.Scanner;

public class Topic9_TS_ScannerCont {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name and surname and hit enter");
        //nextInt is for reading integer
        //nextLine is for adding a string value
        String FullName = scan.nextLine();
        System.out.println("Welcome "+FullName);
        System.out.println("Please enter your job");

        String Job = scan.nextLine();
        System.out.println("Your job is "+Job);

    }
}
