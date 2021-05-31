import java.util.HashSet;
import java.util.Set;

public class SubstringsSizeThreeDistinctCharacters {
    public static void main(String[] args) {
        String s = "xyzzaz";
        int count = 0;
        for (int i = 0; i < s.length() - 2; i++) {
            if(compute(s.substring(i,i + 3))) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean compute(String accept) {
        Set<Character> set = new HashSet<>();
        for (char ch : accept.toCharArray()) {
            set.add(ch);
        }
        return set.size() == 3;
    }
}
