package Day04_IfStatements;

public class Topic5_TS_OddEven {
    public static void main(String[] args) {

        //find odd or even
        //even number 2 4 8 20 <- they can divide to 2 thats why they are even
        // odd numbers 1 3 15 99 <- they can not divide to 2
        
        int Number = 12;
        int Remainder = Number % 2; // modulo, remainder % <- defines remainder

        System.out.println("Remainder = " + Remainder);

        // I will get either 1 or 0
        // If it is 1, it is an odd number
        // If it is 0, it is an even number

        if (Remainder == 1) {

            System.out.println(Number+ " is an odd number!");
        }else{
            System.out.println(Number+ " is an even number!");
        }

    }

    }


