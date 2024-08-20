package Day11_Recap;

import java.util.Scanner;

public class Topic5_TS_Ex5 {
    public static void main(String[] args) {
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Angle 1");
        int Angle1 = scan.nextInt();

        System.out.println("Please enter Angle 2");
        int Angle2 = scan.nextInt();

        System.out.println("Please enter Angle 3");
        int Angle3 = scan.nextInt();
        int Total = 180;
        if(Total==180){
            System.out.println("it is equal");
        }else if (Total<=179){
            System.out.println("it is not equal");

         */
        Scanner scan = new Scanner(System.in);
        int Total = 0;
        for (int i = 1; i <=3 ; i++) {
            System.out.printf("Please enter angle %d\n" ,i);
            int Angle = scan.nextInt();
            Total = Total + Angle;

        }
        if(Total == 180){
            System.out.println("it is a valid triangle");
        }else{
            System.out.println("it is not a valid triangle");
        }
        scan.close();
    }

}
