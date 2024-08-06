package Day05_SwitchStatements;

import java.util.Scanner;

public class Topic2_TS_IfExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many call did you do?");
        int Call = scan.nextInt();
        double BillAmount = 0;

        if (Call <= 100) {
            BillAmount = 200;
        }
        else if (Call > 100 && Call <= 150) {
            BillAmount = 200 + (Call - 100) * 0.6;
        }
        else if (Call> 150 && Call<=200){
            BillAmount = 200+ 50 *0.6 + (Call-150) *0.50;
        }

        else if(Call>200 ){

            BillAmount = 200+ 50*0.6 +50* 0.5 + (Call-200) *0.4;
        }
        System.out.println(BillAmount);

    }

    }
