package Day04_IfStatements;

public class Topic2_TS_IfStatementsCont {
    public static void main(String[] args) {

        //Write a code that check eligibility of voting

        //If you are 18 and up, you can vote, or else you can not!

        int Age = 17;

        if (Age >= 18){

            System.out.println("You are eligible to vote!");
        }

        if (Age < 18){

            System.out.println("You are not eligible to vote!");
        }

    }
}
