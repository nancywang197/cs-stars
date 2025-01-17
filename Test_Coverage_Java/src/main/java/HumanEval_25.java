import java.util.ArrayList;
import java.util.List;

public class HumanEval_25 {

    public static List<Integer> factorize(int n) {
        List<Integer> factors = new ArrayList<>();
        int i = 2;
        while (i * i <= n) { // changed condition to avoid unnecessary iterations
            if (n % i == 0) {
                factors.add(i);
                n /= i; // integer division in Java
            } else {
                i++;
            }
        }

        if (n > 1) {
            factors.add(n);
        }
        return factors;
    }

    
}