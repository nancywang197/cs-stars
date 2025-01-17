import java.util.Arrays;

public class Main {
    public static String sortEven(String[] l) {
        // Separate even and odd elements into two arrays
        String[] evens = Arrays.copyOfRange(l, 0, l.length / 2 * 2);
        String[] odds = Arrays.copyOfRange(l, l.length / 2 * 2, l.length);

        // Sort the array of even numbers
        Arrays.sort(evens);

        // Initialize result array and add elements from even and odd arrays
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < evens.length; i++) {
            ans.append(evens[i]);
            if (i < odds.length) { 
                ans.append(odds[i]); 
            } else if (i == evens.length) { 
                ans.append(evens[evens.length - 1]); 
            }
        }

        // Return the result as a string
        return ans.toString();
    }
}