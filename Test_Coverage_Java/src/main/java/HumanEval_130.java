public class HumanEval_130 {
    public static int[] tri(int n) {
        if (n == 0) {
            int[] result = new int[1];
            result[0] = 1;
            return result;
        }

        int[] myTri = {1, 3};
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                myTri[i - 1] = myTri[i - 2] + 1;
            } else {
                myTri[i - 1] = myTri[i - 2] + myTri[i - 3] + (i + 3) / 2.0;
            }
        }
        return myTri;
    }

    
}