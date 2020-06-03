package leetcode;

import java.util.Scanner;

public class JewelsStones {
    public static void main(String[] args) {
        String J = "";
        String S = "";
        int counter = 0;
        Scanner sc = new Scanner(System.in);
        S = sc.next();
        J = sc.next();
        char[] jewels = new char[J.length()];
        char[] stones = new char[S.length()];
        jewels = J.toCharArray();
        stones = S.toCharArray();
        for(int i = 0; i < jewels.length; i++) {
            for(int j = 0; j < stones.length; j++) {
                if(jewels[i] == stones[j]) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
