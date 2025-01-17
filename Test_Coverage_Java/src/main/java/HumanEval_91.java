import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static int isBored(String s) {
        // Use regular expression to split the string into sentences
        String[] sentences = Pattern.compile("[.?!]").split(s);
        
        // Initialize a counter for bored users
        int boredomCount = 0;
        
        // Check each sentence
        for (String sentence : sentences) {
            if (!sentence.isEmpty()) { // Ignore empty strings
                // If the first two characters are 'I ', increment the boredom count
                if (sentence.substring(0, 2).equals("I ")) {
                    boredomCount++;
                }
            }
        }
        
        return boredomCount;
    }

    
}