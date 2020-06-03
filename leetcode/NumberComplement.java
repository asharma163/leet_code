package leetcode;
/*
Though I new what to do, still struggled how "java program to convert binary to decimal and shit!"
 */
public class NumberComplement {
    public static void main(String[] args) {
        int num = 5;
        String complement = Integer.toBinaryString(num);
        char[] chr = complement.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            chr[i] = chr[i] == '0' ? '1' : '0';
        }
        String final_str = new String(chr);
        int decimal = Integer.parseInt(final_str,2);
        System.out.println(decimal);
    }
}
