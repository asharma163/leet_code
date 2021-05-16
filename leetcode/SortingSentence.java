public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] s_split = s.split(" ");
        for (int i = 0; i < s_split.length; i++) {
            for (int j = i; j < s_split.length; j++) {
                if (s_split[i].charAt(s_split[i].length() - 1) > s_split[j].charAt(s_split[j].length() - 1)) {
                    String holder = "";
                    holder = s_split[i];
                    s_split[i] = s_split[j];
                    s_split[j] = holder;
                }
            }
        }
        String result = "";
        for (String str : s_split
             ) {
            result += str.substring(0, str.length() - 1) + " ";
        }
        System.out.println(result.trim());
    }
}
