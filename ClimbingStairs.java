package leetcode;

public class ClimbingStairs {
    public static void main(String[] args) {
        int n = 1;
        System.out.println(bottom_up(n));
    }

    public static int bottom_up(int n) {
        int[] new_N = new int[n + 1];
        if (n == 1) {
            return 1;
        }

        new_N[1] = 1;
        new_N[2] = 2;
        for (int i = 3; i <= n; i++) {
            new_N[i] = new_N[i - 1] + new_N[i - 2];
        }

        return new_N[n];
    }
}
