package leetcode;

public class NumberStudentsDoingHomeworkGivenTime {
    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        int queryTime = 4;
        int counter = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
