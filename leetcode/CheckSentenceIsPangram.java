import java.util.HashMap;
import java.util.Map;

public class CheckSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : sentence.toCharArray()
             ) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println(map.keySet().size());
    }
}
