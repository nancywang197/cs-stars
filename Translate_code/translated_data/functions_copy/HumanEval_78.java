package com.example.python_to_java.functions_copy;
public class HumanEval_78 {
    /**
     * Given a hexadecimal number, count the number of prime digits present in it.
     * @param num The hexadecimal number as a string.
     * @return The count of prime digits in the hexadecimal number.
     */
    public int hex_key(String num) {
        String[] primes = {"2", "3", "5", "7", "B", "D"};
        int total = 0;
        for (int i = 0; i < num.length(); i++) {
            if (isprime(num.substring(i, i+1), primes)) {
                total += 1;
            }
        }
        return total;
    }

    private boolean isprime(String digit, String[] primes){
        for(String p : primes){
            if(p.equals(digit)) return true;
        }
        return false;
    }
}
