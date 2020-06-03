package leetcode;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
        int sum = 0;
        if(num == 0) {
            sum = -1;
        }
        int limit = num / 2;
        for (int i = 1; i <= limit; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
