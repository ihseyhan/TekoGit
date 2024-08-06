package Day04_IfStatements;

public class Topic6_TS_IfElseIF {
    public static void main(String[] args) {

        // a number can be positive, negative or equal to 0
       /*
        if (check if it is positive){
        say it is positive
        }else if(check if it is negative){
        }
        }
         else if (equal to 0){
         }
        */

        /*
        ----TWO POSSIBILITIES****
         */
            int Number = 10;
            if (Number > 0){
                System.out.println("it is positive!");
        } else if(Number < 0){
                System.out.println("it is negative!");
            } else if (Number == 0){
                System.out.println("it is equal to 0");

            }
        System.out.println("End of the code");
    }
}
