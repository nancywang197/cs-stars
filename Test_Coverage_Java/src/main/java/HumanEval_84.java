public class Main {
    public static String solve(int N) {
        StringBuilder sb = new StringBuilder();
        
        // Convert integer to string
        String numStr = Integer.toString(N);
        
        int sumInts = 0;
        
        for (char c : numStr.toCharArray()) {
            sumInts += c - '0';
        }
        
        return Integer.toBinaryString(sumInts)[2:].toUpperCase();
    }

    
}