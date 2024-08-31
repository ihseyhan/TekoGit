package Day16_Methods;

public class Topic2_TS_MethodsCont {
    public static void main(String[] args) {
        /*
        This is about the method when you first sign in a class.
        When you write "Main" it comes out as the public static.
        public     static    void          main          (String{} args){}
       (public)   (static)  (ReturnType)  (MethodName)  (ParameterType ParameterName) {}
        */

        String MyName = "Eren";
        PrintMyName(MyName);
        
        int MyNewValue = 5;
        int ResultOfMethod = MakeItDouble(MyNewValue);
        System.out.println("ResultOfMethod = " + ResultOfMethod);

        PrintMyNameAndMyAge("Teko", 31);
        PrintMyNameAndMyAge("Mahmutcan", 24);



    }
    public static void PrintMyName ( String param1 ) {
        System.out.println(param1);
    }

    public static int MakeItDouble (int GivenValue) {
        int MyReturnValue = 2*GivenValue;
        
        return MyReturnValue;
    }

    public static void PrintMyNameAndMyAge (String Name, int Age){

        System.out.println("My Name is :" + Name);
        System.out.printf("I`m %d years old\n", Age);


    }


}
