package Day06_StringAndStringMethods;

public class Topic4_TS_String {
    public static void main(String[] args) {
        /*
        String is important
        string is an object that represents a sequence of chars
        'a'
        "abc"
        How to create a string object?
        There are two ways to create String object.

        1) String Literal

        String s = "Something";
        String s2 = "another thing"; // string pool
        //String pool and heap memory
        Above is going to go to String Pool

       2) New Keyword
       Scanner scan = new Scanner(parameter(ex:System.in)); <- How we are defining a scanner

      // ObjectType VariableName = new ObjectType(parameter); this is how we are defining an object

      String s3 = new String("Something"); <- Heap Memory
      String s3 = "something";             <- String pool
      */

        String s1 = "cat";
        String s2 = "cat";
        String s3 = new String("cat");

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
    }
}
