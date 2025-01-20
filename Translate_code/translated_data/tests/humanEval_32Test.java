import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static org.junit.Assert.assertTrue;

public class HumanEval_32Test {

    @Test
    public void testHumanEval_32() {
        Random rng = new Random(42);
        for (int _ = 0; _ < 100; _++) {
            int ncoeff = 2 * rng.nextInt(4) + 2;
            List<Double> coeffs = new ArrayList<>();
            for (int i = 0; i < ncoeff; i++) {
                double coeff = rng.nextInt(21) - 10;
                if (coeff == 0) {
                    coeff = 1;
                }
                coeffs.add(coeff);
            }
            HumanEval_32 testInstance = new HumanEval_32();
            List<Double> coeffsCopy = new ArrayList<>(coeffs);
            double solution = testInstance.find_zero(coeffsCopy);
            double polyVal = testInstance.poly(coeffs, solution);
            assertTrue(Math.abs(polyVal) < 1e-4);
        }
    }
}
