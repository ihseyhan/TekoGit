package Day10_NestedLoops;

public class Topic11_TS_ForInsideWhile {
    public static void main(String[] args) {
        int i = 1;
        while(i<=5){
            System.out.println("i = " + i);
            i++;

            for (int j = 1; j <=i ; j++) {
                System.out.println("j = " + j);

            }
            i++;
        }
    }
}
