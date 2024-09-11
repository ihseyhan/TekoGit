package Day20_MethodOverLoadAbdWrapperClass;

public class Topic1_Ts_MethodOverLoad {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        int Sum = Add(a,b);

        System.out.println("Sum = " + Sum);

        double c = 1.1;
        double d = 2.5;

        double Sum2 = Add(c,d);

        System.out.println("Sum2 = " + Sum2);

        int Sum3 = Add(5);



    }
    public static int Add (int param1, int param2){
        return param1 + param2;
    }
    //*****************Method Overload*******************************
    //it is basically creating two different method with the same name so you can overload them. 1 stone 2 birds :)
   // 1-Method name should be the same
   // 2- Parameter signature should be different
    public static double Add(double number1, double number2){
    return number1+number2;

    }

    public static int Add(int param1){
        return param1 + 1;

    }
    public static String Add (String param1, String param2){
        return param1+param2;

    }


}
