package leetcode;

import java.util.Scanner;

public class SubtractProductSumDigitsofInteger {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int getNumber = sc.nextInt();
        System.out.println(getProduct(getNumber) - getSum(getNumber));
    }

    public static int getProduct(int num) {
        int product = 1;
        while(num > 0) {
            int remainder = num % 10;
            product *= remainder;
            num /= 10;
        }
        return product;
    }

    public static int getSum(int num) {
        int sum = 0;
        while(num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }
}
