package com.yengchihang.five;

/**
 * Created by 恒仔 on 2019/11/1.
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str =  "ac";
        System.out.println(solution.longestPalindrome(str));
    }

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length<= 1){
            return s;
        }
        boolean[][] buf = new boolean[length][length];
        int size = 1;
        String ans = s.substring(0,1);
        for (int r = 1; r < length; r++) {
            char rr = s.charAt(r);
            for (int l = 0; l < r; l++) {
                char lr = s.charAt(l);
                if (lr == rr && ((r - l <=2) || buf[l+1][r-1] == true)){
                    buf[l][r] = true;
                    if (r-l+1 >=size){
                        size = r-l+1;
                        ans = s.substring(l, r+1);
                    }
                }
            }
        }
        return ans;
    }

}
