package leetcode;

import java.util.ArrayList;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        fizzBuzz(number);
    }

    public static void fizzBuzz(int num) {
        ArrayList<String> list = new ArrayList<>();
        for(int i = 1; i <= num; i++) {
            if( i % 3 == 0 && i % 5 == 0) {
                list.add("leetcode.FizzBuzz");
            }
            else if(i % 3 == 0) {
                list.add("Fizz");
            }
            else if(i % 5 == 0) {
                list.add("Buzz");
            }
            else {
                String str = Integer.toString(i);
                list.add(str);
            }
        }
        System.out.println(list);
    }
}
