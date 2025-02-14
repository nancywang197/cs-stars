package com.example.python_to_java.functions_copy;
public class HumanEval_144 {
    /**
     * Given two fractions as strings, determine if their product is an integer.
     *
     * @param x The first fraction, in the form "a/b".
     * @param n The second fraction, in the form "c/d".
     * @return True if the product of the two fractions is an integer, False otherwise.
     */
    public boolean simplify(String x, String n) {
        String[] partsX = x.split("/");
        String[] partsN = n.split("/");
        int a = Integer.parseInt(partsX[0]);
        int b = Integer.parseInt(partsX[1]);
        int c = Integer.parseInt(partsN[0]);
        int d = Integer.parseInt(partsN[1]);
        int numerator = a * c;
        int denom = b * d;
        return numerator % denom == 0;
    }
}
