import javax.swing.text.EditorKit;
import java.util.HashMap;
import java.util.Map;

public class MaximumNumberBallsBox {
    public static void main(String[] args) {
        int lowLimit = 1;
        int highLimit = 10;
        Map<Integer, Integer> map = new HashMap<>();
        int MAX = Integer.MIN_VALUE;
        for (int i = lowLimit; i <= highLimit; i++) {
            map.put(digitSum(i), map.getOrDefault(digitSum(i), 0) + 1);
        }
        for (int max : map.values()
             ) {
            MAX = Math.max(MAX, max);
        }
        System.out.println(MAX);
    }

    public static int digitSum(int number) {
        int sum = 0;
        int mod = 0;
        while (number > 0) {
            mod = number % 10;
            sum += mod;
            number /= 10;
        }
        return sum;
    }
}
