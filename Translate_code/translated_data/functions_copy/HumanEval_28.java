package com.example.python_to_java.functions_copy;
import java.util.List;

public class HumanEval_28 {
    /**
     * Given a list of strings, concatenate them together.
     *
     * @param strings The list of strings to concatenate.
     * @return The concatenated string.
     */
    public String concatenate(List<String> strings) {
        StringBuilder sb = new StringBuilder();
        for (String s : strings) {
            sb.append(s);
        }
        return sb.toString();
    }
}
