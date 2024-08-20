package Day13_Arrays;

public class Topic6_TS_Example {
    public static void main(String[] args) {
        int [] Ages = {35, 30, 38, 18, 51, 22, 26};
        double Total =0;
        for (int i = 0; i <Ages.length ; i++) {
            Total = Total + Ages[i];
        }
        System.out.println("Total = " + Total);
        double Average = Total / Ages.length;
        System.out.println("Average = " + Average);

    }
}
