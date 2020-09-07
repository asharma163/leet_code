package leetcode;

public class ThousandSeparator {
    public static void main(String[] args) {
        int n = 1234;
        String result = "";
        int counter = 0;
        switch(n) {
            case 0:
                result = "0";
                break;

            default:
                while(n > 0) {
                    int choosa = n % 10;
                    result = choosa + result;
                    counter++;
                    if(counter % 3 == 0) {
                        result = "." + result;
                        counter = 0;
                    }
                    n /= 10;
                }
                if(result.length() > 3) {
                    if(result.charAt(0) == '.') {
                        result = result.substring(1);
                    }
                }
        }
        System.out.println(result);
    }
}
