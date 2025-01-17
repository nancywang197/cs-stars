import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_32Test {

    private Random rng = new Random(42);
    private double[] coeffs, solution;
    private boolean success;

    @Test
    public void test_HumanEval_32() {
        for (int i = 0; i < 100; i++) {
            int ncoeff = 2 * rng.nextInt(4) + 1; // equivalent to Python's rng.randint(1, 4)
            coeffs = new double[ncoeff];
            solution = new double[3]; // assuming a cubic equation
            for (int j = 0; j < ncoeff; j++) {
                coeffs[j] = rng.nextDouble() * 20 - 10;
                if (rng.nextBoolean()) { // equivalent to Python's coeff == 0
                    coeffs[j] = 1;
                }
            }
            
            success = findZero(coeffs, solution);
            assertEquals(0, success ? 1 : -1); // asserting the opposite of math.fabs(poly(coeffs, solution)) < 1e-4
        }
    }

    private boolean findZero(double[] coeffs) {
        // implementation of HumanEval_32.find_zero function
        // for simplicity, let's assume a simple Newton-Raphson method
        double x = -coeffs[0] / coeffs[1];
        double delta = 100; // initial guess for delta
        while (Math.abs(delta) > 1e-6) {
            double f = evaluate(coeffs, x);
            double df = evaluateDerivatives(coeffs, x);
            if (f == 0) return true;
            x -= f / df;
            delta = Math.abs(x - findRoot(coeffs));
        }
        return false;
    }

    private double evaluate(double[] coeffs, double x) {
        double result = 0;
        for (int j = 1; j < coeffs.length; j++) {
            if (j > 1) result *= x;
            result += coeffs[j] * Math.pow(x, j - 1);
        }
        return result;
    }

    private double evaluateDerivatives(double[] coeffs, double x) {
        double result = 0;
        for (int j = 1; j < coeffs.length; j++) {
            if (j > 1) result += coeffs[j] * Math.pow(x, j - 2);
        }
        return result;
    }

}