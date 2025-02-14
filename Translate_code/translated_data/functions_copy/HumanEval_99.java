package com.example.python_to_java.functions_copy;
public class HumanEval_99 {
    /**
     * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.
     * Examples
     * >>> closest_integer("10")
     * 10
     * >>> closest_integer("15.3")
     * 15
     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     */
    public int closest_integer(String value) {
        if (value.contains(".")) {
            while (value.endsWith("0")) {
                value = value.substring(0, value.length() - 1);
            }
        }

        double num = Double.parseDouble(value);
        if (value.endsWith(".5")) {
            if (num > 0) {
                return (int) Math.ceil(num);
            } else {
                return (int) Math.floor(num);
            }
        } else if (value.length() > 0) {
            return (int) Math.round(num);
        } else {
            return 0;
        }
    }
}
