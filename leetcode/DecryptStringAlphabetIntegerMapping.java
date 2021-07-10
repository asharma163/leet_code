public class DecryptStringAlphabetIntegerMapping {
    public static void main(String[] args) {
        String s = "10#11#12";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                int number = Integer.parseInt(s.substring(i - 2, i));
                stringBuilder.append((char) ('a' + number - 1));
                i -= 2;
            } else {
                stringBuilder.append((char) ('0' + s.charAt(i)));
            }
        }
        System.out.println(stringBuilder.reverse().toString());
    }
}
