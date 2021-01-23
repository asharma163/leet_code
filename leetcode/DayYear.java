package leetcode;

public class DayYear {
    public static void main(String[] args) {
        String date = "2019-01-09";
        int count = 0;
        String[] _date = date.split("-");
        int year = Integer.parseInt(_date[0]);
        int month = Integer.parseInt(_date[1]);
        int day = Integer.parseInt(_date[2]);
        int[] _month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        if (isLeapYear) {
            _month[1] = 29;
        }
        if (month == 1) {
            count = day;
        } else {
            for (int i = 0; i < month - 1; i++) {
                count += _month[i];
            }
            count += day;
        }
        System.out.println(count);
    }
}
