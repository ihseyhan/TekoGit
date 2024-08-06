package Day04_IfStatements;

import java.util.Scanner;

public class Topic10_TS_ScannerCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter your age");
        int Age = scan.nextInt();

        scan.nextLine(); //Bu onemli asagida ki soruya gecmesi icin

        System.out.println("Please enter your favorite team");
        String FavoriteTeam = scan.nextLine();

        System.out.println("Your age is "+Age+" and your favorite team "+FavoriteTeam);
    }
}
