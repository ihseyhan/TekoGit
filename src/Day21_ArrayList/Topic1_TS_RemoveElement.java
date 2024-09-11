package Day21_ArrayList;

import java.util.ArrayList;

public class Topic1_TS_RemoveElement {
    public static void main(String[] args) {
        //Create arraylist of double
        //Arraylist<DataType> VariableName = new ArrayList <>();

        ArrayList<Double> MyDoubleArray = new ArrayList<>();

        MyDoubleArray.add(1.7);
        MyDoubleArray.add(2.2);

        System.out.println(MyDoubleArray);

        MyDoubleArray.add(1,3.5);
        System.out.println(MyDoubleArray);

        MyDoubleArray.add(0,4.7);
        System.out.println(MyDoubleArray);

        MyDoubleArray.remove(3);
        System.out.println(MyDoubleArray);

        MyDoubleArray.remove(1.7);
        System.out.println(MyDoubleArray);

        MyDoubleArray.clear();
        System.out.println(MyDoubleArray);
    }
}
