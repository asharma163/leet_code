public class MinimumDistanceTargetElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        int MIN = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int min = Math.abs(i - start);
                MIN = Math.min(MIN, min);
            }
        }
        System.out.println(MIN);
    }
}
