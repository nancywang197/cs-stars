public class Main {
    public static Object splitWords(String txt) {
        if (txt.contains(" ")) {
            return txt.split("\\s+");
        } else if (txt.contains(",")) {
            return txt.replace(",", " ").split(",");
        } else {
            int count = 0;
            for (char c : txt.toCharArray()) {
                if (Character.isLowerCase(c) && Character.getNumericValue(c) % 2 == 0) {
                    count++;
                }
            }
            return String.valueOf(count);
        }
    }

    
}