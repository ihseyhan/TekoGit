package Day16_Methods;

import java.util.Scanner;

public class Topic4_Ts_MethodsCont3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Please enter your birth year");
            int BirthYear = scan.nextInt();
            int MyAge = CalculateAge(BirthYear);
            CheckAndPrint(MyAge);


        }
    }

    public static int CalculateAge(int BirthYear) {
        int Age = 2024-BirthYear;
        return Age;
    }
    public static void CheckAndPrint (int Age){
        if (Age >= 19){
            System.out.println("You can buy liquor!");
        }else{
            System.out.println("You can not so get the fuck out!");
        }
    }

}




