package leetcode;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a','h'};
        int j = s.length - 1;
        int i = 0;
        while (i < j) {
            char temp;
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            j--;
            i++;
        }
        for(char x : s) {
            System.out.println(x);
        }
    }
}
