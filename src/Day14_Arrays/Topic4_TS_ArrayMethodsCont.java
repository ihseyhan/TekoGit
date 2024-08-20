package Day14_Arrays;

import java.util.Arrays;

public class Topic4_TS_ArrayMethodsCont {
    public static void main(String[] args) {
        String [] Animals = {"Dog", "Cat", "Horse", "Lion"};
        System.out.println(Arrays.toString(Animals));
        Arrays.sort(Animals);
        System.out.println(Arrays.toString(Animals));


        int [] Array1 = {1, 2, 3};
        int [] Array2 = {1, 2, 3};

        Arrays.equals(Array1, Array2);
        System.out.println(Arrays.equals(Array1, Array2));

        String [] Cars1 = {"Toyota" , "Jeep", "Subaru"};
        String [] Cars2 = {"Toyota" , "Subaru", "Jeep"};
        Arrays.sort(Cars1);
        Arrays.sort(Cars2);
        System.out.println("After Sort : " +Arrays.equals(Cars1, Cars2));
    }
}
