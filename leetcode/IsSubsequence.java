package leetcode;

import java.util.ArrayList;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "axc";
        String t = "ahbgdc";
        char[] s_arr = s.toCharArray();
        char[] t_arr = t.toCharArray();
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();
        if (s.length() > 0) {
            for (int i = 0; i < s_arr.length; i++) {
                for (int j = 0; j < t_arr.length; j++) {
                    if (s_arr[i] == t_arr[j]) {
                        list.add(j);
                        flag = true;
                        break;
                    } else {
                        flag = false;
                    }
                }
                if (!flag) {
                    list.add(-1);
                }
            }
            if (list.contains(-1)) {
                flag = false;
            } else {
                for (int x = 0; x < list.size() - 1; x++) {
                    if (list.get(x) < list.get(x + 1)) {
                        flag = true;
                    } else {
                        flag = false;
                    }
                }
            }
        } else {
            flag = true;
        }
        System.out.println(flag);
    }
}
