package Day09_WhileLoop;

public class Topic8_TS_WhileLoopBreak {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10){
            System.out.println("i = " + i);
            i++;
            if(i == 3){
                break;
            }

        }
        System.out.println("*********************");
    
    int any = 0;
        while(any < 5){
            if(any == 1){
                any++;
                continue;
            }
            System.out.println("any = " + any);
            any++;
        }
    
    }
}
