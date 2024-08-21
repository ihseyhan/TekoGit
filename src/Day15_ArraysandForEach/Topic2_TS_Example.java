package Day15_ArraysandForEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Topic2_TS_Example {
    public static void main(String[] args) {
        int  [] Array1 = {1, 2, 3};
        int  [] Array2 = new int[Array1.length];
        for (int i = Array1.length-1; i >= 0 ; i--) {
            Array2[Array1.length-1-i] = Array1[i];

        }
        System.out.println(Arrays.toString(Array2));

    }
}
