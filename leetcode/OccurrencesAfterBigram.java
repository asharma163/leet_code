package leetcode;

import java.util.ArrayList;

public class OccurrencesAfterBigram {
    public static void main(String[] args) {
        String text = "we will we will rock you";
        String first = "we";
        String second = "will";
        String[] str = text.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0; i < str.length - 2; i++) {
            if (str[i].equals(first) && str[i+1].equals(second)) {
                list.add(str[i+2]);
            }
        }
        String[] arr = new String[list.size()];
        int i = 0;
        for (String x : list) {
            arr[i] = x;
            i++;
        }
    }
}
