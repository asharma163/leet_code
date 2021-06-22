public class LongerContiguousSegmentsOnesZeros {
    public static void main(String[] args) {
        String s = "110100010";
        int max_ones = Integer.MIN_VALUE;
        int max_zeros = Integer.MIN_VALUE;
        String[] s_ones = s.split("0");
        String[] s_zeros = s.split("1");
        for (String r : s_ones ) {
            max_ones = Math.max(max_ones, r.length());
        }
        for (String r : s_zeros ) {
            max_zeros = Math.max(max_zeros, r.length());
        }
        System.out.println(max_ones > max_zeros);
    }
}
