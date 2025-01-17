import java.util.HashMap;
import java.util.Map;

public class Histogram {
    public static Map<String, Integer> histogram(String test) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        String[] words = test.split("\\s+");

        int maxFrequency = 0;
        for (String word : words) {
            if (!word.isEmpty()) {
                int count = 0;
                for (String w : words) {
                    if (w.equals(word)) {
                        count++;
                    }
                }
                if (count > maxFrequency) {
                    maxFrequency = count;
                }
            }
        }

        for (String word : words) {
            if (!word.isEmpty() && frequencyMap.containsKey(word)) {
                continue;
            }
            int count = 0;
            for (String w : words) {
                if (w.equals(word)) {
                    count++;
                }
            }
            if (count == maxFrequency) {
                frequencyMap.put(word, maxFrequency);
            }
        }

        return frequencyMap;
    }

    
}