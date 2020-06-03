package leetcode;

public class SortColors {
    public static void main(String[] args) {
        int interim;
        int[] accept = {2,0,2,1,1,0};
        int length = accept.length;
        for(int i = length - 1; i > 0 ; i--) {
            for(int j = 0; j < length-1; j++) {
                if(accept[j] > accept[j+1]) {
                    int swap = accept[j];
                    accept[j] = accept[j+1];
                    accept[j+1] = swap;
                }
            }
        }
        for (Integer e: accept
             ) {
            System.out.println(e);
        }
    }
}
