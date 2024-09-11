package Day19_Methods;

import java.util.Scanner;

public class Topic2_PrimeNumbersintquestion {
    public static void main(String[] args) {
        //Given two numbers a and b as interval range, the task is to find the prime numbers in between this interval
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a : ");
        int a = scan.nextInt();

        System.out.println("Please enter b : ");
        int b = scan.nextInt();

        for (int i = a; i <= b ; i++) {
        boolean IsItPrimeNumber = IsItPrime(i);

        if (IsItPrimeNumber == true){

            System.out.println(i+ " is a prime number");


        }
        }
    }
    public static boolean IsItPrime (int Number){
       boolean IsItPrimeNumber = true;
        if (Number <= 1){
            IsItPrimeNumber = false;
        }


        for (int i = 2; i <= Number - 1 ; i++) {
            int Remainder = Number % i;
            if(Remainder==0){
            IsItPrimeNumber = false;
            break;
            }

        }
    return IsItPrimeNumber;
    }
}
