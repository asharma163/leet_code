import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer","silver","lenovo"));
        items.add(Arrays.asList("phone","gold","iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        ArrayList<String> list = new ArrayList<>();
        int key = -1;
        int counter = 0;
        if (ruleKey.equals("type")) {
            key = 0;
        } else if(ruleKey.equals("color")) {
            key = 1;
        } else key = 2;

        for (int i = 0; i < items.size(); i++) {
            list.add(items.get(i).get(key));
        }

        for (int j = 0; j < list.size(); j++) {
            if (list.get(j).equals(ruleValue)) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
