package Day19_Methods;

import java.util.Scanner;

public class Topic4_Example3TheGame {
    public static void main(String[] args) {
        /*
Create a method which simulates the game "rock, paper, scissors"
The function takes the input of both players.
First paramter from first player, second from second player.
The fucntion return the result as such:
Rock beats scissors, paper beats rock, scissors beat paper.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter Player 1`s move : ");
        String Player1 = scan.next();

        System.out.println("Please enter Player 2`s move : ");
        String Player2 = scan.next();

        rps(Player1, Player2);

    }

    public static void rps(String First, String Second) {

        if (First.equals("Rock")) {
            if (Second.equals("Rock")) {
                System.out.println("TIE!");
            } else if (Second.equals("Paper")) {
                System.out.println("Player 2 wins!");
            } else {
                System.out.println("Player 1 wins!");
            }
        } else if (First.equals("Paper")) {


            if (Second.equals("Rock")) {
                System.out.println("Player 1 wins!");
            } else if (Second.equals("Paper")) {
                System.out.println("TIE!");
            } else {
                System.out.println("Player 2 wins!");
            }

        } else {

            if (Second.equals("Rock")) {
                System.out.println("Player 2 wins!");
            } else if (Second.equals("Paper")) {
                System.out.println("Player 1 wins!");
            } else {
                System.out.println("TIE!");
            }


        }
    }
}