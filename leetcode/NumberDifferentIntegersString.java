import java.util.HashSet;
import java.util.Set;

public class NumberDifferentIntegersString {
    public static void main(String[] args) {
        String word = "a123bc34d8ef34";
        String[] word_arr = word.replaceAll("[a-z]", " ").trim().split(" ");
        Set<Integer> set = new HashSet<>();
        for (String a : word_arr) {
            System.out.println(a);
        }
        System.out.println(set);
    }
}
