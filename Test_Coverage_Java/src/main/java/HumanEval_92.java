public class Main {
    public static boolean anyInt(int x, int y, int z) {
        // Check if all numbers are integers
        if (!(x instanceof Integer && y instanceof Integer && z instanceof Integer)) {
            return false;
        }

        // Check if one of the numbers is equal to the sum of the other two
        return (x + y == z) || (x + z == y) || (y + z == x);
    }

    
}