public class Main {
    public static int smallestChange(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                ans++;
            }
        }
        return ans;
    }

    ;
        System.out.println(smallestChange(arr));
    }
}