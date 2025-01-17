import java.util.ArrayList;
import java.util.Collections;

public class CollatzSequence {
    public static ArrayList<Integer> getOddCollatz(int n) {
        if (n % 2 == 0) {
            ArrayList<Integer> oddCollatz = new ArrayList<>();
        } else {
            ArrayList<Integer> oddCollatz = new ArrayList<>();
            oddCollatz.add(n);
        }

        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }

            if (n % 2 == 1) {
                oddCollatz.add(n);
            }
        }

        // Sort the list before returning
        Collections.sort(oddCollatz);
        return oddCollatz;
    }

    
}