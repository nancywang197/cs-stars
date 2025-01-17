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

    ;
        String[] lst2 = {"hI", "Hi"};

        System.out.println(java.util.Arrays.toString(totalMatch(lst1, lst2)));

        String[] lst3 = {"hi", "admin"};
        String[] lst4 = {"hI", "hi", "hi"};

        System.out.println(java.util.Arrays.toString(totalMatch(lst3, lst4)));

        String[] lst5 = {"hi", "admin"};
        String[] lst6 = {"hI", "hi", "hi"};

        System.out.println(java.util.Arrays.toString(totalMatch(lst5, lst6)));

        String[] lst7 = {"4"};
        String[] lst8 = {"1", "2", "3", "4", "5"};

        System.out.println(java.util.Arrays.toString(totalMatch(lst7, lst8)));
    }
}