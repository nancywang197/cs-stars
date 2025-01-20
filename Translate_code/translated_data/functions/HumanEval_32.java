import java.util.List;

class HumanEval_32 {
    /**
     * Evaluates a polynomial at a given point.
     *
     * @param xs The coefficients of the polynomial.
     * @param x The point at which to evaluate the polynomial.
     * @return The value of the polynomial at x.
     */
    public double poly(List<Double> xs, double x) {
        double sum = 0;
        for (int i = 0; i < xs.size(); i++) {
            sum += xs.get(i) * Math.pow(x, i);
        }
        return sum;
    }

    /**
     * Finds a zero of a polynomial using the bisection method.
     *
     * @param xs The coefficients of the polynomial.
     * @return An approximation of a zero of the polynomial.
     */
    public double find_zero(List<Double> xs) {
        double begin = -1.0;
        double end = 1.0;
        while (poly(xs, begin) * poly(xs, end) > 0) {
            begin *= 2.0;
            end *= 2.0;
        }
        while (end - begin > 1e-10) {
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
