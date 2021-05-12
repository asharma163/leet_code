public class ReplaceAllDigitsCharacters {
    public static void main(String[] args) {
        String s = "a1c1e1";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(i % 2 != 0) {
                sb.append((char)((int) s.charAt(i - 1) + Integer.parseInt(String.valueOf(s.charAt(i)))));
            } else sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
