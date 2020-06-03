package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "ab@a";
        String new_s = s.toLowerCase().trim().replaceAll("[^a-z0-9A-Z]","");
        System.out.println(new_s);
        String reverse = "";
        for (int i = new_s.length() - 1; i >= 0; i--) {
            reverse = reverse + new_s.charAt(i);
        }
        System.out.println(reverse);
    }
}
