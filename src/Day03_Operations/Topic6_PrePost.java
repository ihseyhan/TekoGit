package Day03_Operations;

public class Topic6_PrePost {
    public static void main(String[] args) {
        int I = 1;

        System.out.println("I = " + I);
        I = I + 1;
        System.out.println("I = " + I);
        
        I += 1;
        System.out.println("I = " + I);
        
        I++;
        System.out.println("I = " + I);
        
        int AValue = 20;
        AValue++;
        System.out.println("AValue = " + AValue);
        
        AValue--;
        System.out.println("AValue = " + AValue);


        Double ADoubleNumber = 3.3;
        ADoubleNumber++;
        System.out.println("ADoubleNumber = " + ADoubleNumber);
        
        int J = 5;
        int K = J++;
        System.out.println("K = " + K);
        System.out.println("J = " + J);

        int o = ++J;

        int Number = 10;
        System.out.println("Number = " + Number);
        System.out.println(Number++);
        System.out.println(Number);
        System.out.println("Number++ = " + Number++);
        System.out.println(Number);
        
        
        
        Number = 20;
        System.out.println("Number = " + Number);
        System.out.println(++Number);

        //Artilar once gelirse islemi direkt yapacaktir, eger artilar sonrasina koyuluyorsa tekrar print yap.



    }
}
