package Day18_Methods3;

public class Topic4_Example3 {
    public static void main(String[] args) {
    int [] MyArray = {6,1,2,8,3,4,7,10,5};
        for (int i = 1; i <= MyArray.length ; i++) {
        int TheNumberImLookingFor = i;
        boolean DoIHaveTheNumberInTheArray = CheckSpecificValue(MyArray, TheNumberImLookingFor);

        if (DoIHaveTheNumberInTheArray== false)  {

                System.out.println("Output : "+ TheNumberImLookingFor );
            }


        }


    }
    public static boolean CheckSpecificValue (int [] Array1, int SpesificValue ){
        boolean ReturnValue = false;
        for (int i = 0; i <Array1.length ; i++) {
            if (Array1[i] == SpesificValue){
                ReturnValue = true;
            }

        }
        return ReturnValue;

    }

}
