package Day07_ForLoop;

public class Topic5_TS_ForLoopExample {
    public static void main(String[] args) {
        String Word = "abcdefghijklmnopqrstuvwxy";
        for (int i = 0; i <26 ; i = i+5) {
            System.out.println(Word.substring(i, i+5));;

            
        }
    }
}
