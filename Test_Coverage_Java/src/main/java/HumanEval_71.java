public class TriangleAreaCalculator {

    /**
     * Given the lengths of the three sides of a triangle.
     * Return the area of the triangle rounded to 2 decimal points if the three sides form a valid triangle.
     * Otherwise return -1.
     * Three sides make a valid triangle when the sum of any two sides is greater 
     * than the third side.
     *
     * @param a length of side a
     * @param b length of side b
     * @param c length of side c
     * @return area of the triangle or -1 if it's not valid
     */
    public static double calculateTriangleArea(double a, double b, double c) {
        // Check if the three sides form a valid triangle
        if (a + b <= c || a + c <= b || b + c <= a) {
            return -1;
        }

        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Round the area to 2 decimal points
        return Double.toString(Math.round(area * 100.0)) / 100.0;
    }

    
}