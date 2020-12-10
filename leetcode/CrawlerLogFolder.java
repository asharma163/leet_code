package leetcode;

import java.util.Stack;

public class CrawlerLogFolder {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        Stack<String> stack = new Stack<>();
        for (String log : logs) {
            if (log.equals("../")) {
                if (stack.size() != 0) {
                    stack.pop();
                }
            } else if (log.equals("./")) {
                //bascically do nothing
            } else {
                stack.push(log);
            }
        }
        System.out.println(stack.size());
    }
}
