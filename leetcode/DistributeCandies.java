import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1,2,2,3,3};
        Set<Integer> set = new HashSet<>();
        int half = candyType.length / 2;
        for (int i : candyType) set.add(i);
        System.out.println(Math.min(set.size(), half));
    }
}
