package Day09_WhileLoop;

import java.util.Scanner;

public class Topic4_TS_ContinueExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();

        String Reverse = "";
        for (int i = Sentence.length()-1; i >=0 ; i--) {
        if (Sentence.charAt(i) == 'l' || Sentence.charAt(i) == 'L'){
            continue;
        }

        Reverse = Reverse + Sentence.charAt(i);
        }
        System.out.println("Reverse = " + Reverse);
    }
}
