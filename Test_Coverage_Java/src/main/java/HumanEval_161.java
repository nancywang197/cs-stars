public class Main {
    public static String solve(String s) {
        StringBuilder newStr = new StringBuilder();
        boolean flag = false;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                if (!flag) {
                    // Preserve original case in the first letter
                    newStr.append(Character.toUpperCase(c));
                    flag = true;
                } else {
                    // Swap case for other letters
                    newStr.append(Character.toLowerCase(c));
                }
            }
        }
        return flag ? newStr.toString() : newStr.reverse().toString();
    }

    
}