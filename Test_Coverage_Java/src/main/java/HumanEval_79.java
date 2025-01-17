public class HumanEval_79 {
    public static String decimalToBinary(int decimal) {
        return "db" + Integer.toBinaryString(decimal).replace("0b", "").toUpperCase() + "db";
    }

    
}