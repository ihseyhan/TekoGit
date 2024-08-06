package Day10_NestedLoops;

public class Topic12_TS_WhileInsideFor {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            System.out.println("i = " + i);
            
            int j = 1;
            while(j <=2){
                System.out.println("j = " + j);
                j++;
                
            }
            
        }
    }
}
