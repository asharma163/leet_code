package leetcode;

public class HammingDistance {
    public static void main(String[] args) {
        int A = 1;
        int B = 4;
        int filler = -1;
        int counter = 0;
        String _A = Integer.toBinaryString(A);
        String _B = Integer.toBinaryString(B);
        filler =_A.length() > _B.length() ? _A.length() - _B.length() : _B.length() - _A.length();
        if (_A.length() > _B.length()) {
            for (int x = 1; x <= filler; x++) {
                _B = "0" + _B;
            }
        }
        else {
            for (int x = 1; x <= filler; x++) {
                _A = "0" + _A;
            }
        }
        char[] final_A = _A.toCharArray();
        char[] final_B = _B.toCharArray();
        for (int i = 0; i < final_A.length; i++) {
            if (final_A[i] != final_B[i]) {
                counter++;
            }
        }
    }
}
