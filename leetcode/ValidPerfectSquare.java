package leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        int num = 681;
        double d = Math.pow(num,0.5);
        String numberD = String.valueOf(d);
        boolean flag = false;
        numberD = numberD.substring(numberD.indexOf ( "." ) + 1);
        if (numberD.length() > 0) {
            flag = false;
        }
        if (numberD.equals("0")){
            flag = true;
        } else flag = false;
        System.out.println(flag);
    }
}
