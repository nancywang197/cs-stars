import java.util.*;

public class Main {
    public static String[] sortByLength(int[] arr) {
        Map<Integer, String> dic = new HashMap<>();
        for (int i = 1; i <= 9; i++) {
            dic.put(i, convertToWord(i));
        }
        
        Arrays.sort(arr);
        List<String> result = new ArrayList<>();
        
        for (int var : arr) {
            if (dic.containsKey(var)) {
                result.add(dic.get(var));
            } else {
                // Handle the case where the number is not in the dictionary
                // For example, you could add a null value or throw an exception
                result.add(null);
            }
        }
        
        return result.toArray(new String[0]);
    }

    private static String convertToWord(int num) {
        switch (num) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

}