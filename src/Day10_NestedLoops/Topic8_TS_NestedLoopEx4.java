package Day10_NestedLoops;

public class Topic8_TS_NestedLoopEx4 {
    public static void main(String[] args) {
        /*
        1
12
123
1234
12345
123456
1234567
         */
        for (int i = 1; i <=7 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);
                
            }
            System.out.println(" ");
        }
    }
}
