class HumanEval_77 {
    /**
     * Write a function that takes an integer a and returns True 
     * if this ingeger is a cube of some integer number.
     * Note: you may assume the input is always valid.
     * Examples:
     * iscube(1) ==> True
     * iscube(2) ==> False
     * iscube(-1) ==> True
     * iscube(64) ==> True
     * iscube(0) ==> True
     * iscube(180) ==> False
     */
    public boolean iscube(int a) {
        a = Math.abs(a);
        return (int) Math.round(Math.pow(a, (1.0 / 3.0))) * (int) Math.round(Math.pow(a, (1.0 / 3.0))) * (int) Math.round(Math.pow(a, (1.0 / 3.0))) == a;
    }
}
