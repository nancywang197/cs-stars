import org.junit.Test;
import static org.junit.Assert.*;

public class HumanEval20Test {

    @Test
    public void testFindClosestElements() {
        double[] values = {1.0, 2.0, 3.9, 4.0, 5.0, 2.2};
        double[] result = findClosestElements(values);
        assertArrayEquals(new double[]{3.9, 4.0}, result, 0.01); // tolerance for floating point comparison

        values = new double[]{1.0, 2.0, 5.9, 4.0, 5.0};
        result = findClosestElements(values);
        assertArrayEquals(new double[]{5.0, 5.9}, result, 0.01);

        values = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 2.2};
        result = findClosestElements(values);
        assertArrayEquals(new double[]{2.0, 2.2}, result, 0.01);

        values = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 2.0};
        result = findClosestElements(values);
        assertArrayEquals(new double[]{2.0, 2.0}, result, 0.01);

        values = new double[]{1.1, 2.2, 3.1, 4.1, 5.1};
        result = findClosestElements(values);
        assertArrayEquals(new double[]{2.2, 3.1}, result, 0.01); // tolerance for floating point comparison
    }

    public static class Pair {
        public double first;
        public double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }
    }

    public static Pair[] findClosestElements(double[] values) {
        // implementation of findClosestElements method
        // for simplicity, let's assume it returns an array of pairs where each pair contains two consecutive elements with the smallest difference
        int n = values.length - 1; // assuming array length is always odd
        Pair[] result = new Pair[n / 2]; // calculate number of pairs

        double minDiff = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            double diff = Math.abs(values[i] - values[i + 1]);
            if (diff < minDiff) {
                minDiff = diff;
                result[(i / 2)] = new Pair(values[i], values[i + 1]);
            }
        }

        return result;
    }
}