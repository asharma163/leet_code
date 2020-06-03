package leetcode;

public class NumberStepsReduceNumberZero {
    int count = 0;
    public static void main(String[] args) {
        int num = 14;
        int count = 0;
        while (num > 0) {
            if (num % 2 != 0) {
                num -= 1;
            } else {
                num /= 2;
            }
            count++;
        }
        System.out.println(count);
//        System.out.println(recurse(num));
    }

//    public static int recurse(int n) {
//        if(n == 0) {
//            return count;
//        } else if(n % 2 != 0){
//            n -= 1;
//            count++;
//            recurse(n);
//        } else {
//            n /= 2;
//            count++;
//            recurse(n);
//        }
//        return count;
//    }
}
