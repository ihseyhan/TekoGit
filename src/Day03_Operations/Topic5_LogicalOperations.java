package Day03_Operations;

public class Topic5_LogicalOperations {
    public static void main(String[] args) {
        String Car = "Tesla";
        boolean IsItTesla = Car == "Tesla";
        System.out.println("IsItTesla = " + IsItTesla);

        // && (means AND) And operator
        
        String Color = "White";
        boolean IsItWhiteTesla = Car == "Tesla" && (Color == "White");
        System.out.println("IsItWhiteTesla = " + IsItWhiteTesla);

        // || (it means OR)

        String AnotherCar = "Ford";

        boolean CanIPass = (Car == "Tesla") || (Car == "Ford");
        System.out.println(CanIPass);
        
        int a = 5;
        int c = 7;
        boolean b = a == 5 && a == 7;
        System.out.println("b = " + b);
    }
}
