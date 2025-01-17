public class Main {
    public static int search(int[] lst) {
        // Create an array to store frequency of each number
        int[] freq = new int[lst.length + 1];
        
        // Initialize frequency array with zeros
        for (int i : lst) {
            freq[i] += 1;
        }
        
        // Initialize answer variable
        int ans = -1;
        
        // Iterate over the frequency array to find desired number
        for (int i = 1; i < freq.length; i++) {
            if (freq[i] >= i) {
                ans = i;
            }
        }
        
        return ans;
    }

}