package leetcode;

public class CheckIfWordOccursAsPrefixAnyWordSentence {
    public static void main(String[] args) {
        String sentence = "this problem is an easy problem";
        String searchWord = "pro";
        int index = Integer.MAX_VALUE;
        boolean flag = false;
        String[] sentence_split = sentence.split(" ");
        int searchWord_length = searchWord.length();
        for (int i = 0; i < sentence_split.length; i++) {
            if(sentence_split[i].length() > searchWord_length) {
                sentence_split[i] = sentence_split[i].substring(0,searchWord_length);
            }
        }
        for (int j = 0; j < sentence_split.length; j++) {
            if (sentence_split[j].equals(searchWord)) {
                index = Math.min(index,j);
                flag = true;
            }
        }
        if (!flag) {
            index = -1;
        } else {
            index++;
        }
        System.out.println(index);
    }
}
