package leetcode;

public class Maximum69Number {
    public static void main(String[] args) {
        int num = 9669;
        String str = num + "";
        char[] ch = str.toCharArray();
        for (int i = 0 ; i < ch.length; i++) {
            if (ch[i] == '6') {
                ch[i] = '9';
                break;
            }
        }
        String x = String.valueOf(ch);
        System.out.println(Integer.parseInt(x));
    }
}
