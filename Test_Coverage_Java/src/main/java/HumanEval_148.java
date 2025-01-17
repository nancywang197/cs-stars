import java.util.Arrays;

public class Main {

    public static String[] bf(String planet1, String planet2) {
        // Define the planets in order from closest to farthest from the Sun
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};

        if (!isValidPlanet(planet1, planets) || !isValidPlanet(planet2, planets)) {
            return new String[0];
        }

        int planet1Index = findPlanetIndex(planet1, planets);
        int planet2Index = findPlanetIndex(planet2, planets);

        // Sort the planets based on their order from closest to farthest
        if (planet1Index < planet2Index) {
            return Arrays.copyOfRange(planets, planet1Index + 1, planet2Index);
        } else {
            return Arrays.copyOfRange(planets, planet2Index + 1, planet1Index);
        }
    }

    private static boolean isValidPlanet(String planet, String[] planets) {
        for (String p : planets) {
            if (p.equals(planet)) {
                return true;
            }
        }
        return false;
    }

    private static int findPlanetIndex(String planet, String[] planets) {
        for (int i = 0; i < planets.length; i++) {
            if (planets[i].equals(planet)) {
                return i;
            }
        }
        throw new RuntimeException("Invalid planet name");
    }

    
}