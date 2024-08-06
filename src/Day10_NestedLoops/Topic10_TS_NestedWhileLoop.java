package Day10_NestedLoops;

public class Topic10_TS_NestedWhileLoop {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println(i);
        }
    int i =1;
        while(i<=5){
            System.out.println(i);
            int i1 = i++;

            int j= 1;
            while(j<=5){
                System.out.println(j);
                j++;

            }
        }
    }

}
