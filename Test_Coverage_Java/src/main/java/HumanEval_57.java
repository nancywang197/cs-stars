import java.util.Arrays;

public class HumanEval_57 {
    public static boolean isMonotonic(int[] l) {
        Arrays.sort(l);
        return l == l.clone();
    }

}