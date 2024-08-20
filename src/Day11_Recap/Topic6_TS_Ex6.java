package Day11_Recap;

import java.util.Scanner;

public class Topic6_TS_Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word");
        String Word = scan.next();
       // char Lastcharacter = Word.charAt(8);
       // System.out.println("Lastcharacter = " + Lastcharacter);
        System.out.printf("Last char is %s for %s", Word.charAt(Word.length()-1), Word);
    }
}
