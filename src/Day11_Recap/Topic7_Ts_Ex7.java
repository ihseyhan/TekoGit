package Day11_Recap;

public class Topic7_Ts_Ex7 {
    public static void main(String[] args) {
        String sentence = "Java is fun, but sometimes java can be just pain. Love java java java.";

        // Convert the string to lowercase to make the search case-insensitive
        sentence = sentence.toLowerCase();

        // Initialize a counter
        int count = 0;

        // Loop through the string and count occurrences of 'j'
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'j') {
                count++;
            }
        }

        // Display the result
        System.out.println("The character 'j' is found " + count + " times in the sentence.");

    }
}
