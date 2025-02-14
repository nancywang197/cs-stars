package com.example.python_to_java.functions_copy;
public class HumanEval_112 {
    /**
     * Reverses a string after removing specified characters.
     *
     * @param s The input string.
     * @param c A string containing characters to remove.
     * @return A pair containing the modified string and a boolean indicating if it's a palindrome.
     */
    public Pair<String, Boolean> reverse_delete(String s, String c) {
        StringBuilder sb = new StringBuilder();
        for (char charac : s.toCharArray()) {
            if (c.indexOf(charac) == -1) {
                sb.append(charac);
            }
        }
        String modifiedString = sb.toString();
        String reversedString = new StringBuilder(modifiedString).reverse().toString();
        return new Pair<>(modifiedString, modifiedString.equals(reversedString));

    }
    
    public static class Pair<K,V>{
        K key;
        V value;
        public Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}
