import java.util.ArrayList;
import java.util.List;

public class StringMatchingArray {
    public static void main(String[] args) {
        String[] words = {"mass","as","hero","superhero"};
        List<String> list = new ArrayList<>();
        for (String word : words) {
            for (String s : words) {
                if (s.contains(word) && !s.equals(word)) {
                    if (!list.contains(word)) {
                        list.add(word);
                    }
                }
            }
        }
        System.out.println(list);
    }
}
