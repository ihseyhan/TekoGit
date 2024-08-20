package Day14_Arrays;

public class Topic2_TS_SwapValuesExamples {
    public static void main(String[] args) {
        String Car1 = "BMW";
        String Car2 = "Toyota";

        System.out.println("Car1 = " + Car1);
        System.out.println("Car2 = " + Car2);

        String temp = Car1;
        Car1 = Car2;
        Car2 = temp;

        System.out.println("Car1 = " + Car1);
        System.out.println("Car2 = " + Car2);


        System.out.println("***********************************");

        double Number1 = 55.87;
        double Number2 = 99.15;
        System.out.println("Number1 = " + Number1);
        System.out.println("Number2 = " + Number2);

        double temp2 = Number1;
        Number1 = Number2;
        Number2 = temp2;

        System.out.println("Number1 = " + Number1);
        System.out.println("Number2 = " + Number2);


    }
}
