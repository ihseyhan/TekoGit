package Day11_Recap;

import java.util.Scanner;

public class Topic4_TS_Ex4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number tirrek");
        int Number = scan.nextInt();
        
        if(Number < 0){
            Number = Number = -1;
            System.out.println("Number = " + Number);
        }else{
            System.out.println("Number = " + Number);
        }

    }
}
