package leetcode;

import java.util.Collections;

public class ReverseWordStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        int i = 0;
        String final_str = "";
        StringBuilder sb = new StringBuilder();
        String[] str = s.split("\\s");
        while (i < str.length) {
            sb.append(str[i]);
            sb = sb.reverse();
            final_str += sb.toString() + " ";
            sb.delete(0,str[i].length());
            i++;
        }
        System.out.println(final_str.trim());
    }
}
