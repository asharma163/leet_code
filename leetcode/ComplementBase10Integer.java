package leetcode;

public class ComplementBase10Integer {
    public static void main(String[] args) {
        int N = 5;
        StringBuilder inverted_binary = new StringBuilder();
        String binary = Integer.toBinaryString(N);
        for (int i = 0; i < binary.length(); i++) {
            inverted_binary.append(binary.charAt(i) == '1' ? '0' : '1');
        }
        int result = Integer.parseInt(inverted_binary.toString(),2);
        System.out.println(result);
    }
}
