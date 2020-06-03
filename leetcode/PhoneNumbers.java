package leetcode;

public class PhoneNumbers {
    public static void main(String[] args) {
        String p_num = "(675)-999-2783";
        System.out.println(getMeMyNumber(p_num,"+1"));
    }
    public static String getMeMyNumber(String number, String countryCode)
    {
        String out = number.replaceAll("[^0-9\\+]", "")
                .replaceAll("(^[1-9].+)", countryCode+"$1")
                .replaceAll("(.)(\\++)(.)", "$1$3")
                .replaceAll("(^0{2}|^\\+)(.+)", "$2")
                .replaceAll("^0([1-9])", countryCode+"$1");  
        return out;

    }
}
