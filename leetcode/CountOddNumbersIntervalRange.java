public class CountOddNumbersIntervalRange {
    public static void main(String[] args) {
        int low = 8;
        int high = 10;
        if (low % 2 != 0) low--;
        if (high % 2 != 0) high++;
        System.out.println((high - low) / 2);
    }
}
