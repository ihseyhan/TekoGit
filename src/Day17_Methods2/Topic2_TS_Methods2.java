package Day17_Methods2;

public class Topic2_TS_Methods2 {
    public static void main(String[] args) {

    Kitchen("Tomatoes", "Salt", "Olive Oil");

    }
    public static void Kitchen (String Veggies, String Salt, String Oil){

    String Food = Veggies+Salt+Oil;
    String VeggieAndSalt = Veggies.concat(Salt);
    String VeggieSaltAndOil = VeggieAndSalt.concat(Oil);

        System.out.println("Food = " + Food);
        System.out.println("VeggieSaltAndOil = " + VeggieSaltAndOil);

        String Fancy = Veggies.concat(Salt).concat(Oil).concat(Veggies);
        System.out.println("Fancy = " + Fancy);

        SumSum(25,35);


    }
    public static void SumSum (int Number1, int Number2){
        int Sum = 0;
        Sum = Number1+Number2;
        System.out.println("Sum = " + Sum);

    }


}
