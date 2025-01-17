import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_51Test {

    @Test
    public void test_HumanEval_51() {
        String result = removeVowels("");
        assertEquals("", result);

        result = removeVowels("abcdef\nghijklm");
        assertEquals("bcdf\nghjklm", result);

        result = removeVowels("fedcba");
        assertEquals("fdcb", result);

        result = removeVowels("eeeee");
        assertEquals("", result);

        result = removeVowels("acBAA");
        assertEquals("cB", result);

        result = removeVowels("EcBOO");
        assertEquals("cB", result);

        result = removeVowels("ybcd");
        assertEquals("ybcd", result);
    }

    // The method to be tested (assuming it's in the same class)
    public String removeVowels(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }
}