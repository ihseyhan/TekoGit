package Day12_Recap;

public class Topic6_TS {
    public static void main(String[] args) {
        for (int i = 65; i <= 90; i++) {
            char MyUpperCase = (char) i;
            char MyLowercase = (char) (i+32);
            //System.out.println(MyUpperCase + " - " + MyLowercase);
            System.out.printf("%c-%c\n", MyUpperCase, MyLowercase);


        }
    }
}
