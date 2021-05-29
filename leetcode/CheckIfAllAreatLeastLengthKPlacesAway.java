import java.util.ArrayList;
import java.util.List;

public class CheckIfAllAreatLeastLengthKPlacesAway {
    public static void main(String[] args) {
        int[] nums = {1,0,0,0,1,0,0,1};
        int k = 2;
        boolean flag = false;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (Math.abs(list.get(i) - list.get(i + 1)) >= k) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
    }
}
