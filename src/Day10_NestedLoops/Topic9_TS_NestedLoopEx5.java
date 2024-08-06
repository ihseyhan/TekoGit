package Day10_NestedLoops;

public class Topic9_TS_NestedLoopEx5 {
    public static void main(String[] args) {
        /*
        create this loop
         *****
         ****
         ***
         **
         *
         */
        //************************************

        for (int i = 4; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }
        //other way around

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=5-i ; j++) {
                System.out.print("*");

            }
            System.out.println(" ");
        }
    }
}
