package Day14_Arrays;

import java.util.Arrays;

public class Topic5_TS_ArraysExample {
    public static void main(String[] args) {
        int [] Array1 = {1, 8, 9};
        int [] Array2 = {55, 21, 97, -9};
        //combine them together
        //int [] Array3 = Array1 + Array2 is not gonna work lol

        int TotalLength = Array1.length + Array2.length;
        int [] Array3 = new int[TotalLength];
        for (int i = 0; i < Array1.length; i++) {
            Array3[i] = Array1[i];

        }
        System.out.println(Arrays.toString(Array3));

        for (int i = 0; i < Array2.length ; i++) {

            Array3[i+Array1.length] = Array2[i];

        }
        System.out.println(Arrays.toString(Array3));
    }
}
