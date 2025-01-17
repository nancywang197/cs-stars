public class HumanEval_112 {
    public static boolean reverseDelete(String s, String c) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length() - 1;

        while (i < j) {
            if (sb.charAt(i) != c.charAt(0)) {
                i++;
            } else if (sb.charAt(j) != c.charAt(c.length() - 1)) {
                j--;
            } else {
                sb.deleteCharAt(i);
                sb.deleteCharAt(j);
                i++;
                j--;
            }
        }

        boolean isPalindrome = true;
        for (int k = 0; k < s.length(); k++) {
            if (s.charAt(k) != c.charAt(0)) {
                isPalindrome = false;
                break;
            }
        }

        return sb.toString() + ", " + (isPalindrome);
    }

    
}