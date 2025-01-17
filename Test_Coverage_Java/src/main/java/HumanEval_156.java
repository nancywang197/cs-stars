public class HumanEval_156 {
    public static String intToMiniRoman(int number) {
        int[] num = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] sym = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder res = new StringBuilder();
        for (int i = 12; i > 0; i--) {
            while (number >= num[i]) {
                number -= num[i];
                res.append(sym[i]);
            }
        }
        return res.toString().toLowerCase();
    }

    
}