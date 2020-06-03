package leetcode;

public class LengthLastWord {
    public static void main(String[] args) {
        String s = "Hello ";
        String new_str = s.trim();
        if (new_str.lastIndexOf(' ') == -1){
            System.out.println(new_str.length());
        } else if (new_str.lastIndexOf(' ') > -1){
            String subString = new_str.substring(new_str.lastIndexOf(' ')+1);
            System.out.println(subString.length());
        }
    }
}
