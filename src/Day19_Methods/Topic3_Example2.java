package Day19_Methods;

public class Topic3_Example2 {
    public static void main(String[] args) {
        int x = 4;
        x += x++ + ++x + x;
        System.out.println(x);
    }
}
