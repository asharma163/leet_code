package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class DefangingIP {
    public static void main(String[] args) {
        String isFinal = "";
        System.out.println("Enter the IPv4 address: ");
        Scanner sc = new Scanner(System.in);
        String accept = sc.next();
        for (int j = 0; j < accept.length(); j++) {
            isFinal = accept.replace(".", "[.]");
        }
        System.out.println(isFinal);
    }
}
