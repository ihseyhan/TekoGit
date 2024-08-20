package Day14_Arrays;

import java.util.Arrays;

public class Topic6_TS_StringMethodsAndArrays {
    public static void main(String[] args) {
        String s = "Canada is awesome";

        String [] MyArray = s.split(" ");
        System.out.println(Arrays.toString(MyArray));



        String MySentence = "Java is cool";
        String [] MySentencesArray = MySentence.split(" ");
        System.out.println(Arrays.toString(MySentencesArray));
    }
}
