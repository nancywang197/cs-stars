import java.util.Arrays;

public class Main {
    public static boolean isMonotonic(int[] l) {
        Arrays.sort(l);
        return l == l.clone();
    }

    ;
        System.out.println(isMonotonic(testArray)); // prints: true

        int[] reverseTestArray = {5, 4, 3, 2, 1};
        System.out.println(isMonotonic(reverseTestArray)); // prints: true
    }
}