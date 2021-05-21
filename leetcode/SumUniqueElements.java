import java.util.HashMap;
import java.util.Map;

public class SumUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        int counter = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : nums
             ) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                counter += entry.getKey();
            }
        }
        System.out.println(counter);
    }
}
