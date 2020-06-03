package leetcode;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int k = 3;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) <= k) {
                        flag = true;
                    }
                }
            }
        }
        System.out.println(flag);
    }
}
