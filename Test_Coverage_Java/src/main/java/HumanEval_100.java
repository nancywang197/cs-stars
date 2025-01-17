import java.util.Arrays;

public class HumanEval_100 {
    public static int[] makeAPile(int n) {
        int[] pile = new int[n];
        for (int i = 0; i < n; i++) {
            pile[i] = n + 2 * i;
        }
        return pile;
    }

    
}