package com.example.python_to_java.functions_copy;
import java.util.ArrayList;
import java.util.List;

public class HumanEval_113 {
    /**
     * Given a list of lists of strings, return a list of strings.  Each string in the result should be of the form:
     * "the number of odd elements n the strng of the nput." where n is the number of odd numbers in the corresponding sublist.
     * For example:
     * odd_count([['1','2','3'],['4','5','6']]) == ['the number of odd elements 2n the str2ng 2 of the 2nput.', 'the number of odd elements 1n the str1ng 1 of the 1nput.']
     * @param lst A list of lists of strings
     * @return A list of strings
     */
    public List<String> odd_count(List<List<String>> lst) {
        List<String> res = new ArrayList<>();
        for (List<String> arr : lst) {
            int n = 0;
            for (String d : arr) {
                try{
                    if (Integer.parseInt(d) % 2 == 1) {
                        n++;
                    }
                } catch (NumberFormatException e){
                    //Handle non-integer strings as needed.  Here, we ignore them.
                }
            }
            res.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput.");
        }
        return res;
    }
}
