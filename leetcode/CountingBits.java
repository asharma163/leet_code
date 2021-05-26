import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args) {
        int n = 5;
        int index = 0;
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[index] = count(Integer.toBinaryString(i));
            index++;
        }
        System.out.println(Arrays.toString(ans));
    }
    public static int count(String number) {
        int counter = 0;
        for (char ch : number.toCharArray()){
            if (ch == '1') counter++;
        }
        return counter;
    }
}
