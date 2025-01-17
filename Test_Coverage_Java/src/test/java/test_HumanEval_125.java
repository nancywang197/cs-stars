import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanEval_125Test {

    @Test
    void test_HumanEval_125() {
        String result1 = splitWords("Hello world!");
        String[] expected1 = {"Hello", "world!"};
        assertEquals(expected1, result1);

        String result2 = splitWords("Hello,world!");
        String[] expected2 = {"Hello", "world!"};
        assertEquals(expected2, result2);

        String result3 = splitWords("Hello world,!"); // Fixed punctuation
        String[] expected3 = {"Hello", "world,!"};
        assertEquals(expected3, result3);

        String result4 = splitWords("Hello,Hello,world !");
        String[] expected4 = {"Hello,Hello,world", "!"};
        assertEquals(expected4, result4);

        int result5 = splitWords("abcdef"); // Integer result
        assertEquals(3, result5);

        int result6 = splitWords("aaabb");
        assertEquals(2, result6);

        int result7 = splitWords("aaaBb");
        assertEquals(1, result7); // Fixed case

        String result8 = splitWords("");
        assertEquals(0, result8);
    }

    public static String[] splitWords(String input) {
        if (input.isEmpty()) {
            return new String[0];
        }
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count++;
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar == ',') {
                if (count > 0) {
                    int startIndex = i - count;
                    String[] splitArray = new String[count];
                    for (int j = 0; j < count; j++) {
                        splitArray[j] = input.substring(startIndex, i);
                        startIndex += 1;
                    }
                    return splitArray;
                } else {
                    return new String[0]; // or throw an exception
                }
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count = 1;
            }
        }
        int startIndex = input.length() - 1;
        while (startIndex > 0) {
            char previousChar = input.charAt(startIndex);
            char nextChar = input.charAt(startIndex + 1);
            if ((previousChar == ',' || previousChar == ' ') && nextChar != ',') {
                count++;
            } else if ((previousChar == ',' || previousChar == ' ') && nextChar == ',') {
                int endIndex = startIndex - count;
                String[] splitArray = new String[count];
                for (int j = 0; j < count; j++) {
                    splitArray[j] = input.substring(endIndex, startIndex + 1);
                    endIndex -= 1;
                }
                return splitArray;
            } else if ((previousChar == ',' || previousChar == ' ') && nextChar != ',') {
                count = 1;
                break;
            }
            startIndex--;
        }
        int endIndex = input.length() - 1;
        while (endIndex > 0) {
            char currentChar = input.charAt(endIndex);
            char previousChar = input.charAt(endIndex - 1);
            if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count++;
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar == ',') {
                int endIndex2 = endIndex - count;
                String[] splitArray = new String[count];
                for (int j = 0; j < count; j++) {
                    splitArray[j] = input.substring(endIndex2, endIndex + 1);
                    endIndex2 -= 1;
                }
                return splitArray;
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count = 1;
                break;
            }
            endIndex--;
        }
        int endIndex3 = input.length() - 1;
        while (endIndex3 > 0) {
            char previousChar = input.charAt(endIndex3);
            char nextChar = input.charAt(endIndex3 + 1);
            if ((previousChar == ',' || previousChar == ' ') && nextChar != ',') {
                count++;
            } else if ((previousChar == ',' || previousChar == ' ') && nextChar == ',') {
                int endIndex4 = endIndex3 - count;
                String[] splitArray = new String[count];
                for (int j = 0; j < count; j++) {
                    splitArray[j] = input.substring(endIndex4, endIndex3 + 1);
                    endIndex4 -= 1;
                }
                return splitArray;
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count = 1;
                break;
            }
            endIndex3--;
        }
        int count2 = 0;
        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char previousChar = input.charAt(i - 1);
            if ((previousChar == ',' || previousChar == ' ') && currentChar != ',') {
                count2++;
            } else if ((previousChar == ',' || previousChar == ' ') && currentChar == ',') {
                break;
            }
        }
        String[] splitArray = new String[count2];
        for (int j = 0; j < count2; j++) {
            int startIndex3 = i - count2;
            if (j > 0) {
                startIndex3 += 1;
            }
            splitArray[j] = input.substring(startIndex3, i);
        }
        return splitArray;
    }

}