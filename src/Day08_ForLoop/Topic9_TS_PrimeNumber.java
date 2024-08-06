package Day08_ForLoop;

public class Topic9_TS_PrimeNumber {
    public static void main(String[] args) {
        /*
        What are prime numbers?

       Kendisine ve 1'e bolunebilen sayilar prime sayilardir.
       exp: 2,3,5,7,11,13,etc..

       7/2 Kalan     = 1    2*3 + 1
       7/3 Kalan     = 1    3*2 + 1
       7/4 Remainder = 3    4*1 + 3
       7/5 Remainder = 2    5*1 + 2
       7/6 Remainder = 1    6*1 + 1

       6/2 Remainder = 0    2*3 + 0
         */
        int Number = 7;
        boolean IsItAPrimeNumber = true;
        for (int i = 2; i <= Number -1 ; i++) {
            int Remainder = Number % i;
            if (Remainder == 0) {
                IsItAPrimeNumber = false;
            }
        }
        if(IsItAPrimeNumber == true){
            System.out.println("It is a prime number");
        }else{
            System.out.println("It is not a prime number");
        }
        }


}
