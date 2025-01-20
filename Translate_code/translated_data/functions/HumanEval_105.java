import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HumanEval_105 {
    /**
     * Given an array of integers, return a new array containing the string representations of the integers from a dictionary, sorted in descending order.
     * Integers not found in the dictionary are ignored.
     *
     * @param arr The input array of integers.
     * @return A new array containing the string representations of the integers, sorted in descending order.
     */
    public List<String> by_length(List<Integer> arr) {
        Map<Integer, String> dic = new HashMap<>();
        dic.put(1, "One");
        dic.put(2, "Two");
        dic.put(3, "Three");
        dic.put(4, "Four");
        dic.put(5, "Five");
        dic.put(6, "Six");
        dic.put(7, "Seven");
        dic.put(8, "Eight");
        dic.put(9, "Nine");

        Collections.sort(arr, Collections.reverseOrder());
        List<String> new_arr = new ArrayList<>();
        for (int var : arr) {
            if (dic.containsKey(var)) {
                new_arr.add(dic.get(var));
            }
        }
        return new_arr;
    }
}
