package Day18_Methods3;

public class Topic2_TS_3Chars {
    public static void main(String[] args) {

        String s = "BIBOBOBPIPDUD";
        String First3char = s.substring(0,3);
        String Second3char = s.substring(1,4);
        String Third3char = s.substring(2,5);
        String Last3char = s.substring(10,13);

        for (int i = 0; i <= 10 ; i++) {
            String Actual3char = s.substring(i, i + 3);
            PrintWord(Actual3char);

        }

    }
    public static void PrintWord (String Word){
        System.out.println("Word = " + Word);
    }
}
