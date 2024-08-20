package Day13_Arrays;

import javax.naming.Name;

public class Topic2_TS_Arrays {
    public static void main(String[] args) {
        int [] MyIntArray = {3, 5, 9, 7};
        System.out.println("My first value in the array = " + MyIntArray[2]);
        System.out.printf("The first number is %d and The second number is %d\n" , MyIntArray[0], MyIntArray[1] );
        System.out.println("************************************");

        String [] Names = {"Oznur", "Canan", "Tesla", "Libby", "Tugce", "Mahmut", "Teko"};
        System.out.println("The first name in the list = " +Names[0]);

        System.out.println("The length of the Names is = "+ Names.length);
        for (int i = 0; i < Names.length ; i++) {
            System.out.println(Names[i]);
            System.out.print("-");
        }

        int [] MyNumber = {5,7,8,9};
        System.out.println(MyNumber[MyNumber.length-1]);
        System.out.println("******************************");

        for (int i = 0; i <=MyNumber.length-1 ; i++) {
            System.out.println(MyNumber[i]);

        }
    }
}
