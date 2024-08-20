package Day13_Arrays;

public class Topic7_TS_Ex2 {
    public static void main(String[] args) {
        int [] Numbers = {5,99,123,-9,0,55};

        int MaxNumber = Numbers[0];
        for (int i = 0; i < Numbers.length ; i++) {
            if(MaxNumber < Numbers[i]){
                MaxNumber = Numbers[i];

            }


        }
        System.out.println("MaxNumber = " + MaxNumber);
    }
}
