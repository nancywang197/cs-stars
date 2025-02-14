package com.example.python_to_java.functions_copy;
public class HumanEval_148 {
    /**
     * There are eight planets in our solar system: the closerst to the Sun
     * is Mercury, the next one is Venus, then Earth, Mars, Jupiter, Saturn,
     * Uranus, Neptune.
     * Write a function that takes two planet names as strings planet1 and planet2.
     * The function should return a tuple containing all planets whose orbits are
     * located between the orbit of planet1 and the orbit of planet2, sorted by
     * the proximity to the sun.
     * The function should return an empty tuple if planet1 or planet2
     * are not correct planet names.
     * Examples
     * bf("Jupiter", "Neptune") ==> ("Saturn", "Uranus")
     * bf("Earth", "Mercury") ==> ("Venus")
     * bf("Mercury", "Uranus") ==> ("Venus", "Earth", "Mars", "Jupiter", "Saturn")
     */
    public String[] bf(String planet1, String planet2) {
        String[] planet_names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        int planet1_index = -1;
        int planet2_index = -1;
        for(int i = 0; i < planet_names.length; i++){
            if(planet_names[i].equals(planet1)){
                planet1_index = i;
            }
            if(planet_names[i].equals(planet2)){
                planet2_index = i;
            }
        }

        if (planet1_index == -1 || planet2_index == -1 || planet1_index == planet2_index) {
            return new String[0];
        }

        if (planet1_index < planet2_index) {
            String[] result = java.util.Arrays.copyOfRange(planet_names, planet1_index + 1, planet2_index);
            return result;
        } else {
            String[] result = java.util.Arrays.copyOfRange(planet_names, planet2_index + 1, planet1_index);
            return result;
        }
    }
}
