public class LicenseKeyFormatting {
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        System.out.println(compute(s, k));
    }

    public static String compute(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder split = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch != '-') {
                stringBuilder.append((ch));
            }
        }

        if (stringBuilder.length() > 0) {
            String without_dashes = stringBuilder.toString().toUpperCase();
            int length = without_dashes.length();
            if (length % k != 0) {
                split.append(without_dashes, 0, (length % k));
                split.append("-");
                for (int i = (length % k); i < without_dashes.length(); i += k) {
                    split.append(without_dashes, i, i+k);
                    split.append("-");
                }
            } else {
                for (int i = (length % k); i < without_dashes.length(); i += k) {
                    split.append(without_dashes, i, i+k);
                    split.append("-");
                }
            }
        } else {
            return "";
        }
        return split.substring(0, split.toString().length() -1);
    }
}
