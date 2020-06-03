package leetcode;

public class FibonacciNumber {
    public static void main(String[] args) {
        int N = 4;
        bottom_up(N);
    }
    public static void bottom_up(int n) {
        int[] new_N = new int[n+1];
        if(n > 1) {
            new_N[1] = 1;
            new_N[2] = 1;
            for (int i = 3; i <= n; i++) {
                new_N[i] = new_N[i-1] + new_N[i-2];
            }
        } else if(n == 1){
            new_N[n] = 1;
        } else {
            new_N[n] = 0;
        }
        System.out.println(new_N[n]);
    }
}
