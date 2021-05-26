import java.util.ArrayList;

public class BinaryGap {
    public static void main(String[] args) {
        int n = 22;
        ArrayList<Integer> list = new ArrayList<>();
        int MAX = 0;
        String binary = Integer.toBinaryString(n);
        for (int i = 0; i < binary.toCharArray().length; i++) {
            if (binary.charAt(i) == '1') {
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() - 1; i++) {
            int difference = Math.abs(list.get(i) - list.get(i + 1));
            MAX = Math.max(MAX, difference);
        }
    }
}
