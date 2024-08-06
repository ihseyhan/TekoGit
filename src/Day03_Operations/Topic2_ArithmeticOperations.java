package Day03_Operations;

public class Topic2_ArithmeticOperations {
    public static void main(String[] args) {
        //Addition (+) it is used when we add numbers

        int Num1 = 1;
        int Num2 = 2;

        int Total = Num1 + Num2;

        System.out.println("Total = " + Total);

        double DoubleNumber1 = 76.987456;

        // 76.987456 + 11 = 87.987456;
        double TotalNumber = DoubleNumber1 + Num1;

        // Subtruction (-)

        int Num3 = 70;
        int Num4 = 50;

        int Num5 = Num3 - Num4;
        System.out.println("Num5 = " + Num5);

        double DoubleNumber2 = 55;

        double Num6 = DoubleNumber2 - Num3;

        // Multiplication (*)

        int Num7 = 10;
        int Num8 = 50;

        System.out.println(Num7 * Num8);

        //Division (/) eger Double kullanirsan noktali sayilar gelir, eger int kullanirsan duz numaralar gelir.

        double num9 = 500;
        double num10 = 3;

        System.out.println(num9 / num10);

        // Modulus (%) it will give the remainder

        int Mod1 = 10;
        int Mod2 = 5;
        int Mod3 = 3;

        int Rem1 = Mod1 % Mod2;
        System.out.println(Rem1);

        int Rem2 = Mod1 % Mod3;
        System.out.println(Rem2);

        int Rem3 = Mod2 % Mod3;
        System.out.println(Rem3);


    }
}
