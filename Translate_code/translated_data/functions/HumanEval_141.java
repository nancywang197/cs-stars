class HumanEval_141 {
    /**
     *
     * @param file_name
     * @return
     */
    public String file_name_check(String file_name) {
        String[] suf = {"txt", "exe", "dll"};
        String[] lst = file_name.split("\\.");
        if (lst.length != 2) {
            return "No";
        }
        boolean found = false;
        for(String s : suf){
            if(s.equals(lst[1])){
                found = true;
                break;
            }
        }
        if (!found) {
            return "No";
        }
        if (lst[0].length() == 0) {
            return "No";
        }
        if (!Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = 0;
        for (int i = 0; i < lst[0].length(); i++) {
            if (Character.isDigit(lst[0].charAt(i))) {
                t++;
            }
        }
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}
