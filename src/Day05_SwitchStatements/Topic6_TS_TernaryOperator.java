package Day05_SwitchStatements;

public class Topic6_TS_TernaryOperator {
    public static void main(String[] args) {
        int Number1 = 44;
        int Number2 = 55;

        if(Number1 > Number2){
            System.out.println("The maximum number is " +Number1);
        } else {
            System.out.println("The maximum number is " +Number2);
        }
    
        /*
         Ternary Operator
         YUKARIDA KI HERSEYI ALTTAKI BIR SATIRDA YAZABILIRIZ BU FORMUL ILE.
        (condition) ? The code if it is true : The code is if it is false;
        */
        
        int Max =(Number1 > Number2) ? Number1 : Number2;
        System.out.println(Max);
        
    }
    
}
