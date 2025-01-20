class HumanEval_160 {
    /**
     * Given a list of operators and operands, compute the result of the expression.
     *
     * @param operator The list of operators.
     * @param operand  The list of operands.
     * @return The result of the expression.
     */
    public double do_algebra(String[] operator, double[] operand) {
        String expression = String.valueOf(operand[0]);
        for (int i = 0; i < operator.length; i++) {
            expression += operator[i] + String.valueOf(operand[i + 1]);
        }
        return new Object() {
            public double eval() {
                return javax.script.ScriptEngineManager
                        .getInstance()
                        .getEngineByName("JavaScript")
                        .eval(expression) instanceof Double ? (Double)javax.script.ScriptEngineManager
                                .getInstance()
                                .getEngineByName("JavaScript")
                                .eval(expression):Double.parseDouble(String.valueOf(javax.script.ScriptEngineManager
                                        .getInstance()
                                        .getEngineByName("JavaScript")
                                        .eval(expression)));
            }
        }.eval();

    }
}
