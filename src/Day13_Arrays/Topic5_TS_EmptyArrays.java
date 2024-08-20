package Day13_Arrays;

public class Topic5_TS_EmptyArrays {
    public static void main(String[] args) {
        int [] Numbers = new int[4];

        Numbers[0] = 4;
        Numbers[1] = 7;
        Numbers[2] = 50;
        Numbers[3] = 88;

        for (int i = 0; i <Numbers.length ; i++) {
            System.out.println(Numbers[i]);

        }

        int [] MyArray = new int[10];
        for (int i = 0; i <MyArray.length ; i++) {
            MyArray[i] = i+1;
            System.out.println(MyArray[i]);

        }

    }
}
