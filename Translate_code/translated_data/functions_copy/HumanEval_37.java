package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanEval_37 {
    /**
     * Given a list, sort the even-indexed elements and interleave them with the odd-indexed elements.
     *
     * @param l The input list.
     * @return The sorted list.
     */
    public List<Integer> sort_even(List<Integer> l) {
        List<Integer> evens = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            if (i % 2 == 0) {
                evens.add(l.get(i));
            } else {
                odds.add(l.get(i));
            }
        }
        Collections.sort(evens);
        List<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < evens.size() || j < odds.size()){
            if(i < evens.size()){
                ans.add(evens.get(i));
                i++;
            }
            if(j < odds.size()){
                ans.add(odds.get(j));
                j++;
            }
        }

        return ans;
    }
}
