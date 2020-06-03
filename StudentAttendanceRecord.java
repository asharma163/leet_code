package leetcode;

public class StudentAttendanceRecord {
    public static void main(String[] args) {
        String s = "PPALLP";
        int counter_a = 0;
        int counter_l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                counter_a++;
            } else if (s.charAt(i) == 'L' && i < s.length() - 2) {
                if (s.charAt(i+1) == 'L' && s.charAt(i+2) == 'L') {
                    counter_l++;
                }
            }
        }
        if (counter_a > 1 || counter_l >= 1) {
            System.out.println(false);
        } else System.out.println(true);
    }
}
