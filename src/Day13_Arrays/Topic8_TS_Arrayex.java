package Day13_Arrays;

public class Topic8_TS_Arrayex {
    public static void main(String[] args) {
        int [] Numbers = new int[10];
        int Sum = 0;
        for (int i = 0; i < Numbers.length ; i++) {
            Numbers[i] = (i + 1) *2;
            Sum += Numbers[i];

        }
        int MaxNumber = 0;
        System.out.println("Sum = " + Sum);
    }
}
