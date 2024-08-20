package Day12_Recap;

import java.util.Random;
import java.util.Scanner;

public class Topic1_Ts {
    public static void main(String[] args) {
        Random random = new Random();
        int RandomNumber = random.nextInt(100)+1;
        System.out.println("RandomNumber = " + RandomNumber);

        Scanner scan = new Scanner(System.in);
        int userGuess = 0;

        while (userGuess != RandomNumber){
            System.out.println("Guess a number between 1 and 100");
            userGuess = scan.nextInt();

            if (userGuess > RandomNumber) {
                System.out.println("its higher, go lower!");
            }else if (userGuess < RandomNumber){
                System.out.println("it is lower, go Higher!");
            }else{
                System.out.println("Correct, you have guessed the number!");

            }

        }

        }
}
