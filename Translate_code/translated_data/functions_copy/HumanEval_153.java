package com.example.python_to_java.functions_copy;
import java.util.List;
import java.util.ArrayList;
public class HumanEval_153 {
    /**
     * Given a class name and a list of extensions, find the strongest extension.
     * The strongest extension is the one with the largest difference between the number of uppercase and lowercase letters.
     *
     * @param class_name The name of the class.
     * @param extensions The list of extensions.
     * @return The strongest extension.
     */
    public String Strongest_Extension(String class_name, String[] extensions) {
        String strong = extensions[0];
        int my_val = 0;
        for (char x : extensions[0].toCharArray()) {
            if (Character.isUpperCase(x)) {
                my_val++;
            } else if (Character.isLowerCase(x)) {
                my_val--;
            }
        }

        for (String s : extensions) {
            int val = 0;
            for (char x : s.toCharArray()) {
                if (Character.isUpperCase(x)) {
                    val++;
                } else if (Character.isLowerCase(x)) {
                    val--;
                }
            }
            if (val > my_val) {
                strong = s;
                my_val = val;
            }
        }

        return class_name + "." + strong;
    }
}
