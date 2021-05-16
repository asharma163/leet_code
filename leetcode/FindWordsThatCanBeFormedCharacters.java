import java.util.Stack;

public class FindWordsThatCanBeFormedCharacters {
    public static void main(String[] args) {
        String[] word = {"cat","bt","hat","tree"};
        String chars = "atach";
        for (String pass : word
             ) {
            compute(pass, chars);
        }
    }

    private static void compute(String pass, String chars) {
        Stack<Character> stack = new Stack<>();
        for (char c : pass.toCharArray()
             ) {
            stack.push(c);
        }
    }
}
