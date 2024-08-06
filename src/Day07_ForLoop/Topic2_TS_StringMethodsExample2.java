package Day07_ForLoop;

import java.util.Scanner;

public class Topic2_TS_StringMethodsExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentences");
        String Sentences = scan.nextLine();
        String NewSentences = Sentences.replace("bat", "snow");
        System.out.println("NewSentences = " + NewSentences);

    }
}
