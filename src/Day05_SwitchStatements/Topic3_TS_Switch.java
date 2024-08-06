package Day05_SwitchStatements;

public class Topic3_TS_Switch {
    public static void main(String[] args) {

        int Number = 20;

        switch (Number){
            case 10:
                System.out.println("The number is 10");
                System.out.println("Another line");
                break;
            case 20:
                System.out.println("The number is 20");
                break;
            case 30:
                System.out.println("The number is 30");
                break;
            default:
                System.out.println("The number is not 10, 20 or 30");
        }
    }
}
