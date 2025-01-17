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

    ;
        System.out.println(search(lst1)); // Output: 2
        
        int[] lst2 = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        System.out.println(search(lst2)); // Output: 3
        
        int[] lst3 = {5, 5, 4, 4, 4};
        System.out.println(search(lst3)); // Output: -1
    }
}