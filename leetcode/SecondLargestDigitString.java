import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SecondLargestDigitString {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        String s = "dfa12321afd";
        String new_s = s.replaceAll("[a-z]", "");
        for (int i = 0; i < new_s.length(); i++) {
            set.add(Integer.parseInt(String.valueOf(new_s.charAt(i))));
        }
        List<Integer> list = new ArrayList<>(set);
        System.out.println(list.size() < 2 ? -1 : list.get(list.size() - 2));
    }
}
