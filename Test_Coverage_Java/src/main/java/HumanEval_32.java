import java.util.Arrays;

public class HumanEval_32 {

    public static double poly(double[] xs, double x) {
        double sum = 0;
        for (int i = 0; i < xs.length; i++) {
            sum += xs[i] * Math.pow(x, i);
        }
        return sum;
    }

    public static double findZero(double[] xs) {
        if (xs == null || xs.length == 0) {
            throw new IllegalArgumentException("Input array cannot be empty");
        }

        double begin = -1.0;
        double end = 1.0;

        while ((poly(xs, begin) * poly(xs, end)) > 0) {
            begin *= 2.0;
            end *= 2.0;
        }

        while (Math.abs(end - begin) > 1e-10) {
            double center = (begin + end) / 2.0;
            if (poly(xs, center) * poly(xs, begin) > 0) {
                begin = center;
            } else {
                end = center;
            }
        }

        return begin;
    }
}