package leetcode;

import java.util.Scanner;
public class KaprekarsConstant {
    static int CONSTANT = 6174;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that is only 4-digit only");
        int  accept = sc.nextInt();
        numberToArray(accept);
    }

    public static void numberToArray(int accept) {
        int[] arr = new int[4];
        int i = 0;
        while(i <= 3) {
            arr[i] = accept % 10;
            accept /= 10;
            i++;
        }
        ascending(arr);
    }

    public static void ascending(int[] ascending) {
        String convert = "";
        int length = ascending.length;
        for(int i = length - 1; i > 0 ; i--) {
            for(int j = 0; j < length-1; j++) {
                if(ascending[j] > ascending[j+1]) {
                    int swap = ascending[j];
                    ascending[j] = ascending[j+1];
                    ascending[j+1] = swap;
                }
            }
        }

        for (int j = 0; j < length; j++) {
            convert = convert + ascending[j];
        }

        int result = Integer.parseInt(convert);
        //System.out.println(convert);
        descending(ascending, result);
    }

    public static void descending(int[] descending, int convertAccept) {
        String otherConvert = "";
        int a = convertAccept;
        int otherLength = descending.length;
        int[] descend = new int[4];
        int j = 0;
        for (int i = otherLength -1; i >= 0; i--) {
            descend[j] = descending[i];
            j++;
        }

        for (int x = 0; x < descending.length; x++) {
            otherConvert = otherConvert + descend[x];
        }
        int otherResult = Integer.parseInt(otherConvert);
        finals(a,otherResult);
    }

    public static void finals(int a, int b) {
        int finalAccept = a;
        int finalDecept = b;
        int subtract = finalDecept - finalAccept;
        System.out.println(subtract);
        int counter = 1;

        if(subtract == CONSTANT) {
            System.exit(0);
        }
        else {
            numberToArray(subtract);
        }
    }
}
