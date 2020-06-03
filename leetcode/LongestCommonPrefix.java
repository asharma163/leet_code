package leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        String x = caller(strs);
        System.out.println(x);

    }
    public static String caller(String[] strs) {
        String longestPrefix = "";
        char[] ch = strs[0].toCharArray();
        int counter = 0;
        for (char x : ch) {
            for (int i = 1; i < strs.length;i++) {
                if (counter >= strs[i].length() || x != strs[i].charAt(counter)) {
                    return longestPrefix;
                }
            }
            longestPrefix += x;
            counter++;
        }
        return longestPrefix;
    }
}
