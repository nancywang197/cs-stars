import java.util.Arrays;

public class Main {
    public static int[] makeAPile(int n) {
        int[] pile = new int[n];
        for (int i = 0; i < n; i++) {
            pile[i] = n + 2 * i;
        }
        return pile;
    }

    
}