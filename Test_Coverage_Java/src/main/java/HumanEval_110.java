public class Main {

    ;
        int[] list2 = {5, 6, 7, 8};

        System.out.println(exchange(list1, list2));
    }

    public static String exchange(int[] lst1, int[] lst2) {
        int oddInLst1 = countOdd(lst1);
        int evenInLst2 = countEven(lst2);

        return (evenInLst2 >= oddInLst1) ? "YES" : "NO";
    }

    private static int countOdd(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    private static int countEven(int[] numbers) {
        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}