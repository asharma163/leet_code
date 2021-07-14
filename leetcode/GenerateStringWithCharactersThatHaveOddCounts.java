public class GenerateStringWithCharactersThatHaveOddCounts {
    public static void main(String[] args) {
        int n = 7;
        StringBuilder sb = new StringBuilder();
        if(n == 1) {
            sb.append('a');
        } else if(n == 2) {
            sb.append("ab");
        } else if(n == 3) {
            sb.append("abc");
        } else {
            if(n % 2 == 0) {
                for(int i = 1; i < n; i++) {
                    sb.append('a');
                }
                sb.append('b');
            } else {
                for(int j = 1; j < n-1; j++) {
                    sb.append('a');
                }
                sb.append("bc");
            }
        }
        System.out.println(sb.toString());
    }
}
