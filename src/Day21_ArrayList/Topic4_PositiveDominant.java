package Day21_ArrayList;

import java.util.ArrayList;

public class Topic4_PositiveDominant {
    public static void main(String[] args) {
        /*
        an Array is positive dominant if it contains strictly more unique positive values than unique
        negative values. Write a method that returns true if an array is positive dominant, false, otherwise.

       Examples
       isPositiveDominant({1, 1, 1, 1, -3, -4]) -> False
       There is only 1 unique positive valuie (1).
       There are 2 unique negative values (-3, -4).

       isPositiveDominant ([5, 99, 832, -3, -4]) -> True

       isPositiveDominant ([5, 0]) -> True

       isPositiveDominant ([0, -4, -1)] -> False

       Notes
       0 counts as neither a positive nor a negative value.
     */
        int [] Numbers = { 1,5};
        System.out.println(isPositiveDominant(Numbers));

    }
    public static boolean isPositiveDominant (int [] MyArray){
        /*
        I need to find how many unique positive numder I have
        I need to find how many unique negative numder I have
        Compare them
        If I have more unique numbers, I`ll return return false
         */
        ArrayList<Integer> UniquePositiveNumbers = new ArrayList<>();
        ArrayList<Integer> UniqueNegativeNumbers = new ArrayList<>();

        for (int Number : MyArray) {
            if (Number > 0) {
                if (UniquePositiveNumbers.contains((Number)) == false) {
                    UniquePositiveNumbers.add(Number);
                }
            } else if (Number < 0) {
                if (UniqueNegativeNumbers.contains(Number) == false) {
                    UniqueNegativeNumbers.add(Number);
                }
            }
        }


        boolean ReturnValue;

        if (UniquePositiveNumbers.size() > UniqueNegativeNumbers.size()){
        ReturnValue = true;

        }else{
            ReturnValue=false;
        }
    return ReturnValue;
    }


    }



