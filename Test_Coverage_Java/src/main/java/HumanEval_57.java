import java.util.Arrays;

public class Main {
    public static boolean isMonotonic(int[] l) {
        Arrays.sort(l);
        return l == l.clone();
    }

}