public class SignProductArray {
    public static void main(String[] args) {
        int[] nums = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int prod = 1;
        for (int i : nums) {
            if (i < 0) {
                prod *= -1;
            } else if (i == 0) {
                prod = 0;
            }
        }
        System.out.println(prod);
    }
}
