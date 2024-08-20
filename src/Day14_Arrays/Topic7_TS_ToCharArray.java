package Day14_Arrays;

import java.util.Arrays;

public class Topic7_TS_ToCharArray {
    public static void main(String[] args) {
        String MyString = "Convert";
        char [] MyCharArray = MyString.toCharArray();
        System.out.println(Arrays.toString(MyCharArray));

        String s = "IceSkating";
        char [] MyIceSkatingArray = s.toCharArray();
        System.out.println(Arrays.toString(MyIceSkatingArray));

        /*
        Anagram nedir? Ayni harfler uzerinden olusturulan baska kelimelerdir. ornekler:
        Listen  - Silent
        Meat    - Team
        Triangle- Integral
        Cineam  - Iceman

        gibi gibi
         */



    }
}
