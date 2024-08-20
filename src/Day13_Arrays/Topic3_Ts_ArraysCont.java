package Day13_Arrays;

public class Topic3_Ts_ArraysCont {
    public static void main(String[] args) {
        int [] Numbers = {7, 55 ,26, 35, 51, 44, 0, -90};

        System.out.println("The first number is = "+Numbers[0]);
        Numbers[0]= 11;
        System.out.println("The post of first number is ="+Numbers[0]);


        String [] Cars = {"Tesla", "Volkswagen", "BMW", "Mercedes-Benz"};
        for (int i = 0; i < Cars.length ; i++) {
            System.out.println(Cars[i]);
        }
        System.out.println("********The New Car List********");
        Cars[1]= "AUDI";
        Cars[0]= "Ferrari";
        for (int i = 0; i < Cars.length; i++) {

      System.out.println(Cars[i]);
        }

    }
}
