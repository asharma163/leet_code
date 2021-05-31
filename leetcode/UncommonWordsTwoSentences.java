import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsTwoSentences {
    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        ArrayList<String> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        String[] _s1 = s1.split(" ");
        String[] _s2 = s2.split(" ");
        for (String s : _s1) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : _s2) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        String[] ret = new String[list.size()];
        ret = list.toArray(ret);
        System.out.println(Arrays.toString(ret));
    }
}
