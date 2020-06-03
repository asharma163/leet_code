package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> ch = new ArrayList<>();
        int size = 5;
        for(int i = 0; i < size; i++) {
            ch.add(sc.next().charAt(0));
        }
        Collections.reverse(ch);
        System.out.println(ch);
    }
}
