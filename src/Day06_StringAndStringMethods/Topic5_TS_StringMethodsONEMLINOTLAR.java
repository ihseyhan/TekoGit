package Day06_StringAndStringMethods;

public class Topic5_TS_StringMethodsONEMLINOTLAR {
    public static void main(String[] args) {
        /*
    Methods            Descriptions                                                    Return Type

    charAt()           Returns the character at the specified index(position)          char
    concat()           Appends a string to the end of another string                   String
    contains()         Checks whether a string contains a sequence of character        boolean
    endsWith()         Checks whether a string ends with the specified character(s)    boolean
    equals()           Compares twi strings. Returns true if the strings are equal     boolean
    equalsIgnoreCase() Compares two strings, ignoring case consideration               boolean
    indexOf()          Returns the position of the first found occurrence
                       of specified characters in a string                             int
    isEmpty()          Checks whether a string is empty or not                         boolean
    lastIndexOf()      Returns the position of the last found occurrence
                       of specified characters in a string                             int
    lenght()           Returns the length of a specified string                        int
    replace()          Searches a string for a specified value, and returns
                       a new string where the specified values are replaced            String
    replaceFirst()     Replaces the first occurrence of a substring that matches
                       the given regular expression with the given replacement         String
    startsWith()       Checks whether a string starts with specified characters        boolean
    substring()        Extracts the characters from a string,
                       beginning at a specified start position,
                       and through the specified number of characters                  String
    toLowerCase()      Converts a string to lower case letters                         Strings
    toUpperCase()      Converts a string to upper case letters                         Strings
    trim()             Removes whitespace from both ends of a string                   String

         */



        String s = "I`m a lazy person";
        String s2 = "Elizabeth Rebecca";

        System.out.println(s2.charAt(10));
        System.out.println(s2.charAt(9));
        System.out.println(s2.charAt(5));

        String s3 = "Real";
        String s4 = "Madrid";

        System.out.println(s3.concat(s4));

        String s5 = "Java";
        System.out.println(s5.contains("J"));

        String s6 = "I`m a lazy person";
        boolean IsItEndsWithSon = s6.endsWith("son");
        System.out.println("IsItEndsWithSon = " + IsItEndsWithSon);
        
        boolean IsItStartingWithI = s6.startsWith("I`m");
        System.out.println("IsItStartingWithI = " + IsItStartingWithI);

        String cat1 = "Cat";
        String cat2 = new String("cat");
        System.out.println(cat1.equals(cat2));

        System.out.println(cat1.equalsIgnoreCase(cat2));

        //Indexof()

        String City = "Toronto-Ontario Canada";
        System.out.println(City.indexOf("-"));
        int position = City.indexOf(" ");
        System.out.println("position = " + position);

        //IsEmpty:

        String e = "";
        boolean IsItEmpty = e.isEmpty();
        System.out.println("IsItEmpty = " + IsItEmpty);

        //LastIndexOf()

        String Country = "United States of America";
        System.out.println(Country.lastIndexOf("e"));
        
        //Length();
        
        String MyName = "Teko";
        System.out.println("MyName = " + MyName);
        System.out.println("The length of " + MyName+ " is "+MyName.length());


        //replace(); replacing value of inside the string

        String Word = "Canada is beautiful, Canada is awesome";
        String NewWord = Word.replace("Canada", "USA");
        System.out.println("NewWord = " + NewWord);

        //ReplaceFirst:

        String NewWord2 = Word.replaceFirst("Canada", "USA");
        System.out.println("NewWord2 = " + NewWord2);
        
        
        //Substring() = 
        String FullName = "Alexander Graham Bell";
        String MiddleName = FullName.substring(10, 16);
        System.out.println("MiddleName = " + MiddleName);
        String SurName = FullName.substring(17, 21);
        System.out.println("SurName = " + SurName);
        String FirstName = FullName.substring(0, 9);
        System.out.println("FirstName = " + FirstName);
        String SurName2 = FullName.substring(17);
        System.out.println("SurName2 = " + SurName2);
        String MiddleAndLastName = FullName.substring(10);
        System.out.println("MiddleAndLastName = " + MiddleAndLastName);


        //ToLowerCase() Converts a string to lower case.

        String Word2 = "CANADA IS BEAUTIFUL!";
        System.out.println(Word2.toLowerCase());

        //ToUpperCase()

        String Word3 = "USA is PeRfEcT!";
        System.out.println(Word3.toUpperCase());

        //Trim() Removes white sppaces from both ends

        String Word4 = "    Can ada     ";
        Word4 = Word4.replace(" " , "");
        System.out.println("Word4 = " + Word4);
        Word4 = Word4.trim();
        System.out.println(Word4.trim());
        boolean b = Word4.equals("Canada");
        System.out.println("b = " + b);



    }
}
