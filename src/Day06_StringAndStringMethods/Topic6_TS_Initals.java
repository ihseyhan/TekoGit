package Day06_StringAndStringMethods;

import java.util.Scanner;

public class Topic6_TS_Initals {
    public static void main(String[] args) {
        //Formula: ObjectType VariableName = new ObjectType(parameter);
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Please enter your surname");
        String surname = scan.nextLine();
        String initals = name.charAt(0) + "." + surname.charAt(0)+".";
        System.out.println(initals);
        



    }
}
