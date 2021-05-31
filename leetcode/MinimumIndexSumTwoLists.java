import java.lang.reflect.Array;
import java.util.*;

public class MinimumIndexSumTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = {"KFC","Burger King","Tapioca Express","Shogun"};
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    map.put(list1[i], i+j);
                }
            }
        }
        int min = Collections.min(map.values());
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            if (entry.getValue() == min) {
                list.add(entry.getKey());
            }
        }
        String[] ret = new String[list.size()];
        ret = list.toArray(ret);
        System.out.println(Arrays.toString(ret));
    }
}
