import java.util.ArrayList;

public class HumanEval_106 {
    public static ArrayList<Integer> f(int n) {
        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                long x = 1;
                for (long j = 1; j <= i; j++) {
                    x *= j;
                }
                ret.add((int)x);
            } else {
                int x = 0;
                for (int j = 1; j <= i; j++) {
                    x += j;
                }
                ret.add(x);
            }
        }
        return ret;
    }

    
}