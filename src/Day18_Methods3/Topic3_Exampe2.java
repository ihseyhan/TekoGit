package Day18_Methods3;

public class Topic3_Exampe2 {
    public static void main(String[] args) {

        int[] a = {1,2,3};
        int[] b = {7,3};

        boolean Result = Compare2Arrays(a,b);
        System.out.println("Result = " + Result);


    }

    public static boolean Compare2Arrays (int [] Array1, int [] Array2){
        int FirstElementofArray1 = Array1[0];
        int FirstElementofArray2 = Array2[0];
        int LastElementofArray1 = Array1[Array1.length-1];
        int LastElementofArray2 = Array2[Array2.length-1];
        boolean ReturnValue;
        if (FirstElementofArray1 == FirstElementofArray2 || LastElementofArray1 == LastElementofArray2){
            ReturnValue = true;
        }else{
            ReturnValue = false;
        }
        return ReturnValue;
    }

}
