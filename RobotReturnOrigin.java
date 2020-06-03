package leetcode;

public class RobotReturnOrigin {
    public static void main(String[] args) {
        String moves = "UrLdUD";
        int total = 0;
        moves.toUpperCase();
        char[] ch = moves.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == 'U') {
                total += U();
            }
            else if(ch[i] == 'L') {
                total += L();
            }
            else if(ch[i] == 'R') {
                total += R();
            }
            else total += D();
        }
        System.out.println(total);
    }

    public static int L() {
        return 2;
    }

    public static int R() {
        return -2;
    }

    public static int U() {
        return 2;
    }

    public static int D() {
        return -2;
    }
}
