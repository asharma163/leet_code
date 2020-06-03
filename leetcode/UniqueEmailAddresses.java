package leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Set<String> set = new HashSet<>();
        for (String mail : emails) {
            int i = mail.indexOf('@');
            String local = mail.substring(0,i);
            String rest = mail.substring(i);
            if (local.contains("+")) local = local.substring(0, local.indexOf('+'));
            local = local.replaceAll("\\.", "");
            String complete = local + rest;
            set.add(complete);
        }
        System.out.println(set.size());
    }
}
