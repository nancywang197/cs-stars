public class HumanEval_144 {
    public static boolean simplifyFraction(String x, String n) {
        // Split the input strings into numerator and denominator parts
        String[] numPartsX = x.split("/");
        String[] numPartsN = n.split("/");

        int numeratorX = Integer.parseInt(numPartsX[0]);
        int denominatorX = Integer.parseInt(numPartsX[1]);

        int numeratorN = Integer.parseInt(numPartsN[0]);
        int denominatorN = Integer.parseInt(numPartsN[1]);

        // Calculate the product of numerators and denominators
        int numeratorProduct = numeratorX * numeratorN;
        int denominatorProduct = denominatorX * denominatorN;

        // Check if the fraction is simplified (i.e., numerator/denominator == integer division)
        double ratio = Math.round((double) numeratorProduct / denominatorProduct);
        return numeratorProduct == denominatorProduct * ratio
                && (numeratorProduct != 0 || denominatorProduct == 1);
    }

    
}