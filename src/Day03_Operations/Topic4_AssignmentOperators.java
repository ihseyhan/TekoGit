package Day03_Operations;

public class Topic4_AssignmentOperators {
    public static void main(String[] args) {
        int ANumber = 22;
        ANumber = 33;
        System.out.println("ANumber = " + ANumber);
        
        //33 + 11;
        
        ANumber = ANumber + 15;
        System.out.println("ANumber = " + ANumber);

        ANumber = ANumber + 55;
        System.out.println("ANumber = " + ANumber);
        
        ANumber += 15;
        System.out.println("ANumber = " + ANumber);
        
        ANumber -= 100;
        System.out.println("ANumber = " + ANumber);
        
        ANumber /= 3;
        System.out.println("ANumber = " + ANumber);
        
        ANumber *= 5;
        System.out.println("ANumber = " + ANumber);

        ANumber %= 9;
        System.out.println("ANumber = " + ANumber);

    }
}
