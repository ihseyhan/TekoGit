package Day21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Topic2_TS_CollectionsUtil {
    public static void main(String[] args) {

        int [] a = {11,2,35};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        ArrayList<Integer> MyArrayList = new ArrayList<>();
        MyArrayList.addAll(Arrays.asList(11,2,35));

        System.out.println("MyArrayList = " + MyArrayList);

        Collections.sort(MyArrayList);
        System.out.println("MyArrayList = " + MyArrayList);

        Collections.sort(MyArrayList, Collections.reverseOrder());
        System.out.println("MyArrayList = " + MyArrayList);

        Collections.shuffle(MyArrayList);
        System.out.println("MyArrayList = " + MyArrayList);

        Collections.reverse(MyArrayList);
        System.out.println("MyArrayList = " + MyArrayList);

        //Swapping

        Collections.swap(MyArrayList, 0, 2);
        System.out.println("MyArrayList = " + MyArrayList);

        System.out.println("Collection.max(MyArrayList) = " + Collections.max(MyArrayList));
        System.out.println("Collection.max(MyArrayList) = " + Collections.min(MyArrayList));

    }
}
