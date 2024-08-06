package Day09_WhileLoop;

import java.util.Scanner;

public class Topic2_TS_ReverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word that you want to reverse");
        String Word = scan.next();
        char FirstChar = Word.charAt(0);
        System.out.println("The first character is "+FirstChar);
        char LastChar = Word.charAt(Word.length()-1);
        System.out.println("The second character is "+LastChar);
        String Reverse = "";
        for (int i = Word.length()-1; i >= 0 ; i--) {
            Reverse = Reverse +Word.charAt(i);
            
        }
        System.out.println("The reverse of the word is "+Reverse);
    }
}