public class CheckWordEqualsSummationTwoWords {
    public static void main(String[] args) {
        String firstWord = "acb";
        String secondWord = "cba";
        String targetWord = "cbd";
        System.out.println(compute(firstWord) + compute(secondWord) == compute(targetWord));
    }

    public static int compute(String word) {
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()) {
            sb.append(ch - 'a');
        }
        System.out.println(Integer.parseInt(sb.toString()));
        return Integer.parseInt(sb.toString());
    }
}
