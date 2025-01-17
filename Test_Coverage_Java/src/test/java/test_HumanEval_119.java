import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HumanEval_119Test {

    @Test
    public void testMatchParens_SimpleCases() {
        String[] expectedOutput = {"Yes", "No"};
        for (int i = 0; i < 6; i++) {
            String input1 = getInput(i);
            String output = match_parens(input1);
            assertEquals(expectedOutput[i], output);
        }
    }

    @Test
    public void testMatchParens_EdgeCases() {
        String[] expectedOutput = {"Yes", "Yes"};
        for (int i = 0; i < 2; i++) {
            String input1 = getInput(i);
            String input2 = getInput(6 + i);
            if(input1.equals(")"))
                input1 = "(";
            if(input2.equals("("))
                input2 = ")";
            
            String output = match_parens(input1);
            assertEquals(expectedOutput[i], output);
        }
    }

    private String getInput(int index) {
        switch (index) {
            case 0:
                return "()";
            case 1:
                return "()";
            case 2:
                return "(()(())";
            case 3:
                return ")())";
            case 4:
                return ")())";
            case 5:
                return "(())))";
            default:
                return "";
        }
    }

    public String match_parens(String str) {
        int open = 0;
        for (char c : str.toCharArray()) {
            if (c == '(')
                open++;
            else
                open--;
            if (open < 0)
                return "No";
        }
        if (open != 0)
            return "No";
        return "Yes";
    }

}