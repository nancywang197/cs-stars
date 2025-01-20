class HumanEval_95 {
    /**
     * Checks if all keys in a dictionary are either all uppercase or all lowercase.
     *
     * @param dict The input dictionary.
     * @return True if all keys are either all uppercase or all lowercase, False otherwise.
     */
    public boolean check_dict_case(java.util.Map<String, Object> dict) {
        if (dict.keySet().size() == 0) {
            return false;
        } else {
            String state = "start";
            for (String key : dict.keySet()) {
                if (!(key instanceof String)) {
                    state = "mixed";
                    break;
                }
                if (state.equals("start")) {
                    if (key.toUpperCase().equals(key)) {
                        state = "upper";
                    } else if (key.toLowerCase().equals(key)) {
                        state = "lower";
                    } else {
                        break;
                    }
                } else if ((state.equals("upper") && !key.toUpperCase().equals(key)) || (state.equals("lower") && !key.toLowerCase().equals(key))) {
                    state = "mixed";
                    break;
                } else {
                    break;
                }
            }
            return state.equals("upper") || state.equals("lower");
        }
    }
}
