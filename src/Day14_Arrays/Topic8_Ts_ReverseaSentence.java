package Day14_Arrays;

import java.util.Arrays;

public class Topic8_Ts_ReverseaSentence {
    public static void main(String[] args) {
        String Sentence = "I love Java";
        String [] MySentenceArray = Sentence.split(" ");
        System.out.println(Arrays.toString(MySentenceArray));

        for (int i = MySentenceArray.length - 1 ; i >= 0 ; i--) {
            //i = 2; direkt 2 yazamiyoruz cunku hardcoded value veremeyiz
            System.out.print(MySentenceArray[i]+ " ");


        }
    }
}
