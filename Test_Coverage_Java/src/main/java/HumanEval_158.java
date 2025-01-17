import java.util.Arrays;
import java.util.Comparator;

public class HumanEval_158 {
    public static String findMax(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Remove duplicate characters from each string
                Set<Character> set1 = getSet(s1);
                Set<Character> set2 = getSet(s2);

                // Compare the lengths of the sets in descending order
                if (set1.size() > set2.size()) {
                    return -1;
                } else if (set1.size() < set2.size()) {
                    return 1;
                } else {
                    return s1.compareTo(s2);
                }
            }

            private Set<Character> getSet(String s) {
                // Use a HashSet to remove duplicate characters
                java.util.HashSet<Character> set = new java.util.HashSet<>();
                for (char c : s.toCharArray()) {
                    set.add(c);
                }
                return set;
            }
        });

        return words[0];
    }

}