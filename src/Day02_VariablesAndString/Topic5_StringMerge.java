package Day02_VariablesAndString;

public class Topic5_StringMerge {
    public static void main(String[] args) {
        String Name = "Teko";
        String Surname = "Seyhan";

        System.out.println(Name);
        System.out.println(Surname);


        System.out.println(Name + Surname);

        String FullName = Name +" " + Surname;
        System.out.println(FullName);

        System.out.println("My surname is = " +Surname);

        System.out.println("Hello, my name is "+Name +" and my surname is " +Surname);

        int Year = 2022; // this is a number

        System.out.println("We are in "+Year);



        char ch = 'R';

        String Company = "Toys"+"-"+ch+" "+"Us";
        System.out.println(Company);

        char Char_1 = 'A';
        char Char_2 = '1';

        System.out.println(Char_1+Char_2);


    }
}

