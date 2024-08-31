package Day16_Methods;

import java.util.Locale;

public class Topic1_TS_MethodsIntro {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        System.out.println(a*b);

        String s1 = "Hello";
        System.out.println(s1.toLowerCase());
        Printlowercase();
        int c = 11;
        int d = 2;

        int sum = c+d;
        for (int i = 1; i <=sum ; i++) {
            System.out.println(i);

        }

        Printlowercase();


        String s2 = "Whatever";
        System.out.println(s2.toLowerCase());
    }
  //public static returnType MethodName
    public static void Printlowercase (){

        String MyString = "Hi";
        System.out.println(MyString.toLowerCase());
    }
}
