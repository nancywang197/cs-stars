public class Main {
    public static String decimalToBinary(int decimal) {
        return "db" + Integer.toBinaryString(decimal).replace("0b", "").toUpperCase() + "db";
    }

    
}