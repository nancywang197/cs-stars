class HumanEval_124 {
    /**
     * Given a date string in the format MM-DD-YYYY, determine if it is a valid date.
     *
     * @param date The date string to validate.
     * @return True if the date is valid, False otherwise.
     */
    public boolean validDate(String date) {
        try {
            date = date.strip();
            String[] parts = date.split("-");
            int month = Integer.parseInt(parts[0]);
            int day = Integer.parseInt(parts[1]);
            int year = Integer.parseInt(parts[2]);

            if (month < 1 || month > 12) {
                return false;
            }
            if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day < 1 || day > 31)) {
                return false;
            }
            if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
                return false;
            }
            if (month == 2 && (day < 1 || day > 29)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
