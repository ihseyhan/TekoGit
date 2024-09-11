package Day21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Topic3_Example {
    public static void main(String[] args) {
        //Create 3 different ArrayList : Double, Integer, String.

        ArrayList <Double> MyDoubleArray = new ArrayList<>();
        ArrayList <Integer> MyIntegerArray = new ArrayList<>();
        ArrayList <String> MyStringArray = new ArrayList<>();

        MyDoubleArray.add(3.5);
        MyDoubleArray.add(1.2);
        MyDoubleArray.add(7.7);
        MyDoubleArray.add(1,1.0);
        MyDoubleArray.add(3,6.7);

        MyIntegerArray.addAll(Arrays.asList(5,99,-3,-4,11));

        MyStringArray.add("Florida");
        MyStringArray.add(0,"Toronto");
        MyStringArray.addAll(Arrays.asList("New York", "Winnipeg", "Erie"));

        MyDoubleArray.remove(4);
        MyDoubleArray.remove(0);

        MyIntegerArray.remove(1);
        MyIntegerArray.remove(3);

        MyStringArray.remove("Winnipeg");
        MyStringArray.remove(0);

        System.out.println("MyDoubleArray.size() = " + MyDoubleArray.size());
        System.out.println("MyIntegerArray.size() = " + MyIntegerArray.size());
        System.out.println("MyStringArray.size() = " + MyStringArray.size());

        System.out.println("MyDoubleArray = " + MyDoubleArray);
        System.out.println("MyIntegerArray = " + MyIntegerArray);
        System.out.println("MyStringArray = " + MyStringArray);

        int IndexOfDouble = MyDoubleArray.indexOf(6.7);
        int IndexOfInteger = MyIntegerArray.indexOf(-4);
        int IndexOfString = MyStringArray.indexOf("Erie");

        MyStringArray.contains("Florida");
        System.out.println("MyStringArray.contains() = " + MyStringArray.contains("Florida"));
        MyStringArray.containsAll(Arrays.asList("Florida", "Toronto", "Erie", "Winnipeg"));
        System.out.println("MyStringArray = " + MyStringArray);


    }
}
