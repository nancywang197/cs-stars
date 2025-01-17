public class HumanEval_95 {
    public static String checkDictCase(Map<String, Object> dict) {
        if (dict.isEmpty()) {
            return "false";
        } else {
            String state = "start";

            for (String key : dict.keySet()) {

                if (!key.matches("[a-zA-Z]+")) { // checks if the key contains only alphabets
                    state = "mixed";
                    break;
                }

                if (state.equals("start")) {
                    if (Character.isUpperCase(key.charAt(0))) {
                        state = "upper";
                    } else if (Character.isLowerCase(key.charAt(0))) {
                        state = "lower";
                    } else {
                        break;
                    }
                } else {
                    // checks if the key is of a different case than expected
                    if ((state.equals("upper") && !Character.isUpperCase(key.charAt(0))) || 
                        (state.equals("lower") && !Character.isLowerCase(key.charAt(0)))) {
                        state = "mixed";
                        break;
                    } else {
                        // if no break occurs, it means the key is of a single case
                        break;
                    }
                }
            }

            return state.equals("upper") || state.equals("lower");
        }
    }

    
}