public class Algebra {

    public static double doAlgebra(String[] operator, int[] operand) {
        String expression = String.valueOf(operand[0]);
        for (int i = 1; i < operand.length; i++) {
            expression += " " + operator[i-1] + " " + operand[i];
        }
        return eval(expression);
    }

    // Note: Java doesn't have a built-in `eval` function like Python.
    // For simplicity, this example uses basic arithmetic operations.
    public static double eval(String expression) {
        int result = 0;
        char operator = '+';
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == ' ') {
                switch (operator) {
                    case '+':
                        result += Integer.parseInt(expression.substring(i + 1));
                        break;
                    case '-':
                        result -= Integer.parseInt(expression.substring(i + 1));
                        break;
                    case '*':
                        result *= Integer.parseInt(expression.substring(i + 1));
                        break;
                    case '/':
                        result /= Integer.parseInt(expression.substring(i + 1));
                        break;
                }
                i++; // Skip the operator
            } else if (expression.charAt(i) != '+' && expression.charAt(i) != '-' && expression.charAt(i) != '*' && expression.charAt(i) != '/') {
                operator = expression.charAt(i);
            }
        }
        return result;
    }
}