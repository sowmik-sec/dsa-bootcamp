package com.sowmik.arrays.easy;

import java.util.List;

public class CountItemsMatchingARule {
    public static void main(String[] args) {
        //solved it
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ans = 0;
        for (int i = 0; i < items.size(); i++) {
            if(ruleKey.equals("type") && ruleValue.equals(items.get(0).get(0))) {
                ans++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(items.get(1).get(1))) {
                ans++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(items.get(2).get(2))) {
                ans++;
            }
        }
        return ans;
    }
}
