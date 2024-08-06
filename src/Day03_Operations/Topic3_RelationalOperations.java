package Day03_Operations;

public class Topic3_RelationalOperations {
    public static void main(String[] args) {
        // check if it is equal

        int N1 =10;

        //Boolean this variable type only can be true or false

        boolean IsItEqual = N1 == 10;
        System.out.println(IsItEqual);

        boolean Tekosin = N1 < 50;
        System.out.println(Tekosin);

        //Greater than and equal: >=

        boolean IsItGreaterAndEqual = N1 >= 10;

        System.out.println(IsItGreaterAndEqual);



        //Less than and equal: <=

        boolean IsItLessAndEqual = N1 <= 10;
        System.out.println(IsItLessAndEqual);
    
            
        //  NOT equal: !=
        
        boolean B1 = N1 != 15;
        System.out.println("B1 = " + B1);
        
        boolean B3 = true;
        boolean B4 = !B3;
        System.out.println("B4 = " + B4);
        
        boolean B5 = !(N1 == 10);
        System.out.println ("B5 = " + B5);

        String school = "RenasTech";
        boolean B6 = school == "RenasTech";
        System.out.println("B6 =" + B6);
    }
}
