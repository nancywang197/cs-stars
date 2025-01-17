import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval86Test {

    @Test
    public void testAnti_shuffleSimpleCases() {
        String expected1 = "Hi";
        String actual1 = anti_shuffle("Hi");
        assertEquals(expected1, actual1);

        String expected2 = "ehllo";
        String actual2 = anti_shuffle("hello");
        assertEquals(expected2, actual2);

        String expected3 = "bemnru";
        String actual3 = anti_shuffle("number");
        assertEquals(expected3, actual3);

        String expected4 = "abcd";
        String actual4 = anti_shuffle("abcd");
        assertEquals(expected4, actual4);

        String expected5 = "Hello !!!Wdlor";
        String actual5 = anti_shuffle("Hello World!!!");
        assertEquals(expected5, actual5);

        String expected6 = "";
        String actual6 = anti_shuffle("");
        assertEquals(expected6, actual6);

        // Note: There's no easy way to assert True in JUnit.
        // Instead, you can use an empty test method if you really want to assert something that is always true.

        // Alternatively, use a test class with multiple test methods
    }

    public String anti_shuffle(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            sb.append(c);
            if (sb.length() == 2 && sb.toString().charAt(0) >= 'a' && sb.toString().charAt(1) <= 'z') {
                sb.deleteCharAt(sb.length() - 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

}