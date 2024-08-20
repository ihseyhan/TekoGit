package Day14_Arrays;

import java.util.Arrays;

public class Topic3_TS_ArrayMethods_IntQuest {
    public static void main(String[] args) {
    //Formula: DataType [] VariableName = {values will be here}
//Empty Array: DataType [] VariableName = new DataType [length]


        int [] Numbers = {1, 7, 99, 66};
        System.out.println(Numbers);
        //When you try to print it like this it will not print so we need to use the method
        //Arrays.toString (YourArrayVariableNames)
        System.out.println(Arrays.toString(Numbers));

        String [] Cities = {"London" , "Toronto"};
        System.out.println(Arrays.toString(Cities));
    //other way to print without method
        for (int i = 0; i < Cities.length; i++) {
            System.out.println(Cities[i]);
        }

        int [] Values = {99, 35, 86, -9, 11};
        //sort this array
        //Method Achieved! Bubble Sort Algorithm <- Interview Question*************************************
        //outcome: {-9, 11, 35, 86, 99}

        System.out.println(Arrays.toString(Values));
        Arrays.sort(Values);
        System.out.println("After sort : "+ Arrays.toString(Values));

        int [] MyNumber = {78, 34, 5, -230, 67};
        System.out.println(Arrays.toString(MyNumber));
        Arrays.sort(MyNumber);
        System.out.println("After Sort : " + Arrays.toString(MyNumber));

    }


}
