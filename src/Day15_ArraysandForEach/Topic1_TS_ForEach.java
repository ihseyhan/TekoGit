package Day15_ArraysandForEach;

import java.util.Arrays;

public class Topic1_TS_ForEach {
    public static void main(String[] args) {
        int [] Numbers = {15, 4, 7, 39, 44, 21, 18};
        for (int i = 0; i < Numbers.length; i++) {
            int MyCurrentNumber = Numbers[i];
            System.out.println("MyCurrentNumber = " + MyCurrentNumber);
        }
        System.out.println("*********************");
         for ( int MyNumber : Numbers){
             System.out.println("MyNumber = " + MyNumber);
         }

         String [] Animals = {"Dog", "Cat", "Horse"};
        for (int i = 0; i < Animals.length; i++) {
            String MyCurrentAnimal = Animals[i];
            System.out.println("MyCurrentAnimal = " + MyCurrentAnimal);
        }
        for ( String MyAnimal : Animals ) {
            System.out.println("MyAnimal = " + MyAnimal);
        }

        System.out.println("****************************");


        String Hi = "Hello";
        char [] HiArray = Hi.toCharArray();
        System.out.println(Arrays.toString(HiArray));
        for (char Hello : HiArray) {
            System.out.println("Hello = " + Hello);
        }

    }
}
