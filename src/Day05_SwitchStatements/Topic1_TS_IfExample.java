package Day05_SwitchStatements;

import java.util.Scanner;

public class Topic1_TS_IfExample {
    public static void main(String[] args) {
        /*
        Water temp is 100 = it is boiling
        Water Temp is 0 = it is freezing
        Water Temp is 0<temp<10 = so cold
        Water Temp between 10-30 = Cold
        Water Temp 60<temp<90 = Hot
        Water Temp 90<temp<100 So Hot,
        rest room Temp
         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter water temperature");
        int Temp = scan.nextInt();

        if (Temp == 100){
            System.out.println("It is boiling");

        }
        else if (Temp == 0 ){
            System.out.println("it is freezing");
        }else if(0<Temp && Temp<10){
            System.out.println("So Cold");
        }else if(10 <=Temp && Temp<=30){
            System.out.println("Cold");
        }else if(60<=Temp && Temp<=90){
            System.out.println("Hot");
        }else if(Temp<=90 && Temp<=100) {
            System.out.println("So Hot");
        }else if(Temp < 0 || Temp>100){
                System.out.println("Invalid Value");
            }else{
            System.out.println("Room Temperature!");

        }
    }
}
