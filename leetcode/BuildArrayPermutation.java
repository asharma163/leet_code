import java.util.Arrays;

public class BuildArrayPermutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        int[] new_nums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            new_nums[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(new_nums));
    }
}
