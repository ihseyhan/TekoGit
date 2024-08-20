package Day14_Arrays;

public class Topic1_TS_SwapValues {
    public static void main(String[] args) {
        int a = 1;
        int b = 99;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        //We are going to swap a to b and bo to a.

        int temp = a;
        a = b;
        b = a;
        b = temp;

        System.out.println("a = " + a);

        /*
        ********The Formula*******
        int temp = a
        a = b;
        b = temp;
         */

    }
}
