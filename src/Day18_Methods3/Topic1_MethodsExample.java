package Day18_Methods3;

import java.util.Scanner;

public class Topic1_MethodsExample {
    public static void main(String[] args) {

        /*
        1-I need to create scanner
        2-I need to inform the user
        3-I need to assign it to a String variable

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence!");
        String MySentence = scan.nextLine();



        /*
        Sentence= Today is so cold
        2)Check each word in the sentence to see how many 'l', 'a' and 'b' characters in the each word
        a- I need to split my sentence into workds
        b-iterate each word
        c-I need to calculate how many 'l' I have
        d-I need to calculate how many 'a' I have
        e-I need to calculate how many 'b' I have
         */

        String[] MyWords = MySentence.split(" ");
        for (String Word : MyWords) {
        int HowMany_l = Calculate_l(Word);
        int HowMany_a = Calculate_a(Word);
        int HowMany_b = Calculate_b(Word);

            System.out.println("Word = " + Word);
            System.out.println("HowMany_l = " + HowMany_l);
            System.out.println("HowMany_a = " + HowMany_a);
            System.out.println("HowMany_b = " + HowMany_b);

        }
    }

    public static int Calculate_l(String MyWord) {
        for (int i = 0; i < MyWord.length(); i++) {
            int Count = 0;
            if (MyWord.charAt(i) == 'l') {
                Count = Count + 1;
            }


        }

        return 0;
    }

    public static int Calculate_a(String MyWord) {
        for (int i = 0; i < MyWord.length(); i++) {
            int Count = 0;
            if (MyWord.charAt(i) == 'a') {
                Count = Count + 1;
            }


        }

        return 0;

}
    public static int Calculate_b(String MyWord) {
        for (int i = 0; i < MyWord.length(); i++) {
            int Count = 0;
            if (MyWord.charAt(i) == 'b') {
                Count = Count + 1;
            }


        }

        return 0;
}
}
