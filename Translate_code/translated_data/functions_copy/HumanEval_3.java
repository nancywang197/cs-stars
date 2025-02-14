package com.example.python_to_java.functions_copy;
import java.util.List;

public class HumanEval_3 {
    /**
     * Given a list of integers representing bank operations, determine if the balance ever goes below zero.
     *
     * @param operations A list of integers representing bank operations.
     * @return True if the balance ever goes below zero, False otherwise.
     */
    public boolean belowZero(List<Integer> operations) {
        int balance = 0;

        for (int op : operations) {
            balance += op;
            if (balance < 0) {
                return true;
            }
        }

        return false;
    }
}
