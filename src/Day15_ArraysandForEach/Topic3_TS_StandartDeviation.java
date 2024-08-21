package Day15_ArraysandForEach;

import java.util.Arrays;

public class Topic3_TS_StandartDeviation {
    public static void main(String[] args) {
        //Calculate standart deviation
        int  [] Numbers = {10, 8, 10, 8, 8, 4};
        int n = Numbers.length;

        //Find the total
        int Total = 0;
        for (int MyNumber : Numbers){
            Total = Total + MyNumber;

        }
        System.out.println("Total = " + Total);

        int Mean = Total / n;
        //Create an empty Array
        int [] NewArray = new int[n];
        for (int i = 0; i < n; i++) {
            NewArray[i] = (Numbers[i] - Mean) * (Numbers[i] - Mean);
        }
        System.out.println(Arrays.toString(NewArray));
        double Total2 = 0;
        for (int CurrentNumberIntNewArray : NewArray) {
           Total2 =  Total2 + CurrentNumberIntNewArray;
        }
        System.out.println("Total2 = " + Total2);
        double Variance = Total2 / (n-1);
        System.out.println("Variance = " + Variance);
        double StandartDeviation = Math.sqrt(Variance);
        System.out.println("StandartDeviation = " + StandartDeviation);

    }



     //double MyDouble = Math.pow(4,2);
}
