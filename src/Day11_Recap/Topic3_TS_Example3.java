package Day11_Recap;

import java.util.Scanner;

public class Topic3_TS_Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        System.out.println("Please enter number 1");
        int Number1 = scan.nextInt();

        System.out.println("Please enter number 2");
        int Number2 = scan.nextInt();

        System.out.println("Please enter number 3");
        int Number3 = scan.nextInt();

        System.out.println("Please enter number 4");
        int Number4 = scan.nextInt();
        
        double Total = Number1+Number2+Number3+Number4;
        System.out.println("Total = " + Total);

        double avarage = Total / 4;
        System.out.println("avarage = " + avarage);
        */
        double Total = 0;
        for(int i =1; i<=4; i=i+1){
            System.out.printf("Please enter number %d\n", i);
            int Number = scan.nextInt();
            Total = Total + Number;
            System.out.println("Total = " + Total);
        }
        double Avarage = Total / 4;
        System.out.println("Avarage = " + Avarage);
    }
}
