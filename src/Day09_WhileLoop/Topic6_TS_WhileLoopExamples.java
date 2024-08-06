package Day09_WhileLoop;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class Topic6_TS_WhileLoopExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int Number = scan.nextInt();

        int i = 0;
        int Count = 0;
        while(i <= Number) {
            if (i % 2 == 1) {
                Count = Count + 1;
            }
            i++;
        }
        System.out.println("Count = " + Count);
    }


}
