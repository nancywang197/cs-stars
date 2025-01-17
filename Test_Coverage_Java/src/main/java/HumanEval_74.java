public class Main {
    public static String[] totalMatch(String[] list1, String[] list2) {
        int sum1 = 0;
        for (String str : list1) {
            sum1 += str.length();
        }

        int sum2 = 0;
        for (String str : list2) {
            sum2 += str.length();
        }

        if (sum1 <= sum2) {
            return list1;
        } else {
            return list2;
        }
    }


}