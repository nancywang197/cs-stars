import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval27Test {

    @Test
    public void testFlipCase_EmptyString_ReturnsEmptyString() {
        String input = "";
        String expected = "";
        assertEquals(expected, flipCase(input));
    }

    @Test
    public void testFlipCase_SimpleString_ReturnsFlippedString() {
        String input = "Hello!";
        String expected = "hELLO!";
        assertEquals(expected, flipCase(input));
    }

    @Test
    public void testFlipCase_LongerString_ReturnsFlippedString() {
        String input = "These violent delights have violent ends";
        String expected = "tHESE VIOLENT DELIGHTS HAVE VIOLENT ENDS";
        assertEquals(expected, flipCase(input));
    }
}

// Assuming the function is in a separate class, e.g., FlipCase.java
public class FlipCase {

    public static String flipCase(String input) {
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            }
        }
        return result.toString();
    }
}