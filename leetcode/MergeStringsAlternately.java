public class MergeStringsAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        System.out.println(util(word1, word2));

    }

    public static String util(String one, String two) {
        String holder = "";
        StringBuilder sb = new StringBuilder();
        if(one.length() < two.length()) {
            holder = two.substring(0, one.length());
            String remaining = two.substring(one.length());
            for (int i = 0; i< holder.length(); i++) {
                sb.append(one.charAt(i)).append(holder.charAt(i));
            }
            sb.append(remaining);
        } else if (one.length() > two.length()) {
            holder = one.substring(0, two.length());
            String remaining = one.substring(two.length());
            for (int i = 0; i < holder.length(); i++) {
                sb.append(one.charAt(i)).append(two.charAt(i));
            }
            sb.append(remaining);
        }
        else {
            for (int i = 0; i < two.length(); i++) {
                sb.append(one.charAt(i)).append(two.charAt(i));
            }
        }
        return sb.toString();
    }
}
