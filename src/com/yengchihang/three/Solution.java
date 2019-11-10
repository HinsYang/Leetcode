package com.yengchihang.three;

import java.util.*;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str =  "pwwkew";
        System.out.println(solution.lengthOfLongestSubstring(str));
    }

    public int lengthOfLongestSubstring(String s) {
        int size = 0;
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        for (int start = 0, end = 0; end < chars.length; end++) {
            if (map.containsKey(chars[end])){
                //有可能key已经在滑动窗口start外面
                start = Math.max(map.get(chars[end]) + 1, start);
            }
            //下标 - 下标 + 1 = len
            size = Math.max(size, end - start + 1);
            map.put(chars[end], end);
        }
        return size;
    }
}
