package leetcode;

public class DetectCapital {
    public static void main(String[] args) {
        String word = "FlaG";
        int counter = 0;
        boolean flag = false;
        for (int i = 0; i < word.length(); i++) {
            if((int)word.charAt(i) > 64 && (int)word.charAt(i) < 91) {
                counter++;
            }
        }
        if (counter == 0 || counter == word.length()) {
            flag = true;
        }

        if (counter == 1) {
            if((int)word.charAt(0) > 64 && (int)word.charAt(0) < 91) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(flag);
    }
}
