package Day19_Methods;

import java.util.Arrays;

public class Topic1_TS_Example1 {
    public static void main(String[] args) {
        int [] MyNumbers = {1,2,3,4,5,6,7};

        int [] MyNewNumber = new int [MyNumbers.length];

        MyNewNumber [0] = MyNumbers[MyNumbers.length-1];

        for (int i = 1; i <= MyNumbers.length-1 ; i++) {
            MyNewNumber[i] = MyNumbers[i-1];
        }
        System.out.println(Arrays.toString(MyNewNumber));
    }


}
