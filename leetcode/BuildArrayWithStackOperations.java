package leetcode;

import java.util.ArrayList;

public class BuildArrayWithStackOperations {
    public static void main(String[] args) {
        int[] target = {1,2};
        int n = 4;
        ArrayList<String> list = new ArrayList<>();
        int counter = 0;
        for (int i = 1; i <= target[target.length - 1]; i++) {
            list.add("Push");
            if(target[counter] == i) {
                counter++;
            } else {
                list.add("Pop");
            }

        }
        System.out.println(list);
    }
}
