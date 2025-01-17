public class FruitDistribution {
    public static int calculateFruitDistribution(String s, int n) {
        // Split string by spaces and filter digits
        String[] numbers = s.split(" ");
        int total = 0;
        
        for (String num : numbers) {
            if (!num.isEmpty() && Character.isDigit(num.charAt(0))) {
                total += Integer.parseInt(num);
            }
        }

        return n - total;
    }

    
}