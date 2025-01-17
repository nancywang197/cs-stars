import java.util.HashMap;
import java.util.Map;

public class HumanEval_19 {
    public static String sortNumbers(String numbers) {
        Map<String, Integer> valueMap = new HashMap<>();
        valueMap.put("zero", 0);
        valueMap.put("one", 1);
        valueMap.put("two", 2);
        valueMap.put("three", 3);
        valueMap.put("four", 4);
        valueMap.put("five", 5);
        valueMap.put("six", 6);
        valueMap.put("seven", 7);
        valueMap.put("eight", 8);
        valueMap.put("nine", 9);

        String[] words = numbers.split("\\s+");
        int[] values = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            values[i] = valueMap.get(words[i]);
        }

        java.util.Arrays.sort(values);
        StringBuilder sortedStringBuilder = new StringBuilder();
        for (int i : values) {
            sortedStringBuilder.append(i).append(" ");
        }
        return sortedStringBuilder.toString().trim();
    }

    
}