package Day05_SwitchStatements;

import java.util.Scanner;

public class Topic4_TS_SwitchCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age");
        int Age = scan.nextInt();

        switch(Age){
            case 16:
                System.out.println("You are under 18");
                break;
            case 18:
                System.out.println("You are eligible for vote!");
                break;
            case 65:
                System.out.println("You are senior citizen!");
                break;
            default:
                System.out.println("Please enter valid age");
                break;

        }

    }
}
