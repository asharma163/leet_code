import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CanMakeArithmeticProgressionFromSequence {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            set.add(Math.abs(arr[i] - arr[i+1]));
        }
        System.out.println(set.size() == 1);
    }
}
