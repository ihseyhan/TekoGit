package Day12_Recap;

import java.util.Scanner;

public class Topic2_Ts {
    public static void main(String[] args) {
        //HA WAY****
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();
        
        int count = 1;
        while (Number / 10 > 0){
            count++;
            Number = Number /10;
        
            
        }
        System.out.println("count = " + count);
        
        
        /* !!!OTHER WAY!!!(GPT WAY)
        Number = Math.abs(Number);

        int digitCount = 0;

        do {
            Number /= 10;
            digitCount++;
        } while (Number != 0);
        System.out.println("Number of digits: " + digitCount);
        /*
 */
    }
}
