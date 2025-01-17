import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_4Test {

    @Test
    public void test_HumanEval_4() {
        double[] data1 = {1.0, 2.0, 3.0};
        assertEquals(2.0 / 3.0, meanAbsoluteDeviation(data1), 1e-6);

        double[] data2 = {1.0, 2.0, 3.0, 4.0};
        assertEquals(1.0, meanAbsoluteDeviation(data2), 1e-6);

        double[] data3 = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertEquals(6.0 / 5.0, meanAbsoluteDeviation(data3), 1e-6);
    }

    // You need to have the same method in your Java class
    private static double meanAbsoluteDeviation(double[] data) {
        // implementation of your method remains the same
    }
}