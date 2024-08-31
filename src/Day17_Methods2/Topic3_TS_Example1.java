package Day17_Methods2;

import java.util.Scanner;

public class Topic3_TS_Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String Sentence = scan.nextLine();
        String[] Words = Sentence.split(" ");
        for (String MyWords : Words){

            boolean isPalindrome = CheckPalindrome(MyWords);
            System.out.println("is "+MyWords+" Palindrome :" +isPalindrome);

        }


    }

    public static boolean CheckPalindrome(String Word) {

        String ReversedString = "";
        for (int i = 0; i < Word.length(); i++) {
            ReversedString = Word.charAt(i) + ReversedString;

        }

        /*

      ALTERNATIVE WAY
        if (ReversedString.equalsIgnoreCase(Word)) {
            return true;
        } else {
            return false;
        }
    */

    return ReversedString.equalsIgnoreCase(Word);
    }
}







