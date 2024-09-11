package Day20_MethodOverLoadAbdWrapperClass;

import java.util.ArrayList;
import java.util.Random;

public class Topic5_TS_AccessElements {
    public static void main(String[] args) {

        ArrayList<String> RandomWords = new ArrayList<>();
        /*
        At first the length is 0,
        when you add a value
        First java needs to increase arraylist in the memory
        it will add the value
         */

        RandomWords.add("pile");
        RandomWords.add("Rice");
        RandomWords.add("elastic");
        RandomWords.add("Florida");
        System.out.println(RandomWords);

        String SecondWord = RandomWords.get(1);
        System.out.println("SecondWord = " + SecondWord);

        for (int i = 0; i < RandomWords.size(); i++) {
            System.out.println(RandomWords.get(i));
        }
            int j = 0;
            while (j < RandomWords.size()) {
                System.out.println(RandomWords.get(j));
                j++;
                System.out.println("---------------------------------");

                for (String word : RandomWords){
                    System.out.println(word);
                }

        }
    }
}
