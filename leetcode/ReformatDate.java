package leetcode;

public class ReformatDate {
    public static void main(String[] args) {
        String date = "6th Jun 1933";
        String[] date_arr = date.split(" ");
        int x = -1;
        String[] dates = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String result = "";
        result = date_arr[2] + "-";
        for(int i = 0; i < dates.length; i++) {
            if(date_arr[1].equals(dates[i])) {
                x = i + 1;
            }
        }
        if(x < 10) {
            result += "0"+ x + "-";
        } else {
            result += x + "-";
        }
        if(date_arr[0].length() < 4){
            result = result + "0" + date_arr[0].charAt(0);
        } else {
            result = result + date_arr[0].substring(0,2);
        }
        System.out.println(result);
    }
}
