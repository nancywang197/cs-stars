import java.util.Arrays;

public class Main {

    public static boolean willItFly(int[] q, int w) {
        if (Arrays.stream(q).sum() > w) {
            return false;
        }

        for (int i = 0; i < q.length / 2; i++) {
            if (q[i] != q[q.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}