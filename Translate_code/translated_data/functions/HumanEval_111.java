import java.util.HashMap;
import java.util.Map;

class HumanEval_111 {
    /**
     * Given a string, return a dictionary containing the frequency of each word. The dictionary should only contain the words with the highest frequency.
     *
     * @param test The input string.
     * @return A dictionary containing the frequency of each word.
     */
    public Map<String, Integer> histogram(String test) {
        Map<String, Integer> dict1 = new HashMap<>();
        String[] list1 = test.split(" ");
        int t = 0;

        for (String i : list1) {
            int count = 0;
            for(String j : list1){
                if(i.equals(j) && !i.equals("")){
                    count++;
                }
            }
            if (count > t && !i.equals("")) {
                t = count;
            }
        }

        if (t > 0) {
            for (String i : list1) {
                int count = 0;
                for(String j : list1){
                    if(i.equals(j) && !i.equals("")){
                        count++;
                    }
                }
                if (count == t) {
                    dict1.put(i, t);
                }
            }
        }
        return dict1;
    }
}
