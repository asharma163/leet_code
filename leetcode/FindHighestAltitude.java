package leetcode;

public class FindHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        int diff = 0;
        int max = 0;
        for (int i = 0; i < gain.length; i++) {
            diff = gain[i] + diff;
            max = Math.max(diff, max);
        }
        System.out.println(max);
    }
}
