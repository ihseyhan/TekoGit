package Day17_Methods2;

public class Topic1_TS_Methods {
    public static void main(String[] args) {
        int [] Numbers = {77,12,55,9,-9};
        SumArray(Numbers);
    }
    public static void SumArray (int [] MyArray){

        int Total = 0;
        for (int i = 0; i <MyArray.length; i++) {

            Total = Total + MyArray[i];

        }
        System.out.println("Total = " + Total);
    }



}
