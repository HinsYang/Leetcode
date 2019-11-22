package com.yengchihang.seventeen;

import org.omg.CORBA.StringHolder;

import java.util.*;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public Map<String, String> phone = new HashMap<String, String>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    public static void main(String[] args) {
        Solution solution = new Solution();
        String digits = "23";
        System.out.println(solution.letterCombinations(digits));
    }

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (!digits.isEmpty()){
            backTrack(ans, "", digits);
        }
        return ans;
    }

    //digits不断取第一个sub
    private void backTrack(List<String> ans, String s, String nextDigits) {
        if (!nextDigits.isEmpty()){
            String digits = nextDigits.substring(0,1);
            String word = phone.get(digits);
            for (int j = 0; j < word.length(); j++) {
                backTrack(ans, s + word.charAt(j),nextDigits.substring(1));
            }
        }else {
            ans.add(s);
        }
    }
}
